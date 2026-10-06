package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Booking;
import com.hellcap.nutritiondoctor.domain.models.Nutritionist;
import com.hellcap.nutritiondoctor.domain.models.Patient;
import com.hellcap.nutritiondoctor.domain.models.ServiceType;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.AddBookingDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.UpdateBookingDto;
import com.hellcap.nutritiondoctor.infrastructure.entity.BookingEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class BookingMapperImpl extends BookingMapper {

    @Autowired
    private NutritionistMapper nutritionistMapper;
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public BookingEntity toEntity(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        BookingEntity bookingEntity = new BookingEntity();

        bookingEntity.setId( booking.getId() );
        bookingEntity.setPatient( patientMapper.toEntity( booking.getPatient() ) );
        bookingEntity.setNutritionist( nutritionistMapper.toEntity( booking.getNutritionist() ) );
        bookingEntity.setAppointmentTime( booking.getAppointmentTime() );
        bookingEntity.setEndTime( booking.getEndTime() );
        bookingEntity.setNotes( booking.getNotes() );
        bookingEntity.setStatus( bookingStatusToBookingStatus( booking.getStatus() ) );
        bookingEntity.setServiceType( booking.getServiceType() );
        bookingEntity.setOutlookEventId( booking.getOutlookEventId() );
        bookingEntity.setRappelDate( booking.getRappelDate() );

        return bookingEntity;
    }

    @Override
    public List<BookingEntity> toEntities(List<Booking> bookings) {
        if ( bookings == null ) {
            return null;
        }

        List<BookingEntity> list = new ArrayList<BookingEntity>( bookings.size() );
        for ( Booking booking : bookings ) {
            list.add( toEntity( booking ) );
        }

        return list;
    }

    @Override
    public Booking toModel(BookingEntity bookingEntity) {
        if ( bookingEntity == null ) {
            return null;
        }

        ServiceType serviceType = null;
        LocalDateTime endTime = null;
        int id = 0;
        Patient patient = null;
        Nutritionist nutritionist = null;
        LocalDateTime appointmentTime = null;
        String notes = null;
        Booking.BookingStatus status = null;
        String outlookEventId = null;
        LocalDate rappelDate = null;

        serviceType = bookingEntity.getServiceType();
        endTime = bookingEntity.getEndTime();
        id = bookingEntity.getId();
        patient = patientMapper.toModel( bookingEntity.getPatient() );
        nutritionist = nutritionistMapper.toModel( bookingEntity.getNutritionist() );
        appointmentTime = bookingEntity.getAppointmentTime();
        notes = bookingEntity.getNotes();
        status = bookingStatusToBookingStatus1( bookingEntity.getStatus() );
        outlookEventId = bookingEntity.getOutlookEventId();
        rappelDate = bookingEntity.getRappelDate();

        Booking booking = new Booking( patient, id, nutritionist, serviceType, appointmentTime, notes, status, endTime, outlookEventId, rappelDate );

        return booking;
    }

    @Override
    public Booking fromCreateDto(AddBookingDto addBookingDto) {
        if ( addBookingDto == null ) {
            return null;
        }

        ServiceType serviceType = null;
        Patient patient = null;
        Nutritionist nutritionist = null;
        LocalDateTime appointmentTime = null;
        String notes = null;
        Booking.BookingStatus status = null;

        serviceType = addBookingDto.serviceType();
        patient = addBookingDto.patient();
        nutritionist = addBookingDto.nutritionist();
        appointmentTime = addBookingDto.appointmentTime();
        notes = addBookingDto.notes();
        status = addBookingDto.status();

        int id = 0;
        LocalDateTime endTime = null;
        String outlookEventId = null;
        LocalDate rappelDate = null;

        Booking booking = new Booking( patient, id, nutritionist, serviceType, appointmentTime, notes, status, endTime, outlookEventId, rappelDate );

        return booking;
    }

    @Override
    public Booking fromUpdateDto(UpdateBookingDto updateBookingDto) {
        if ( updateBookingDto == null ) {
            return null;
        }

        ServiceType serviceType = null;
        int id = 0;
        Patient patient = null;
        Nutritionist nutritionist = null;
        LocalDateTime appointmentTime = null;
        String notes = null;

        serviceType = updateBookingDto.serviceType();
        id = updateBookingDto.id();
        patient = updateBookingDto.patient();
        nutritionist = updateBookingDto.nutritionist();
        appointmentTime = updateBookingDto.appointmentTime();
        notes = updateBookingDto.notes();

        Booking.BookingStatus status = null;
        LocalDateTime endTime = null;
        String outlookEventId = null;
        LocalDate rappelDate = null;

        Booking booking = new Booking( patient, id, nutritionist, serviceType, appointmentTime, notes, status, endTime, outlookEventId, rappelDate );

        return booking;
    }

    @Override
    public List<Booking> toModels(List<BookingEntity> all) {
        if ( all == null ) {
            return null;
        }

        List<Booking> list = new ArrayList<Booking>( all.size() );
        for ( BookingEntity bookingEntity : all ) {
            list.add( toModel( bookingEntity ) );
        }

        return list;
    }

    protected BookingEntity.BookingStatus bookingStatusToBookingStatus(Booking.BookingStatus bookingStatus) {
        if ( bookingStatus == null ) {
            return null;
        }

        BookingEntity.BookingStatus bookingStatus1;

        switch ( bookingStatus ) {
            case CREATED: bookingStatus1 = BookingEntity.BookingStatus.CREATED;
            break;
            case UPDATED: bookingStatus1 = BookingEntity.BookingStatus.UPDATED;
            break;
            case CANCELLED: bookingStatus1 = BookingEntity.BookingStatus.CANCELLED;
            break;
            case COMPLETED: bookingStatus1 = BookingEntity.BookingStatus.COMPLETED;
            break;
            case PENDING: bookingStatus1 = BookingEntity.BookingStatus.PENDING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + bookingStatus );
        }

        return bookingStatus1;
    }

    protected Booking.BookingStatus bookingStatusToBookingStatus1(BookingEntity.BookingStatus bookingStatus) {
        if ( bookingStatus == null ) {
            return null;
        }

        Booking.BookingStatus bookingStatus1;

        switch ( bookingStatus ) {
            case CANCELLED: bookingStatus1 = Booking.BookingStatus.CANCELLED;
            break;
            case CREATED: bookingStatus1 = Booking.BookingStatus.CREATED;
            break;
            case UPDATED: bookingStatus1 = Booking.BookingStatus.UPDATED;
            break;
            case COMPLETED: bookingStatus1 = Booking.BookingStatus.COMPLETED;
            break;
            case PENDING: bookingStatus1 = Booking.BookingStatus.PENDING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + bookingStatus );
        }

        return bookingStatus1;
    }
}
