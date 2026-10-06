# 🥗 Nutrition Doctor

<p align="center">

## AI-Powered Nutrition Clinic Management Platform

**Plateforme intelligente de gestion de cabinet nutritionnel avec analyse prédictive par Intelligence Artificielle**

</p>

<p align="center">

![Angular](https://img.shields.io/badge/Frontend-Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Backend-Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Python](https://img.shields.io/badge/AI-Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![XGBoost](https://img.shields.io/badge/ML-XGBoost-orange?style=for-the-badge)
![Docker](https://img.shields.io/badge/DevOps-Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Azure](https://img.shields.io/badge/Cloud-Microsoft%20Azure-0078D4?style=for-the-badge&logo=microsoftazure&logoColor=white)

</p>

---

# 📑 Table of Contents

- [📌 Présentation](#-présentation)
- [🎯 Contexte et problématique](#-contexte-et-problématique)
- [💡 Solution proposée](#-solution-proposée)
- [🎯 Objectifs](#-objectifs)
- [👥 Acteurs](#-acteurs)
- [⚙️ Fonctionnalités](#️-fonctionnalités)
- [🏗️ Architecture globale](#️-architecture-globale)
- [🧱 Clean Architecture](#-clean-architecture)
- [🧬 Gestion des données InBody](#-gestion-des-données-inbody)
- [🤖 Intelligence Artificielle](#-intelligence-artificielle)
- [📊 Machine Learning](#-machine-learning)
- [🔎 Explainability avec SHAP](#-explainability-avec-shap)
- [📈 Goal Tracking](#-goal-tracking)
- [🔐 Sécurité](#-sécurité)
- [📅 Méthodologie Scrum](#-méthodologie-scrum)
- [🔄 Flux fonctionnels](#-flux-fonctionnels)
- [☁️ DevOps et Cloud](#️-devops-et-cloud)
- [🐳 Docker](#-docker)
- [🧰 Technologies](#-technologies)
- [📁 Structure du projet](#-structure-du-projet)
- [🔌 API](#-api)
- [🖥️ Installation](#️-installation)
- [🔐 Configuration](#-configuration)
- [📸 Interfaces](#-interfaces)
- [🧪 Tests et qualité](#-tests-et-qualité)
- [🔮 Perspectives](#-perspectives)
- [👨‍💻 Équipe](#-équipe)
- [🎓 Projet de Fin d'Études](#-projet-de-fin-détudes)
- [🏁 Conclusion](#-conclusion)

---

# 📌 Présentation

**Nutrition Doctor** est une plateforme web intelligente destinée à la gestion complète d'un cabinet de nutrition.

Le projet combine une application web moderne, une architecture backend robuste, une base de données relationnelle et un module d'Intelligence Artificielle permettant d'analyser et de prédire l'évolution de certaines métriques liées à la composition corporelle des patients.

La plateforme vise à centraliser les différentes activités d'un cabinet nutritionnel dans un environnement unique :

- 👥 Gestion des patients
- 📅 Gestion des rendez-vous
- 🧬 Suivi de la composition corporelle
- 📊 Import et analyse des données InBody
- 💬 Messagerie
- 📹 Consultations en ligne
- 🔔 Notifications
- 📄 Gestion des documents
- 💳 Gestion des abonnements
- 📈 Tableaux de bord
- 🤖 Analyse prédictive
- 🔎 Explicabilité des prédictions
- ☁️ Déploiement Cloud
- 🐳 Conteneurisation Docker
- 🔄 CI/CD

---

# 🎯 Contexte et problématique

Dans un cabinet de nutrition, plusieurs types de données sont générés quotidiennement :

- informations personnelles des patients ;
- mesures corporelles ;
- historiques InBody ;
- rendez-vous ;
- objectifs ;
- consultations ;
- documents ;
- communications ;
- informations administratives.

Lorsque ces informations sont réparties entre plusieurs outils, le suivi devient plus complexe et les professionnels doivent consacrer davantage de temps aux tâches administratives.

Le projet Nutrition Doctor répond donc à la problématique suivante :

> **Comment concevoir une plateforme intelligente permettant de centraliser la gestion d'un cabinet de nutrition tout en exploitant les données corporelles des patients afin de faciliter le suivi et la prise de décision grâce à l'Intelligence Artificielle ?**

---

# 💡 Solution proposée

Nutrition Doctor propose une architecture centralisée combinant :

```text
                 🥗 NUTRITION DOCTOR
                         │
        ┌────────────────┼────────────────┐
        │                │                │
     Gestion           Analyse            IA
        │                │                │
     Patients          InBody          XGBoost
     Rendez-vous       Historique       SHAP
     Consultations    Dashboard       Prediction
        │                │                │
        └────────────────┼────────────────┘
                         │
                  Architecture
                         │
              Clean Architecture
                         │
                   DevOps / Cloud
                         │
                       Azure
