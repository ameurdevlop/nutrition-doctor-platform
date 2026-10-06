package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Role;
import com.hellcap.nutritiondoctor.domain.models.Secretary;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddSecretaryDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdateSecretaryDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.SecretaryResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.SecretaryEntity;
import java.time.LocalDate;
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
public class SecretaryMapperImpl extends SecretaryMapper {

    @Override
    public SecretaryEntity toEntity(Secretary secretary) {
        if ( secretary == null ) {
            return null;
        }

        SecretaryEntity secretaryEntity = new SecretaryEntity();

        secretaryEntity.setOrigin( secretary.getOrigin() );
        secretaryEntity.setRole( secretary.getRole() );
        secretaryEntity.setName( secretary.getName() );
        secretaryEntity.setLastname( secretary.getLastname() );
        secretaryEntity.setEmail( secretary.getEmail() );
        secretaryEntity.setPassword( secretary.getPassword() );
        secretaryEntity.setGender( secretary.getGender() );
        secretaryEntity.setAge( secretary.getAge() );
        secretaryEntity.setAddress( secretary.getAddress() );
        secretaryEntity.setBirthday( secretary.getBirthday() );
        secretaryEntity.setId( secretary.getId() );
        secretaryEntity.setPhone( secretary.getPhone() );
        secretaryEntity.setVerifiedEmail( secretary.isVerifiedEmail() );
        secretaryEntity.setVerifiedPhone( secretary.isVerifiedPhone() );
        secretaryEntity.setSessionActive( secretary.isSessionActive() );
        secretaryEntity.setAvatar( secretary.getAvatar() );
        secretaryEntity.setHireDate( secretary.getHireDate() );

        return secretaryEntity;
    }

    @Override
    public List<SecretaryEntity> toEntities(List<Secretary> secretaries) {
        if ( secretaries == null ) {
            return null;
        }

        List<SecretaryEntity> list = new ArrayList<SecretaryEntity>( secretaries.size() );
        for ( Secretary secretary : secretaries ) {
            list.add( toEntity( secretary ) );
        }

        return list;
    }

    @Override
    public Secretary toModel(SecretaryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Secretary secretary = new Secretary();

        secretary.setName( entity.getName() );
        secretary.setLastname( entity.getLastname() );
        secretary.setEmail( entity.getEmail() );
        secretary.setPassword( entity.getPassword() );
        secretary.setGender( entity.getGender() );
        if ( entity.getAge() != null ) {
            secretary.setAge( entity.getAge() );
        }
        secretary.setAddress( entity.getAddress() );
        secretary.setBirthday( entity.getBirthday() );
        secretary.setRole( entity.getRole() );
        secretary.setId( entity.getId() );
        secretary.setPhone( entity.getPhone() );
        secretary.setVerifiedEmail( entity.isVerifiedEmail() );
        secretary.setVerifiedPhone( entity.isVerifiedPhone() );
        secretary.setSessionActive( entity.isSessionActive() );
        secretary.setOrigin( entity.getOrigin() );
        secretary.setAvatar( entity.getAvatar() );
        secretary.setHireDate( entity.getHireDate() );

        return secretary;
    }

    @Override
    public Secretary fromAddDto(AddSecretaryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Secretary secretary = new Secretary();

        secretary.setName( dto.name() );
        secretary.setLastname( dto.lastname() );
        secretary.setEmail( dto.email() );
        secretary.setPassword( dto.password() );
        secretary.setGender( dto.gender() );
        secretary.setAddress( dto.address() );
        secretary.setBirthday( dto.birthday() );
        secretary.setPhone( dto.phone() );

        return secretary;
    }

    @Override
    public Secretary fromUpdateDto(UpdateSecretaryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Secretary secretary = new Secretary();

        secretary.setName( dto.name() );
        secretary.setLastname( dto.lastname() );
        secretary.setEmail( dto.email() );
        secretary.setGender( dto.gender() );
        secretary.setAddress( dto.address() );
        secretary.setBirthday( dto.birthday() );
        secretary.setPhone( dto.phone() );

        return secretary;
    }

    @Override
    public List<Secretary> toModels(List<SecretaryEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Secretary> list = new ArrayList<Secretary>( entities.size() );
        for ( SecretaryEntity secretaryEntity : entities ) {
            list.add( toModel( secretaryEntity ) );
        }

        return list;
    }

    @Override
    public SecretaryResponse toResponseDto(Secretary secretary) {
        if ( secretary == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        String lastname = null;
        String email = null;
        String phone = null;
        String gender = null;
        String address = null;
        String birthday = null;
        Role role = null;
        LocalDate hireDate = null;

        id = secretary.getId();
        name = secretary.getName();
        lastname = secretary.getLastname();
        email = secretary.getEmail();
        phone = secretary.getPhone();
        gender = secretary.getGender();
        address = secretary.getAddress();
        birthday = secretary.getBirthday();
        role = secretary.getRole();
        hireDate = secretary.getHireDate();

        Integer nutritionistId = secretary.getNutritionist() != null ? secretary.getNutritionist().getNutritionistId() : null;

        SecretaryResponse secretaryResponse = new SecretaryResponse( id, name, lastname, email, phone, gender, address, birthday, role, hireDate, nutritionistId );

        return secretaryResponse;
    }

    @Override
    public SecretaryResponse toResponseDto(SecretaryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        String lastname = null;
        String email = null;
        String phone = null;
        String gender = null;
        String address = null;
        String birthday = null;
        Role role = null;
        LocalDate hireDate = null;

        id = entity.getId();
        name = entity.getName();
        lastname = entity.getLastname();
        email = entity.getEmail();
        phone = entity.getPhone();
        gender = entity.getGender();
        address = entity.getAddress();
        birthday = entity.getBirthday();
        role = entity.getRole();
        hireDate = entity.getHireDate();

        Integer nutritionistId = entity.getNutritionist() != null ? entity.getNutritionist().getId() : null;

        SecretaryResponse secretaryResponse = new SecretaryResponse( id, name, lastname, email, phone, gender, address, birthday, role, hireDate, nutritionistId );

        return secretaryResponse;
    }

    @Override
    public List<SecretaryResponse> toResponseDtos(List<Secretary> secretaries) {
        if ( secretaries == null ) {
            return null;
        }

        List<SecretaryResponse> list = new ArrayList<SecretaryResponse>( secretaries.size() );
        for ( Secretary secretary : secretaries ) {
            list.add( toResponseDto( secretary ) );
        }

        return list;
    }
}
