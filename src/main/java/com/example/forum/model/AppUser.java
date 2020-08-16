package com.example.forum.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(unique=true, length = 36, nullable = false)
    private String userName;


    @Column(length = 1, nullable = false)
    private boolean enabled;

}