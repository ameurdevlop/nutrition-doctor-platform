package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Category;
import com.hellcap.nutritiondoctor.domain.models.Objective;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddCategoryDto;
import com.hellcap.nutritiondoctor.infrastructure.entity.CategoryEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.ObjectiveEntity;
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
public class CategoryMapperImpl extends CategoryMapper {

    @Override
    public List<Category> toModels(List<CategoryEntity> categoryEntities) {
        if ( categoryEntities == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryEntities.size() );
        for ( CategoryEntity categoryEntity : categoryEntities ) {
            list.add( toModel( categoryEntity ) );
        }

        return list;
    }

    @Override
    public CategoryEntity toEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setObjectives( objectiveSetToObjectiveEntitySet( category.getObjectives() ) );
        categoryEntity.setName( category.getName() );
        categoryEntity.setId( category.getId() );

        return categoryEntity;
    }

    @Override
    public Category fromAddDto(AddCategoryDto addCategoryDto) {
        if ( addCategoryDto == null ) {
            return null;
        }

        int id = 0;
        String name = null;

        id = addCategoryDto.id();
        name = addCategoryDto.name();

        Category category = new Category( id, name );

        return category;
    }

    @Override
    public Category toModel(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        int id = 0;
        String name = null;

        id = categoryEntity.getId();
        name = categoryEntity.getName();

        Category category = new Category( id, name );

        category.setObjectives( objectiveEntitySetToObjectiveSet( categoryEntity.getObjectives() ) );

        return category;
    }

    protected ObjectiveEntity objectiveToObjectiveEntity(Objective objective) {
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

    protected Set<ObjectiveEntity> objectiveSetToObjectiveEntitySet(Set<Objective> set) {
        if ( set == null ) {
            return null;
        }

        Set<ObjectiveEntity> set1 = new LinkedHashSet<ObjectiveEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Objective objective : set ) {
            set1.add( objectiveToObjectiveEntity( objective ) );
        }

        return set1;
    }

    protected Objective objectiveEntityToObjective(ObjectiveEntity objectiveEntity) {
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

    protected Set<Objective> objectiveEntitySetToObjectiveSet(Set<ObjectiveEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Objective> set1 = new LinkedHashSet<Objective>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ObjectiveEntity objectiveEntity : set ) {
            set1.add( objectiveEntityToObjective( objectiveEntity ) );
        }

        return set1;
    }
}
