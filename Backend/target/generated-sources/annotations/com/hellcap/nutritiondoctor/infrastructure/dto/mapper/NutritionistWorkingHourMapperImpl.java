package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.NutritionistWorkingHour;
import com.hellcap.nutritiondoctor.infrastructure.entity.NutritionistEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.NutritionistWorkingHourEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:14+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class NutritionistWorkingHourMapperImpl extends NutritionistWorkingHourMapper {

    @Override
    public NutritionistWorkingHour toModel(NutritionistWorkingHourEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NutritionistWorkingHour nutritionistWorkingHour = new NutritionistWorkingHour();

        nutritionistWorkingHour.setNutritionistId( entityNutritionistId( entity ) );
        nutritionistWorkingHour.setId( entity.getId() );
        nutritionistWorkingHour.setDayOfWeek( entity.getDayOfWeek() );
        nutritionistWorkingHour.setStartTime( entity.getStartTime() );
        nutritionistWorkingHour.setEndTime( entity.getEndTime() );
        nutritionistWorkingHour.setClosed( entity.isClosed() );

        return nutritionistWorkingHour;
    }

    @Override
    public NutritionistWorkingHourEntity toEntity(NutritionistWorkingHour model) {
        if ( model == null ) {
            return null;
        }

        NutritionistWorkingHourEntity nutritionistWorkingHourEntity = new NutritionistWorkingHourEntity();

        nutritionistWorkingHourEntity.setNutritionist( idToNutritionistEntity( model.getNutritionistId() ) );
        nutritionistWorkingHourEntity.setId( model.getId() );
        nutritionistWorkingHourEntity.setDayOfWeek( model.getDayOfWeek() );
        nutritionistWorkingHourEntity.setStartTime( model.getStartTime() );
        nutritionistWorkingHourEntity.setEndTime( model.getEndTime() );
        nutritionistWorkingHourEntity.setClosed( model.isClosed() );

        return nutritionistWorkingHourEntity;
    }

    private int entityNutritionistId(NutritionistWorkingHourEntity nutritionistWorkingHourEntity) {
        if ( nutritionistWorkingHourEntity == null ) {
            return 0;
        }
        NutritionistEntity nutritionist = nutritionistWorkingHourEntity.getNutritionist();
        if ( nutritionist == null ) {
            return 0;
        }
        int id = nutritionist.getId();
        return id;
    }
}
