package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Patient;
import com.hellcap.nutritiondoctor.domain.models.Role;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddDraftPatientDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddPatientDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdatePatientDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.PatientResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.PatientEntity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:14+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class PatientMapperImpl extends PatientMapper {

    @Override
    public PatientEntity toEntity(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientEntity patientEntity = new PatientEntity();

        patientEntity.setOrigin( patient.getOrigin() );
        patientEntity.setRole( patient.getRole() );
        patientEntity.setGender( patient.getGender() );
        patientEntity.setAge( patient.getAge() );
        patientEntity.setAddress( patient.getAddress() );
        patientEntity.setBirthday( patient.getBirthday() );
        patientEntity.setId( patient.getId() );
        patientEntity.setVerifiedEmail( patient.isVerifiedEmail() );
        patientEntity.setVerifiedPhone( patient.isVerifiedPhone() );
        patientEntity.setSessionActive( patient.isSessionActive() );
        patientEntity.setAvatar( patient.getAvatar() );
        patientEntity.setPatientId( patient.getPatientId() );
        patientEntity.setPhone( patient.getPhone() );
        patientEntity.setPassword( patient.getPassword() );
        patientEntity.setName( patient.getName() );
        patientEntity.setLastname( patient.getLastname() );
        patientEntity.setEmail( patient.getEmail() );
        patientEntity.setFileNumber( patient.getFileNumber() );
        patientEntity.setIntellectualLevel( patient.getIntellectualLevel() );
        patientEntity.setProfession( patient.getProfession() );
        patientEntity.setFamilySituation( patient.getFamilySituation() );
        patientEntity.setFamilyHistory( patient.getFamilyHistory() );
        patientEntity.setAllergy( patient.getAllergy() );
        patientEntity.setOtherDisease( patient.getOtherDisease() );
        patientEntity.setSleepDisorder( patient.getSleepDisorder() );
        patientEntity.setSmoking( patient.isSmoking() );
        patientEntity.setSmokingQuantity( patient.getSmokingQuantity() );
        patientEntity.setSmokingStartAge( patient.getSmokingStartAge() );
        patientEntity.setSmokingCessation( patient.isSmokingCessation() );
        patientEntity.setSmokingCessationAge( patient.getSmokingCessationAge() );
        patientEntity.setAlcoholConsumption( patient.isAlcoholConsumption() );
        patientEntity.setAlcoholCessation( patient.isAlcoholCessation() );
        patientEntity.setUsualWeight( patient.getUsualWeight() );
        patientEntity.setPhysicalActivityLevel( patient.getPhysicalActivityLevel() );
        patientEntity.setWaterIntake( patient.getWaterIntake() );
        patientEntity.setOilUsed( patient.getOilUsed() );
        patientEntity.setPortalAccessEnabled( patient.isPortalAccessEnabled() );

        return patientEntity;
    }

    @Override
    public List<PatientEntity> toEntities(List<Patient> patient) {
        if ( patient == null ) {
            return null;
        }

        List<PatientEntity> list = new ArrayList<PatientEntity>( patient.size() );
        for ( Patient patient1 : patient ) {
            list.add( toEntity( patient1 ) );
        }

        return list;
    }

    @Override
    public Patient toModel(PatientEntity patientEntity) {
        if ( patientEntity == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setPassword( patientEntity.getPassword() );
        patient.setGender( patientEntity.getGender() );
        if ( patientEntity.getAge() != null ) {
            patient.setAge( patientEntity.getAge() );
        }
        patient.setAddress( patientEntity.getAddress() );
        patient.setBirthday( patientEntity.getBirthday() );
        patient.setRole( patientEntity.getRole() );
        patient.setId( patientEntity.getId() );
        patient.setVerifiedEmail( patientEntity.isVerifiedEmail() );
        patient.setVerifiedPhone( patientEntity.isVerifiedPhone() );
        patient.setSessionActive( patientEntity.isSessionActive() );
        patient.setOrigin( patientEntity.getOrigin() );
        patient.setAvatar( patientEntity.getAvatar() );
        patient.setFileNumber( patientEntity.getFileNumber() );
        patient.setIntellectualLevel( patientEntity.getIntellectualLevel() );
        patient.setProfession( patientEntity.getProfession() );
        patient.setFamilySituation( patientEntity.getFamilySituation() );
        patient.setFamilyHistory( patientEntity.getFamilyHistory() );
        patient.setAllergy( patientEntity.getAllergy() );
        patient.setOtherDisease( patientEntity.getOtherDisease() );
        patient.setSleepDisorder( patientEntity.getSleepDisorder() );
        patient.setSmoking( patientEntity.isSmoking() );
        patient.setSmokingQuantity( patientEntity.getSmokingQuantity() );
        patient.setSmokingStartAge( patientEntity.getSmokingStartAge() );
        patient.setSmokingCessation( patientEntity.isSmokingCessation() );
        patient.setSmokingCessationAge( patientEntity.getSmokingCessationAge() );
        patient.setAlcoholConsumption( patientEntity.isAlcoholConsumption() );
        patient.setAlcoholCessation( patientEntity.isAlcoholCessation() );
        patient.setUsualWeight( patientEntity.getUsualWeight() );
        patient.setPhysicalActivityLevel( patientEntity.getPhysicalActivityLevel() );
        patient.setWaterIntake( patientEntity.getWaterIntake() );
        patient.setOilUsed( patientEntity.getOilUsed() );
        patient.setPhone( patientEntity.getPhone() );
        patient.setName( patientEntity.getName() );
        patient.setLastname( patientEntity.getLastname() );
        patient.setEmail( patientEntity.getEmail() );
        patient.setPortalAccessEnabled( patientEntity.isPortalAccessEnabled() );

        return patient;
    }

    @Override
    public Patient fromAddDto(AddPatientDto addPatientDto) {
        if ( addPatientDto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setPassword( addPatientDto.password() );
        patient.setGender( addPatientDto.gender() );
        patient.setAge( addPatientDto.age() );
        patient.setAddress( addPatientDto.address() );
        patient.setBirthday( addPatientDto.birthday() );
        patient.setOrigin( addPatientDto.origin() );
        patient.setAvatar( addPatientDto.avatar() );
        patient.setFileNumber( addPatientDto.fileNumber() );
        patient.setPhone( addPatientDto.phone() );
        patient.setName( addPatientDto.name() );
        patient.setLastname( addPatientDto.lastname() );
        patient.setEmail( addPatientDto.email() );

        return patient;
    }

    @Override
    public Patient fromDraftDto(AddDraftPatientDto addDraftPatientDto) {
        if ( addDraftPatientDto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setPhone( addDraftPatientDto.phone() );
        patient.setName( addDraftPatientDto.name() );
        patient.setLastname( addDraftPatientDto.lastname() );
        patient.setEmail( addDraftPatientDto.email() );

        return patient;
    }

    @Override
    public Patient fromUpdateDto(UpdatePatientDto updatePatientDto) {
        if ( updatePatientDto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setGender( updatePatientDto.gender() );
        patient.setAge( updatePatientDto.age() );
        patient.setAddress( updatePatientDto.address() );
        patient.setBirthday( updatePatientDto.birthday() );
        patient.setOrigin( updatePatientDto.origin() );
        patient.setAvatar( updatePatientDto.avatar() );
        patient.setFileNumber( updatePatientDto.fileNumber() );
        patient.setIntellectualLevel( updatePatientDto.intellectualLevel() );
        patient.setProfession( updatePatientDto.profession() );
        patient.setFamilySituation( updatePatientDto.familySituation() );
        patient.setFamilyHistory( updatePatientDto.familyHistory() );
        patient.setAllergy( updatePatientDto.allergy() );
        patient.setOtherDisease( updatePatientDto.otherDisease() );
        patient.setSleepDisorder( updatePatientDto.sleepDisorder() );
        patient.setSmoking( updatePatientDto.smoking() );
        patient.setSmokingQuantity( updatePatientDto.smokingQuantity() );
        patient.setSmokingStartAge( updatePatientDto.smokingStartAge() );
        patient.setSmokingCessation( updatePatientDto.smokingCessation() );
        patient.setSmokingCessationAge( updatePatientDto.smokingCessationAge() );
        patient.setAlcoholConsumption( updatePatientDto.alcoholConsumption() );
        patient.setAlcoholCessation( updatePatientDto.alcoholCessation() );
        patient.setUsualWeight( updatePatientDto.usualWeight() );
        patient.setPhysicalActivityLevel( updatePatientDto.physicalActivityLevel() );
        patient.setWaterIntake( updatePatientDto.waterIntake() );
        patient.setOilUsed( updatePatientDto.oilUsed() );
        patient.setPhone( updatePatientDto.phone() );
        patient.setName( updatePatientDto.name() );
        patient.setLastname( updatePatientDto.lastname() );
        patient.setEmail( updatePatientDto.email() );

        return patient;
    }

    @Override
    public List<Patient> toModels(List<PatientEntity> all) {
        if ( all == null ) {
            return null;
        }

        List<Patient> list = new ArrayList<Patient>( all.size() );
        for ( PatientEntity patientEntity : all ) {
            list.add( toModel( patientEntity ) );
        }

        return list;
    }

    @Override
    public Set<Patient> toSetModels(Set<PatientEntity> all) {
        if ( all == null ) {
            return null;
        }

        Set<Patient> set = new LinkedHashSet<Patient>( Math.max( (int) ( all.size() / .75f ) + 1, 16 ) );
        for ( PatientEntity patientEntity : all ) {
            set.add( toModel( patientEntity ) );
        }

        return set;
    }

    @Override
    public PatientResponse toResponseDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        String lastname = null;
        String email = null;
        String gender = null;
        int age = 0;
        String phone = null;
        String address = null;
        String birthday = null;
        Role role = null;
        String avatar = null;
        int fileNumber = 0;
        String profession = null;
        boolean portalAccessEnabled = false;
        boolean verifiedEmail = false;

        id = patient.getId();
        name = patient.getName();
        lastname = patient.getLastname();
        email = patient.getEmail();
        gender = patient.getGender();
        age = patient.getAge();
        phone = patient.getPhone();
        address = patient.getAddress();
        birthday = patient.getBirthday();
        role = patient.getRole();
        avatar = patient.getAvatar();
        fileNumber = patient.getFileNumber();
        profession = patient.getProfession();
        portalAccessEnabled = patient.isPortalAccessEnabled();
        verifiedEmail = patient.isVerifiedEmail();

        PatientResponse patientResponse = new PatientResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar, fileNumber, profession, portalAccessEnabled, verifiedEmail );

        return patientResponse;
    }

    @Override
    public PatientResponse toResponseDto(PatientEntity patientEntity) {
        if ( patientEntity == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        String lastname = null;
        String email = null;
        String gender = null;
        int age = 0;
        String phone = null;
        String address = null;
        String birthday = null;
        Role role = null;
        String avatar = null;
        int fileNumber = 0;
        String profession = null;
        boolean portalAccessEnabled = false;
        boolean verifiedEmail = false;

        id = patientEntity.getId();
        name = patientEntity.getName();
        lastname = patientEntity.getLastname();
        email = patientEntity.getEmail();
        gender = patientEntity.getGender();
        if ( patientEntity.getAge() != null ) {
            age = patientEntity.getAge();
        }
        phone = patientEntity.getPhone();
        address = patientEntity.getAddress();
        birthday = patientEntity.getBirthday();
        role = patientEntity.getRole();
        avatar = patientEntity.getAvatar();
        fileNumber = patientEntity.getFileNumber();
        profession = patientEntity.getProfession();
        portalAccessEnabled = patientEntity.isPortalAccessEnabled();
        verifiedEmail = patientEntity.isVerifiedEmail();

        PatientResponse patientResponse = new PatientResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar, fileNumber, profession, portalAccessEnabled, verifiedEmail );

        return patientResponse;
    }

    @Override
    public List<PatientResponse> toResponseDtos(List<Patient> patients) {
        if ( patients == null ) {
            return null;
        }

        List<PatientResponse> list = new ArrayList<PatientResponse>( patients.size() );
        for ( Patient patient : patients ) {
            list.add( toResponseDto( patient ) );
        }

        return list;
    }

    @Override
    public Set<PatientResponse> toResponseDtoSet(Set<Patient> patients) {
        if ( patients == null ) {
            return null;
        }

        Set<PatientResponse> set = new LinkedHashSet<PatientResponse>( Math.max( (int) ( patients.size() / .75f ) + 1, 16 ) );
        for ( Patient patient : patients ) {
            set.add( toResponseDto( patient ) );
        }

        return set;
    }
}
