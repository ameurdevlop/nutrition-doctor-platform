package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.DayOfWeek;
import com.hellcap.nutritiondoctor.domain.models.NutritionistWorkingHour;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.WorkingHourRequestDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.WorkingHourResponse;
import java.time.LocalTime;
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
public class WorkingHourDtoMapperImpl extends WorkingHourDtoMapper {

    @Override
    public NutritionistWorkingHour toModel(WorkingHourRequestDto request) {
        if ( request == null ) {
            return null;
        }

        NutritionistWorkingHour nutritionistWorkingHour = new NutritionistWorkingHour();

        nutritionistWorkingHour.setDayOfWeek( request.dayOfWeek() );
        nutritionistWorkingHour.setStartTime( request.startTime() );
        nutritionistWorkingHour.setEndTime( request.endTime() );
        nutritionistWorkingHour.setClosed( request.closed() );

        return nutritionistWorkingHour;
    }

    @Override
    public List<NutritionistWorkingHour> toModels(List<WorkingHourRequestDto> requests) {
        if ( requests == null ) {
            return null;
        }

        List<NutritionistWorkingHour> list = new ArrayList<NutritionistWorkingHour>( requests.size() );
        for ( WorkingHourRequestDto workingHourRequestDto : requests ) {
            list.add( toModel( workingHourRequestDto ) );
        }

        return list;
    }

    @Override
    public WorkingHourResponse toResponse(NutritionistWorkingHour model) {
        if ( model == null ) {
            return null;
        }

        int id = 0;
        int nutritionistId = 0;
        DayOfWeek dayOfWeek = null;
        LocalTime startTime = null;
        LocalTime endTime = null;
        boolean closed = false;

        id = model.getId();
        nutritionistId = model.getNutritionistId();
        dayOfWeek = model.getDayOfWeek();
        startTime = model.getStartTime();
        endTime = model.getEndTime();
        closed = model.isClosed();

        WorkingHourResponse workingHourResponse = new WorkingHourResponse( id, nutritionistId, dayOfWeek, startTime, endTime, closed );

        return workingHourResponse;
    }

    @Override
    public List<WorkingHourResponse> toResponseList(List<NutritionistWorkingHour> models) {
        if ( models == null ) {
            return null;
        }

        List<WorkingHourResponse> list = new ArrayList<WorkingHourResponse>( models.size() );
        for ( NutritionistWorkingHour nutritionistWorkingHour : models ) {
            list.add( toResponse( nutritionistWorkingHour ) );
        }

        return list;
    }
}
