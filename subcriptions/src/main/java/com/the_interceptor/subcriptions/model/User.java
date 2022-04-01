package com.the_interceptor.subcriptions.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name="subscription_id", nullable=false)
    private Subscription subscription;
}
