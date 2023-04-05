package com.snva.apisoap.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity (name = "user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     private String name;
     private String dob;
     private String contact;
     private  String email;
     private String address;
     private String course;

}
