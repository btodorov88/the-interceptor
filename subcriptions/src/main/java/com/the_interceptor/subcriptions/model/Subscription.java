package com.the_interceptor.subcriptions.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="subscription_type_id", nullable=false)
    private SubscriptionDefinition subscriptionType;

    @Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
}
