package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.SubscriptionFeature;
import com.hellcap.nutritiondoctor.domain.models.SubscriptionPlan;
import com.hellcap.nutritiondoctor.infrastructure.entity.SubscriptionPlanEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class SubscriptionPlanMapperImpl implements SubscriptionPlanMapper {

    @Override
    public SubscriptionPlan toModel(SubscriptionPlanEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SubscriptionPlan subscriptionPlan = new SubscriptionPlan();

        subscriptionPlan.setId( entity.getId() );
        subscriptionPlan.setName( entity.getName() );
        subscriptionPlan.setType( entity.getType() );
        List<SubscriptionFeature> list = entity.getFeatures();
        if ( list != null ) {
            subscriptionPlan.setFeatures( new ArrayList<SubscriptionFeature>( list ) );
        }
        subscriptionPlan.setMonthlyPrice( entity.getMonthlyPrice() );
        subscriptionPlan.setAnnualPrice( entity.getAnnualPrice() );
        subscriptionPlan.setActive( entity.isActive() );
        subscriptionPlan.setPublic( entity.isPublic() );
        subscriptionPlan.setMonthlyConsultations( entity.getMonthlyConsultations() );
        subscriptionPlan.setPatientsActifsMax( entity.getPatientsActifsMax() );
        subscriptionPlan.setNiveauSupport( entity.getNiveauSupport() );
        subscriptionPlan.setMultilingualSupport( entity.getMultilingualSupport() );
        subscriptionPlan.setMultiDeviceAccess( entity.getMultiDeviceAccess() );

        return subscriptionPlan;
    }

    @Override
    public SubscriptionPlanEntity toEntity(SubscriptionPlan model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionPlanEntity subscriptionPlanEntity = new SubscriptionPlanEntity();

        subscriptionPlanEntity.setId( model.getId() );
        subscriptionPlanEntity.setName( model.getName() );
        subscriptionPlanEntity.setType( model.getType() );
        List<SubscriptionFeature> list = model.getFeatures();
        if ( list != null ) {
            subscriptionPlanEntity.setFeatures( new ArrayList<SubscriptionFeature>( list ) );
        }
        subscriptionPlanEntity.setMonthlyPrice( model.getMonthlyPrice() );
        subscriptionPlanEntity.setAnnualPrice( model.getAnnualPrice() );
        subscriptionPlanEntity.setActive( model.isActive() );
        subscriptionPlanEntity.setPublic( model.isPublic() );
        subscriptionPlanEntity.setMonthlyConsultations( model.getMonthlyConsultations() );
        subscriptionPlanEntity.setPatientsActifsMax( model.getPatientsActifsMax() );
        subscriptionPlanEntity.setNiveauSupport( model.getNiveauSupport() );
        subscriptionPlanEntity.setMultilingualSupport( model.getMultilingualSupport() );
        subscriptionPlanEntity.setMultiDeviceAccess( model.getMultiDeviceAccess() );

        return subscriptionPlanEntity;
    }

    @Override
    public List<SubscriptionPlan> toModels(List<SubscriptionPlanEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SubscriptionPlan> list = new ArrayList<SubscriptionPlan>( entities.size() );
        for ( SubscriptionPlanEntity subscriptionPlanEntity : entities ) {
            list.add( toModel( subscriptionPlanEntity ) );
        }

        return list;
    }
}
