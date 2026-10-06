package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Subscription;
import com.hellcap.nutritiondoctor.domain.models.SubscriptionFeature;
import com.hellcap.nutritiondoctor.infrastructure.entity.NutritionistEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.SubscriptionEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class SubscriptionMapperImpl implements SubscriptionMapper {

    @Autowired
    private SubscriptionPlanMapper subscriptionPlanMapper;

    @Override
    public Subscription toModel(SubscriptionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Subscription subscription = new Subscription();

        subscription.setNutritionistId( entityNutritionistId( entity ) );
        subscription.setId( entity.getId() );
        subscription.setPlan( subscriptionPlanMapper.toModel( entity.getPlan() ) );
        subscription.setBillingCycle( entity.getBillingCycle() );
        subscription.setStatus( entity.getStatus() );
        subscription.setStartDate( entity.getStartDate() );
        subscription.setEndDate( entity.getEndDate() );
        subscription.setMonthlyPrice( entity.getMonthlyPrice() );
        subscription.setAnnualPrice( entity.getAnnualPrice() );
        subscription.setClinicName( entity.getClinicName() );
        subscription.setInvoiceEmail( entity.getInvoiceEmail() );
        subscription.setMonthlyConsultations( entity.getMonthlyConsultations() );
        subscription.setNiveauSupport( entity.getNiveauSupport() );
        subscription.setPatientsActifsMax( entity.getPatientsActifsMax() );
        subscription.setMultilingualSupport( entity.getMultilingualSupport() );
        subscription.setMultiDeviceAccess( entity.getMultiDeviceAccess() );
        subscription.setAutoRenew( entity.getAutoRenew() );
        subscription.setCardHolder( entity.getCardHolder() );
        subscription.setCardNumber( entity.getCardNumber() );
        subscription.setCardExpiration( entity.getCardExpiration() );
        subscription.setCardCVC( entity.getCardCVC() );
        subscription.setCountry( entity.getCountry() );
        subscription.setZip( entity.getZip() );
        subscription.setStandingOrderFile( entity.getStandingOrderFile() );
        List<SubscriptionFeature> list = entity.getFeatures();
        if ( list != null ) {
            subscription.setFeatures( new ArrayList<SubscriptionFeature>( list ) );
        }

        return subscription;
    }

    @Override
    public SubscriptionEntity toEntity(Subscription model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionEntity subscriptionEntity = new SubscriptionEntity();

        subscriptionEntity.setId( model.getId() );
        subscriptionEntity.setPlan( subscriptionPlanMapper.toEntity( model.getPlan() ) );
        subscriptionEntity.setBillingCycle( model.getBillingCycle() );
        subscriptionEntity.setStatus( model.getStatus() );
        subscriptionEntity.setStartDate( model.getStartDate() );
        subscriptionEntity.setEndDate( model.getEndDate() );
        subscriptionEntity.setMonthlyPrice( model.getMonthlyPrice() );
        subscriptionEntity.setAnnualPrice( model.getAnnualPrice() );
        subscriptionEntity.setClinicName( model.getClinicName() );
        subscriptionEntity.setInvoiceEmail( model.getInvoiceEmail() );
        subscriptionEntity.setMonthlyConsultations( model.getMonthlyConsultations() );
        subscriptionEntity.setNiveauSupport( model.getNiveauSupport() );
        subscriptionEntity.setPatientsActifsMax( model.getPatientsActifsMax() );
        subscriptionEntity.setMultilingualSupport( model.getMultilingualSupport() );
        subscriptionEntity.setMultiDeviceAccess( model.getMultiDeviceAccess() );
        subscriptionEntity.setAutoRenew( model.getAutoRenew() );
        subscriptionEntity.setCardHolder( model.getCardHolder() );
        subscriptionEntity.setCardNumber( model.getCardNumber() );
        subscriptionEntity.setCardExpiration( model.getCardExpiration() );
        subscriptionEntity.setCardCVC( model.getCardCVC() );
        subscriptionEntity.setCountry( model.getCountry() );
        subscriptionEntity.setZip( model.getZip() );
        subscriptionEntity.setStandingOrderFile( model.getStandingOrderFile() );
        List<SubscriptionFeature> list = model.getFeatures();
        if ( list != null ) {
            subscriptionEntity.setFeatures( new ArrayList<SubscriptionFeature>( list ) );
        }

        return subscriptionEntity;
    }

    @Override
    public List<Subscription> toModels(List<SubscriptionEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Subscription> list = new ArrayList<Subscription>( entities.size() );
        for ( SubscriptionEntity subscriptionEntity : entities ) {
            list.add( toModel( subscriptionEntity ) );
        }

        return list;
    }

    private int entityNutritionistId(SubscriptionEntity subscriptionEntity) {
        if ( subscriptionEntity == null ) {
            return 0;
        }
        NutritionistEntity nutritionist = subscriptionEntity.getNutritionist();
        if ( nutritionist == null ) {
            return 0;
        }
        int id = nutritionist.getId();
        return id;
    }
}
