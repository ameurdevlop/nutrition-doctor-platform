package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Payment;
import com.hellcap.nutritiondoctor.infrastructure.entity.PaymentEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.SubscriptionEntity;
import com.hellcap.nutritiondoctor.infrastructure.entity.UserEntity;
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
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Payment toModel(PaymentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setSubscriptionId( entitySubscriptionId( entity ) );
        payment.setConfirmedBy( entityConfirmedById( entity ) );
        payment.setId( entity.getId() );
        payment.setAmount( entity.getAmount() );
        payment.setStatus( entity.getStatus() );
        payment.setPaymentDate( entity.getPaymentDate() );
        payment.setProof( entity.getProof() );

        return payment;
    }

    @Override
    public PaymentEntity toEntity(Payment model) {
        if ( model == null ) {
            return null;
        }

        PaymentEntity paymentEntity = new PaymentEntity();

        paymentEntity.setId( model.getId() );
        paymentEntity.setAmount( model.getAmount() );
        paymentEntity.setStatus( model.getStatus() );
        paymentEntity.setPaymentDate( model.getPaymentDate() );
        paymentEntity.setProof( model.getProof() );

        return paymentEntity;
    }

    @Override
    public List<Payment> toModels(List<PaymentEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Payment> list = new ArrayList<Payment>( entities.size() );
        for ( PaymentEntity paymentEntity : entities ) {
            list.add( toModel( paymentEntity ) );
        }

        return list;
    }

    private int entitySubscriptionId(PaymentEntity paymentEntity) {
        if ( paymentEntity == null ) {
            return 0;
        }
        SubscriptionEntity subscription = paymentEntity.getSubscription();
        if ( subscription == null ) {
            return 0;
        }
        int id = subscription.getId();
        return id;
    }

    private Integer entityConfirmedById(PaymentEntity paymentEntity) {
        if ( paymentEntity == null ) {
            return null;
        }
        UserEntity confirmedBy = paymentEntity.getConfirmedBy();
        if ( confirmedBy == null ) {
            return null;
        }
        int id = confirmedBy.getId();
        return id;
    }
}
