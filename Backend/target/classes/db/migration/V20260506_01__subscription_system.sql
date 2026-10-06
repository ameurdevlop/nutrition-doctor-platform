-- Create subscription_plans table
CREATE TABLE IF NOT EXISTS subscription_plans (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL, -- ESSENTIEL, AVANCE, EXPERT, TRIAL
    features JSONB NOT NULL DEFAULT '[]',
    monthly_price DECIMAL(10, 2) NOT NULL,
    annual_price DECIMAL(10, 2) NOT NULL,
    is_active BOOLEAN DEFAULT TRUE,
    monthly_consultations INTEGER,
    patients_actifs_max INTEGER,
    niveau_support VARCHAR(100),
    multilingual_support BOOLEAN DEFAULT FALSE,
    multi_device_access BOOLEAN DEFAULT FALSE,
    is_public BOOLEAN DEFAULT TRUE
);

-- Create subscriptions table
CREATE TABLE IF NOT EXISTS subscriptions (
    id SERIAL PRIMARY KEY,
    nutritionist_id INTEGER NOT NULL, -- Managed by Hibernate
    plan_id INTEGER NOT NULL REFERENCES subscription_plans(id),
    billing_cycle VARCHAR(50) NOT NULL, -- MONTHLY, ANNUAL
    status VARCHAR(50) NOT NULL, -- ACTIVE, EXPIRED, PENDING_PAYMENT, CANCELLED
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    monthly_price DECIMAL(10, 2),
    annual_price DECIMAL(10, 2),
    clinic_name VARCHAR(255),
    invoice_email VARCHAR(255),
    monthly_consultations INTEGER,
    niveau_support VARCHAR(100),
    patients_actifs_max INTEGER,
    multilingual_support BOOLEAN,
    multi_device_access BOOLEAN,
    auto_renew BOOLEAN,
    card_holder VARCHAR(255),
    card_number VARCHAR(64),
    card_expiration VARCHAR(16),
    card_cvc VARCHAR(8),
    country VARCHAR(100),
    zip VARCHAR(32),
    features JSONB
);

-- Create payments table
CREATE TABLE IF NOT EXISTS payments (
    id SERIAL PRIMARY KEY,
    subscription_id INTEGER NOT NULL REFERENCES subscriptions(id) ON DELETE CASCADE,
    amount DECIMAL(10, 2) NOT NULL,
    status VARCHAR(50) NOT NULL, -- PENDING, CONFIRMED, REJECTED
    payment_date TIMESTAMP,
    confirmed_by INTEGER, -- Managed by Hibernate
    proof VARCHAR(512), -- File path
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Seed default plans (if they don't exist)
INSERT INTO subscription_plans (name, type, features, monthly_price, annual_price, is_active, monthly_consultations, patients_actifs_max, niveau_support, multilingual_support, multi_device_access)
SELECT 'Essentiel', 'ESSENTIEL', '["DASHBOARD", "PATIENTS", "BOOKINGS", "SETTINGS", "SUPPORT_PAGE"]'::jsonb, 29.99, 299.99, TRUE, 80, 120, 'Moyenne', FALSE, FALSE
WHERE NOT EXISTS (SELECT 1 FROM subscription_plans WHERE type = 'ESSENTIEL');

INSERT INTO subscription_plans (name, type, features, monthly_price, annual_price, is_active, monthly_consultations, patients_actifs_max, niveau_support, multilingual_support, multi_device_access)
SELECT 'Avancé', 'AVANCE', '["DASHBOARD", "PATIENTS", "BOOKINGS", "NUTRITIONAL_MEASUREMENTS", "FILE_MANAGER", "SETTINGS", "SUPPORT_PAGE"]'::jsonb, 59.99, 599.99, TRUE, 120, 200, 'Moyenne', FALSE, FALSE
WHERE NOT EXISTS (SELECT 1 FROM subscription_plans WHERE type = 'AVANCE');

INSERT INTO subscription_plans (name, type, features, monthly_price, annual_price, is_active, monthly_consultations, patients_actifs_max, niveau_support, multilingual_support, multi_device_access)
SELECT 'Expert', 'EXPERT', '["DASHBOARD", "PATIENTS", "BOOKINGS", "NUTRITIONAL_MEASUREMENTS", "FILE_MANAGER", "CHAT_AND_CONSULTATION", "OBJECTIVES", "SETTINGS", "SUPPORT_PAGE"]'::jsonb, 0.00, 0.00, TRUE, 200, 500, 'Haute', TRUE, TRUE
WHERE NOT EXISTS (SELECT 1 FROM subscription_plans WHERE type = 'EXPERT');

-- Ensure constraint allows the new types
DO $$ 
BEGIN 
    IF EXISTS (SELECT 1 FROM pg_constraint WHERE conname = 'subscription_plans_type_check') THEN
        ALTER TABLE subscription_plans DROP CONSTRAINT subscription_plans_type_check;
    END IF;
END $$;
ALTER TABLE subscription_plans ADD CONSTRAINT subscription_plans_type_check CHECK (type IN ('ESSENTIEL', 'AVANCE', 'EXPERT', 'TRIAL'));

INSERT INTO subscription_plans (name, type, features, monthly_price, annual_price, is_active, monthly_consultations, patients_actifs_max, niveau_support, multilingual_support, multi_device_access)
SELECT 'Essai Gratuit', 'TRIAL', '["DASHBOARD", "PATIENTS", "BOOKINGS", "SETTINGS", "SUPPORT_PAGE"]'::jsonb, 0.00, 0.00, TRUE, 50, 50, 'Basse', FALSE, FALSE
WHERE NOT EXISTS (SELECT 1 FROM subscription_plans WHERE name = 'Essai Gratuit');
