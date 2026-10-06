package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Nutritionist;
import com.hellcap.nutritiondoctor.domain.models.Patient;
import com.hellcap.nutritiondoctor.domain.models.Role;
import com.hellcap.nutritiondoctor.domain.models.Secretary;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddNutritionistDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdateNutritionistDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.NutritionistResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.NutritionistEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.PatientEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.SecretaryEntity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:13+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class NutritionistMapperImpl extends NutritionistMapper {

    @Autowired
    private SecretaryMapper secretaryMapper;

    @Override
    public NutritionistEntity toEntity(Nutritionist nutritionist) {
        if ( nutritionist == null ) {
            return null;
        }

        NutritionistEntity nutritionistEntity = new NutritionistEntity();

        nutritionistEntity.setOrigin( nutritionist.getOrigin() );
        nutritionistEntity.setRole( nutritionist.getRole() );
        nutritionistEntity.setName( nutritionist.getName() );
        nutritionistEntity.setLastname( nutritionist.getLastname() );
        nutritionistEntity.setEmail( nutritionist.getEmail() );
        nutritionistEntity.setPassword( nutritionist.getPassword() );
        nutritionistEntity.setGender( nutritionist.getGender() );
        nutritionistEntity.setAge( nutritionist.getAge() );
        nutritionistEntity.setAddress( nutritionist.getAddress() );
        nutritionistEntity.setId( nutritionist.getId() );
        nutritionistEntity.setVerifiedEmail( nutritionist.isVerifiedEmail() );
        nutritionistEntity.setVerifiedPhone( nutritionist.isVerifiedPhone() );
        nutritionistEntity.setSessionActive( nutritionist.isSessionActive() );
        nutritionistEntity.setAvatar( nutritionist.getAvatar() );
        nutritionistEntity.setPhone( nutritionist.getPhone() );
        nutritionistEntity.setBirthday( nutritionist.getBirthday() );
        nutritionistEntity.setNutritionistId( nutritionist.getNutritionistId() );
        nutritionistEntity.setSpecialization( nutritionist.getSpecialization() );
        nutritionistEntity.setYearsExperience( nutritionist.getYearsExperience() );
        nutritionistEntity.setCertification( nutritionist.getCertification() );
        nutritionistEntity.setLicenseNumber( nutritionist.getLicenseNumber() );
        nutritionistEntity.setEducation( nutritionist.getEducation() );
        nutritionistEntity.setPatients( patientSetToPatientEntitySet( nutritionist.getPatients() ) );
        nutritionistEntity.setAboutMe( nutritionist.getAboutMe() );

        return nutritionistEntity;
    }

    @Override
    public Nutritionist toModel(NutritionistEntity nutritionistEntity) {
        if ( nutritionistEntity == null ) {
            return null;
        }

        Nutritionist nutritionist = new Nutritionist();

        nutritionist.setLastname( nutritionistEntity.getLastname() );
        nutritionist.setPassword( nutritionistEntity.getPassword() );
        nutritionist.setGender( nutritionistEntity.getGender() );
        if ( nutritionistEntity.getAge() != null ) {
            nutritionist.setAge( nutritionistEntity.getAge() );
        }
        nutritionist.setAddress( nutritionistEntity.getAddress() );
        nutritionist.setBirthday( nutritionistEntity.getBirthday() );
        nutritionist.setRole( nutritionistEntity.getRole() );
        nutritionist.setId( nutritionistEntity.getId() );
        nutritionist.setVerifiedEmail( nutritionistEntity.isVerifiedEmail() );
        nutritionist.setVerifiedPhone( nutritionistEntity.isVerifiedPhone() );
        nutritionist.setSessionActive( nutritionistEntity.isSessionActive() );
        nutritionist.setOrigin( nutritionistEntity.getOrigin() );
        nutritionist.setAvatar( nutritionistEntity.getAvatar() );
        nutritionist.setNutritionistId( nutritionistEntity.getNutritionistId() );
        nutritionist.setSpecialization( nutritionistEntity.getSpecialization() );
        nutritionist.setName( nutritionistEntity.getName() );
        nutritionist.setEmail( nutritionistEntity.getEmail() );
        nutritionist.setYearsExperience( nutritionistEntity.getYearsExperience() );
        nutritionist.setCertification( nutritionistEntity.getCertification() );
        nutritionist.setLicenseNumber( nutritionistEntity.getLicenseNumber() );
        nutritionist.setEducation( nutritionistEntity.getEducation() );
        nutritionist.setPhone( nutritionistEntity.getPhone() );
        nutritionist.setPatients( patientEntitySetToPatientSet( nutritionistEntity.getPatients() ) );
        nutritionist.setSecretaries( secretaryEntitySetToSecretarySet( nutritionistEntity.getSecretaries() ) );
        nutritionist.setAboutMe( nutritionistEntity.getAboutMe() );

        return nutritionist;
    }

    @Override
    public List<Nutritionist> toModels(List<NutritionistEntity> nutritionistEntities) {
        if ( nutritionistEntities == null ) {
            return null;
        }

        List<Nutritionist> list = new ArrayList<Nutritionist>( nutritionistEntities.size() );
        for ( NutritionistEntity nutritionistEntity : nutritionistEntities ) {
            list.add( toModel( nutritionistEntity ) );
        }

        return list;
    }

    @Override
    public Nutritionist fromAddDto(AddNutritionistDto addNutritionistDto) {
        if ( addNutritionistDto == null ) {
            return null;
        }

        Nutritionist nutritionist = new Nutritionist();

        nutritionist.setLastname( addNutritionistDto.lastname() );
        nutritionist.setPassword( addNutritionistDto.password() );
        nutritionist.setGender( addNutritionistDto.gender() );
        nutritionist.setAge( addNutritionistDto.age() );
        nutritionist.setAddress( addNutritionistDto.address() );
        nutritionist.setBirthday( addNutritionistDto.birthday() );
        nutritionist.setOrigin( addNutritionistDto.origin() );
        nutritionist.setSpecialization( addNutritionistDto.specialization() );
        nutritionist.setName( addNutritionistDto.name() );
        nutritionist.setEmail( addNutritionistDto.email() );
        nutritionist.setYearsExperience( addNutritionistDto.yearsExperience() );
        nutritionist.setCertification( addNutritionistDto.certification() );
        nutritionist.setLicenseNumber( addNutritionistDto.licenseNumber() );
        nutritionist.setEducation( addNutritionistDto.education() );
        nutritionist.setPhone( addNutritionistDto.phone() );

        return nutritionist;
    }

    @Override
    public Nutritionist fromUpdateDto(UpdateNutritionistDto updateNutritionistDto) {
        if ( updateNutritionistDto == null ) {
            return null;
        }

        Nutritionist nutritionist = new Nutritionist();

        nutritionist.setLastname( updateNutritionistDto.lastname() );
        nutritionist.setGender( updateNutritionistDto.gender() );
        nutritionist.setAge( updateNutritionistDto.age() );
        nutritionist.setAddress( updateNutritionistDto.address() );
        nutritionist.setBirthday( updateNutritionistDto.birthday() );
        nutritionist.setOrigin( updateNutritionistDto.origin() );
        nutritionist.setAvatar( updateNutritionistDto.avatar() );
        nutritionist.setSpecialization( updateNutritionistDto.specialization() );
        nutritionist.setName( updateNutritionistDto.name() );
        nutritionist.setEmail( updateNutritionistDto.email() );
        nutritionist.setYearsExperience( updateNutritionistDto.yearsExperience() );
        nutritionist.setCertification( updateNutritionistDto.certification() );
        nutritionist.setLicenseNumber( updateNutritionistDto.licenseNumber() );
        nutritionist.setEducation( updateNutritionistDto.education() );
        nutritionist.setPhone( updateNutritionistDto.phone() );
        nutritionist.setAboutMe( updateNutritionistDto.aboutMe() );

        return nutritionist;
    }

    @Override
    public NutritionistResponse toResponseDto(Nutritionist nutritionist) {
        if ( nutritionist == null ) {
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
        String specialization = null;
        int yearsExperience = 0;
        String certification = null;
        String education = null;
        String aboutMe = null;

        id = nutritionist.getId();
        name = nutritionist.getName();
        lastname = nutritionist.getLastname();
        email = nutritionist.getEmail();
        gender = nutritionist.getGender();
        age = nutritionist.getAge();
        phone = nutritionist.getPhone();
        address = nutritionist.getAddress();
        birthday = nutritionist.getBirthday();
        role = nutritionist.getRole();
        avatar = nutritionist.getAvatar();
        specialization = nutritionist.getSpecialization();
        yearsExperience = nutritionist.getYearsExperience();
        certification = nutritionist.getCertification();
        education = nutritionist.getEducation();
        aboutMe = nutritionist.getAboutMe();

        NutritionistResponse nutritionistResponse = new NutritionistResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar, specialization, yearsExperience, certification, education, aboutMe );

        return nutritionistResponse;
    }

    @Override
    public NutritionistResponse toResponseDto(NutritionistEntity nutritionistEntity) {
        if ( nutritionistEntity == null ) {
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
        String specialization = null;
        int yearsExperience = 0;
        String certification = null;
        String education = null;
        String aboutMe = null;

        id = nutritionistEntity.getId();
        name = nutritionistEntity.getName();
        lastname = nutritionistEntity.getLastname();
        email = nutritionistEntity.getEmail();
        gender = nutritionistEntity.getGender();
        if ( nutritionistEntity.getAge() != null ) {
            age = nutritionistEntity.getAge();
        }
        phone = nutritionistEntity.getPhone();
        address = nutritionistEntity.getAddress();
        birthday = nutritionistEntity.getBirthday();
        role = nutritionistEntity.getRole();
        avatar = nutritionistEntity.getAvatar();
        specialization = nutritionistEntity.getSpecialization();
        yearsExperience = nutritionistEntity.getYearsExperience();
        certification = nutritionistEntity.getCertification();
        education = nutritionistEntity.getEducation();
        aboutMe = nutritionistEntity.getAboutMe();

        NutritionistResponse nutritionistResponse = new NutritionistResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar, specialization, yearsExperience, certification, education, aboutMe );

        return nutritionistResponse;
    }

    @Override
    public List<NutritionistResponse> toResponseDtos(List<Nutritionist> nutritionists) {
        if ( nutritionists == null ) {
            return null;
        }

        List<NutritionistResponse> list = new ArrayList<NutritionistResponse>( nutritionists.size() );
        for ( Nutritionist nutritionist : nutritionists ) {
            list.add( toResponseDto( nutritionist ) );
        }

        return list;
    }

    protected PatientEntity patientToPatientEntity(Patient patient) {
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

    protected Set<PatientEntity> patientSetToPatientEntitySet(Set<Patient> set) {
        if ( set == null ) {
            return null;
        }

        Set<PatientEntity> set1 = new LinkedHashSet<PatientEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Patient patient : set ) {
            set1.add( patientToPatientEntity( patient ) );
        }

        return set1;
    }

    protected Patient patientEntityToPatient(PatientEntity patientEntity) {
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

    protected Set<Patient> patientEntitySetToPatientSet(Set<PatientEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Patient> set1 = new LinkedHashSet<Patient>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PatientEntity patientEntity : set ) {
            set1.add( patientEntityToPatient( patientEntity ) );
        }

        return set1;
    }

    protected Set<Secretary> secretaryEntitySetToSecretarySet(Set<SecretaryEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Secretary> set1 = new LinkedHashSet<Secretary>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( SecretaryEntity secretaryEntity : set ) {
            set1.add( secretaryMapper.toModel( secretaryEntity ) );
        }

        return set1;
    }
}
