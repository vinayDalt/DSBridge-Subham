package com.subham.dataScienceBridge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "MiddleName")
    private String MiddleName;
    @Column(name = "LastName")
    private String LastName;
    @Column(name = "mobile")
    private Long mobile;
    @Column(name = "email")
    private String email;
    @Column(name = "passwordHash")
    private HashMap<?, ?> passwordHash;
    @Column(name = "registeredAt")
    private Date registeredAt;
    @Column(name = "updatedAt")
    private Date updatedAt;
    @Column(name = "lastLogin")
    private Date lastLogin;
    @Column(name = "intro")
    private String intro;
    @Column(name = "profilePic")
    private String profilePic;
    @Column(name = "role")
    private Role role;
    @Column(name = "isActive")
    private int isActive;


}
