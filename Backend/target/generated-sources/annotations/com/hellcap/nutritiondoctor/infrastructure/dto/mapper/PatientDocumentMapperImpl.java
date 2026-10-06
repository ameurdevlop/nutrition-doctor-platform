package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.DocumentType;
import com.hellcap.nutritiondoctor.domain.models.PatientDocument;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.PatientDocumentResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.PatientDocumentEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.PatientEntity;
import java.time.LocalDateTime;
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
public class PatientDocumentMapperImpl extends PatientDocumentMapper {

    @Override
    public PatientDocument toModel(PatientDocumentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PatientDocument patientDocument = new PatientDocument();

        patientDocument.setPatientId( entityPatientPatientId( entity ) );
        patientDocument.setType( entity.getDocumentType() );
        patientDocument.setId( entity.getId() );
        patientDocument.setOriginalFilename( entity.getOriginalFilename() );
        patientDocument.setStoredFilename( entity.getStoredFilename() );
        patientDocument.setStoredPath( entity.getStoredPath() );
        patientDocument.setMimeType( entity.getMimeType() );
        patientDocument.setSizeBytes( entity.getSizeBytes() );
        patientDocument.setChecksum( entity.getChecksum() );
        patientDocument.setNotes( entity.getNotes() );
        patientDocument.setUploadedAt( entity.getUploadedAt() );

        return patientDocument;
    }

    @Override
    public List<PatientDocument> toModels(List<PatientDocumentEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PatientDocument> list = new ArrayList<PatientDocument>( entities.size() );
        for ( PatientDocumentEntity patientDocumentEntity : entities ) {
            list.add( toModel( patientDocumentEntity ) );
        }

        return list;
    }

    @Override
    public PatientDocumentResponse toResponseDto(PatientDocument patientDocument) {
        if ( patientDocument == null ) {
            return null;
        }

        int id = 0;
        DocumentType type = null;
        String originalFilename = null;
        String mimeType = null;
        long sizeBytes = 0L;
        String notes = null;
        LocalDateTime uploadedAt = null;

        id = patientDocument.getId();
        type = patientDocument.getType();
        originalFilename = patientDocument.getOriginalFilename();
        mimeType = patientDocument.getMimeType();
        sizeBytes = patientDocument.getSizeBytes();
        notes = patientDocument.getNotes();
        uploadedAt = patientDocument.getUploadedAt();

        PatientDocumentResponse patientDocumentResponse = new PatientDocumentResponse( id, type, originalFilename, mimeType, sizeBytes, notes, uploadedAt );

        return patientDocumentResponse;
    }

    @Override
    public PatientDocumentResponse toResponseDto(PatientDocumentEntity patientDocumentEntity) {
        if ( patientDocumentEntity == null ) {
            return null;
        }

        int id = 0;
        String originalFilename = null;
        String mimeType = null;
        long sizeBytes = 0L;
        String notes = null;
        LocalDateTime uploadedAt = null;

        id = patientDocumentEntity.getId();
        originalFilename = patientDocumentEntity.getOriginalFilename();
        mimeType = patientDocumentEntity.getMimeType();
        sizeBytes = patientDocumentEntity.getSizeBytes();
        notes = patientDocumentEntity.getNotes();
        uploadedAt = patientDocumentEntity.getUploadedAt();

        DocumentType type = null;

        PatientDocumentResponse patientDocumentResponse = new PatientDocumentResponse( id, type, originalFilename, mimeType, sizeBytes, notes, uploadedAt );

        return patientDocumentResponse;
    }

    @Override
    public List<PatientDocumentResponse> toResponseDtos(List<PatientDocument> patientDocuments) {
        if ( patientDocuments == null ) {
            return null;
        }

        List<PatientDocumentResponse> list = new ArrayList<PatientDocumentResponse>( patientDocuments.size() );
        for ( PatientDocument patientDocument : patientDocuments ) {
            list.add( toResponseDto( patientDocument ) );
        }

        return list;
    }

    private int entityPatientPatientId(PatientDocumentEntity patientDocumentEntity) {
        if ( patientDocumentEntity == null ) {
            return 0;
        }
        PatientEntity patient = patientDocumentEntity.getPatient();
        if ( patient == null ) {
            return 0;
        }
        int patientId = patient.getPatientId();
        return patientId;
    }
}
