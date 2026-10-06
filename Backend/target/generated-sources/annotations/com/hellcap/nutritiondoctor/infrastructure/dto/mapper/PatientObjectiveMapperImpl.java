package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Objective;
import com.hellcap.nutritiondoctor.domain.models.Patient;
import com.hellcap.nutritiondoctor.domain.models.PatientObjective;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdatePatientObjectiveDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.PatientObjectiveResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.ObjectiveEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.PatientObjectiveEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:14+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class PatientObjectiveMapperImpl extends PatientObjectiveMapper {

    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private ObjectiveMapper objectiveMapper;

    @Override
    public List<PatientObjectiveEntity> toEntities(List<PatientObjective> patientObjectives) {
        if ( patientObjectives == null ) {
            return null;
        }

        List<PatientObjectiveEntity> list = new ArrayList<PatientObjectiveEntity>( patientObjectives.size() );
        for ( PatientObjective patientObjective : patientObjectives ) {
            list.add( toEntity( patientObjective ) );
        }

        return list;
    }

    @Override
    public List<PatientObjective> toModels(List<PatientObjectiveEntity> patientObjectives) {
        if ( patientObjectives == null ) {
            return null;
        }

        List<PatientObjective> list = new ArrayList<PatientObjective>( patientObjectives.size() );
        for ( PatientObjectiveEntity patientObjectiveEntity : patientObjectives ) {
            list.add( toModel( patientObjectiveEntity ) );
        }

        return list;
    }

    @Override
    public PatientObjectiveEntity toEntity(PatientObjective patientObjective) {
        if ( patientObjective == null ) {
            return null;
        }

        PatientObjectiveEntity patientObjectiveEntity = new PatientObjectiveEntity();

        patientObjectiveEntity.setPatientEntity( patientMapper.toEntity( patientObjective.getPatient() ) );
        patientObjectiveEntity.setObjectiveEntity( objectiveMapper.toEntity( patientObjective.getObjective() ) );
        patientObjectiveEntity.setId( patientObjective.getId() );
        patientObjectiveEntity.setStartDate( patientObjective.getStartDate() );
        patientObjectiveEntity.setEndDate( patientObjective.getEndDate() );
        patientObjectiveEntity.setCompleted( patientObjective.isCompleted() );
        patientObjectiveEntity.setPriority( patientObjective.getPriority() );

        return patientObjectiveEntity;
    }

    @Override
    public PatientObjective toModel(PatientObjectiveEntity patientObjectiveEntity) {
        if ( patientObjectiveEntity == null ) {
            return null;
        }

        Patient patient = null;
        Objective objective = null;
        Integer id = null;
        Date startDate = null;
        Date endDate = null;
        boolean completed = false;
        int priority = 0;

        patient = patientMapper.toModel( patientObjectiveEntity.getPatientEntity() );
        objective = objectiveMapper.toModel( patientObjectiveEntity.getObjectiveEntity() );
        id = patientObjectiveEntity.getId();
        startDate = patientObjectiveEntity.getStartDate();
        endDate = patientObjectiveEntity.getEndDate();
        completed = patientObjectiveEntity.isCompleted();
        priority = patientObjectiveEntity.getPriority();

        PatientObjective patientObjective = new PatientObjective( id, patient, objective, startDate, endDate, completed, priority );

        return patientObjective;
    }

    @Override
    public PatientObjective fromUpdateDto(UpdatePatientObjectiveDto updatePatientObjectiveDto) {
        if ( updatePatientObjectiveDto == null ) {
            return null;
        }

        Date startDate = null;
        Date endDate = null;
        boolean completed = false;
        int priority = 0;

        startDate = updatePatientObjectiveDto.startDate();
        endDate = updatePatientObjectiveDto.endDate();
        if ( updatePatientObjectiveDto.completed() != null ) {
            completed = updatePatientObjectiveDto.completed();
        }
        if ( updatePatientObjectiveDto.priority() != null ) {
            priority = updatePatientObjectiveDto.priority();
        }

        Integer id = null;
        Patient patient = null;
        Objective objective = null;

        PatientObjective patientObjective = new PatientObjective( id, patient, objective, startDate, endDate, completed, priority );

        return patientObjective;
    }

    @Override
    public void updateFromDto(UpdatePatientObjectiveDto dto, PatientObjective patientObjective) {
        if ( dto == null ) {
            return;
        }

        if ( dto.startDate() != null ) {
            patientObjective.setStartDate( dto.startDate() );
        }
        if ( dto.endDate() != null ) {
            patientObjective.setEndDate( dto.endDate() );
        }
        if ( dto.completed() != null ) {
            patientObjective.setCompleted( dto.completed() );
        }
        if ( dto.priority() != null ) {
            patientObjective.setPriority( dto.priority() );
        }
    }

    @Override
    public PatientObjectiveResponse toResponseDto(PatientObjective patientObjective) {
        if ( patientObjective == null ) {
            return null;
        }

        String title = null;
        String description = null;
        int position = 0;
        int id = 0;
        boolean completed = false;
        int priority = 0;
        Date startDate = null;
        Date endDate = null;

        title = patientObjectiveObjectiveTitle( patientObjective );
        description = patientObjectiveObjectiveDescription( patientObjective );
        position = patientObjectiveObjectivePosition( patientObjective );
        id = patientObjective.getId();
        completed = patientObjective.isCompleted();
        priority = patientObjective.getPriority();
        startDate = patientObjective.getStartDate();
        endDate = patientObjective.getEndDate();

        PatientObjectiveResponse patientObjectiveResponse = new PatientObjectiveResponse( id, title, description, completed, priority, position, startDate, endDate );

        return patientObjectiveResponse;
    }

    @Override
    public PatientObjectiveResponse toResponseDto(PatientObjectiveEntity patientObjectiveEntity) {
        if ( patientObjectiveEntity == null ) {
            return null;
        }

        String title = null;
        String description = null;
        int position = 0;
        int id = 0;
        boolean completed = false;
        int priority = 0;
        Date startDate = null;
        Date endDate = null;

        title = patientObjectiveEntityObjectiveEntityTitle( patientObjectiveEntity );
        description = patientObjectiveEntityObjectiveEntityDescription( patientObjectiveEntity );
        position = patientObjectiveEntityObjectiveEntityPosition( patientObjectiveEntity );
        id = patientObjectiveEntity.getId();
        completed = patientObjectiveEntity.isCompleted();
        priority = patientObjectiveEntity.getPriority();
        startDate = patientObjectiveEntity.getStartDate();
        endDate = patientObjectiveEntity.getEndDate();

        PatientObjectiveResponse patientObjectiveResponse = new PatientObjectiveResponse( id, title, description, completed, priority, position, startDate, endDate );

        return patientObjectiveResponse;
    }

    @Override
    public List<PatientObjectiveResponse> toResponseDtos(List<PatientObjective> patientObjectives) {
        if ( patientObjectives == null ) {
            return null;
        }

        List<PatientObjectiveResponse> list = new ArrayList<PatientObjectiveResponse>( patientObjectives.size() );
        for ( PatientObjective patientObjective : patientObjectives ) {
            list.add( toResponseDto( patientObjective ) );
        }

        return list;
    }

    private String patientObjectiveObjectiveTitle(PatientObjective patientObjective) {
        if ( patientObjective == null ) {
            return null;
        }
        Objective objective = patientObjective.getObjective();
        if ( objective == null ) {
            return null;
        }
        String title = objective.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }

    private String patientObjectiveObjectiveDescription(PatientObjective patientObjective) {
        if ( patientObjective == null ) {
            return null;
        }
        Objective objective = patientObjective.getObjective();
        if ( objective == null ) {
            return null;
        }
        String description = objective.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private int patientObjectiveObjectivePosition(PatientObjective patientObjective) {
        if ( patientObjective == null ) {
            return 0;
        }
        Objective objective = patientObjective.getObjective();
        if ( objective == null ) {
            return 0;
        }
        int position = objective.getPosition();
        return position;
    }

    private String patientObjectiveEntityObjectiveEntityTitle(PatientObjectiveEntity patientObjectiveEntity) {
        if ( patientObjectiveEntity == null ) {
            return null;
        }
        ObjectiveEntity objectiveEntity = patientObjectiveEntity.getObjectiveEntity();
        if ( objectiveEntity == null ) {
            return null;
        }
        String title = objectiveEntity.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }

    private String patientObjectiveEntityObjectiveEntityDescription(PatientObjectiveEntity patientObjectiveEntity) {
        if ( patientObjectiveEntity == null ) {
            return null;
        }
        ObjectiveEntity objectiveEntity = patientObjectiveEntity.getObjectiveEntity();
        if ( objectiveEntity == null ) {
            return null;
        }
        String description = objectiveEntity.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private int patientObjectiveEntityObjectiveEntityPosition(PatientObjectiveEntity patientObjectiveEntity) {
        if ( patientObjectiveEntity == null ) {
            return 0;
        }
        ObjectiveEntity objectiveEntity = patientObjectiveEntity.getObjectiveEntity();
        if ( objectiveEntity == null ) {
            return 0;
        }
        int position = objectiveEntity.getPosition();
        return position;
    }
}
