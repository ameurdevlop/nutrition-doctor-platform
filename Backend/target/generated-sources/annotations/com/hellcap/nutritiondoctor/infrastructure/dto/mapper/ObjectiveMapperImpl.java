package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Objective;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddObjectiveDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdateObjectiveDto;
import com.hellcap.nutritiondoctor.infrastructure.entity.ObjectiveEntity;
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
public class ObjectiveMapperImpl extends ObjectiveMapper {

    @Override
    public ObjectiveEntity toEntity(Objective objective) {
        if ( objective == null ) {
            return null;
        }

        ObjectiveEntity objectiveEntity = new ObjectiveEntity();

        objectiveEntity.setPosition( objective.getPosition() );
        objectiveEntity.setPriority( objective.getPriority() );
        objectiveEntity.setCompleted( objective.isCompleted() );
        objectiveEntity.setId( objective.getId() );
        objectiveEntity.setTitle( objective.getTitle() );
        objectiveEntity.setDescription( objective.getDescription() );

        return objectiveEntity;
    }

    @Override
    public Objective toModel(ObjectiveEntity objectiveEntity) {
        if ( objectiveEntity == null ) {
            return null;
        }

        boolean completed = false;
        int priority = 0;
        int position = 0;
        int id = 0;
        String title = null;
        String description = null;

        completed = objectiveEntity.isCompleted();
        priority = objectiveEntity.getPriority();
        position = objectiveEntity.getPosition();
        id = objectiveEntity.getId();
        title = objectiveEntity.getTitle();
        description = objectiveEntity.getDescription();

        Objective objective = new Objective( id, title, description, completed, priority, position );

        return objective;
    }

    @Override
    public List<Objective> toModels(List<ObjectiveEntity> objectiveEntities) {
        if ( objectiveEntities == null ) {
            return null;
        }

        List<Objective> list = new ArrayList<Objective>( objectiveEntities.size() );
        for ( ObjectiveEntity objectiveEntity : objectiveEntities ) {
            list.add( toModel( objectiveEntity ) );
        }

        return list;
    }

    @Override
    public Objective fromAddDto(AddObjectiveDto addObjectiveDto) {
        if ( addObjectiveDto == null ) {
            return null;
        }

        String title = null;

        title = addObjectiveDto.title();

        int id = 0;
        String description = null;
        boolean completed = false;
        int priority = 0;
        int position = 0;

        Objective objective = new Objective( id, title, description, completed, priority, position );

        return objective;
    }

    @Override
    public Objective fromUpdateDto(UpdateObjectiveDto updateObjectiveDto) {
        if ( updateObjectiveDto == null ) {
            return null;
        }

        boolean completed = false;
        int priority = 0;
        int position = 0;
        String title = null;
        String description = null;

        completed = updateObjectiveDto.completed();
        priority = updateObjectiveDto.priority();
        position = updateObjectiveDto.position();
        title = updateObjectiveDto.title();
        description = updateObjectiveDto.description();

        int id = 0;

        Objective objective = new Objective( id, title, description, completed, priority, position );

        return objective;
    }

    @Override
    public List<ObjectiveEntity> toEntityAll(List<Objective> objs) {
        if ( objs == null ) {
            return null;
        }

        List<ObjectiveEntity> list = new ArrayList<ObjectiveEntity>( objs.size() );
        for ( Objective objective : objs ) {
            list.add( toEntity( objective ) );
        }

        return list;
    }

    @Override
    public List<Objective> toModelAll(List<ObjectiveEntity> objs) {
        if ( objs == null ) {
            return null;
        }

        List<Objective> list = new ArrayList<Objective>( objs.size() );
        for ( ObjectiveEntity objectiveEntity : objs ) {
            list.add( toModel( objectiveEntity ) );
        }

        return list;
    }
}
