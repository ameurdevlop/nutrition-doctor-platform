package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.SupportRequest;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddSupportRequestDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdateSupportRequestDto;
import com.hellcap.nutritiondoctor.infrastructure.entity.NutritionistEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.SupportRequestEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:14+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class SupportRequestMapperImpl extends SupportRequestMapper {

    @Override
    public SupportRequest toModel(SupportRequestEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SupportRequest supportRequest = new SupportRequest();

        supportRequest.setNutritionistId( entityNutritionistId( entity ) );
        supportRequest.setEmail( entity.getEmail() );
        supportRequest.setId( entity.getId() );
        supportRequest.setSubject( entity.getSubject() );
        supportRequest.setMessage( entity.getMessage() );
        supportRequest.setStatus( entity.getStatus() );
        supportRequest.setReplyMessage( entity.getReplyMessage() );
        supportRequest.setCreatedAt( entity.getCreatedAt() );

        return supportRequest;
    }

    @Override
    public List<SupportRequest> toModels(List<SupportRequestEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SupportRequest> list = new ArrayList<SupportRequest>( entities.size() );
        for ( SupportRequestEntity supportRequestEntity : entities ) {
            list.add( toModel( supportRequestEntity ) );
        }

        return list;
    }

    @Override
    public SupportRequestEntity toEntity(SupportRequest model) {
        if ( model == null ) {
            return null;
        }

        SupportRequestEntity supportRequestEntity = new SupportRequestEntity();

        supportRequestEntity.setEmail( model.getEmail() );
        supportRequestEntity.setSubject( model.getSubject() );
        supportRequestEntity.setMessage( model.getMessage() );
        supportRequestEntity.setStatus( model.getStatus() );
        supportRequestEntity.setReplyMessage( model.getReplyMessage() );

        return supportRequestEntity;
    }

    @Override
    public SupportRequest fromAddDto(AddSupportRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        SupportRequest supportRequest = new SupportRequest();

        supportRequest.setEmail( dto.getEmail() );
        supportRequest.setNutritionistId( dto.getNutritionistId() );
        supportRequest.setSubject( dto.getSubject() );
        supportRequest.setMessage( dto.getMessage() );

        return supportRequest;
    }

    @Override
    public SupportRequest fromUpdateDto(UpdateSupportRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        SupportRequest supportRequest = new SupportRequest();

        supportRequest.setStatus( dto.getStatus() );
        supportRequest.setNutritionistId( dto.getNutritionistId() );
        supportRequest.setSubject( dto.getSubject() );
        supportRequest.setMessage( dto.getMessage() );
        supportRequest.setReplyMessage( dto.getReplyMessage() );

        return supportRequest;
    }

    private Integer entityNutritionistId(SupportRequestEntity supportRequestEntity) {
        if ( supportRequestEntity == null ) {
            return null;
        }
        NutritionistEntity nutritionist = supportRequestEntity.getNutritionist();
        if ( nutritionist == null ) {
            return null;
        }
        int id = nutritionist.getId();
        return id;
    }
}
