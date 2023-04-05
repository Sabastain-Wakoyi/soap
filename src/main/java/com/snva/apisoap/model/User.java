package com.snva.apisoap.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity (name = "user")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     private String name;
     private int dob;
     private int contact;
     private  String email;
     private String address;
     private String course;

}
