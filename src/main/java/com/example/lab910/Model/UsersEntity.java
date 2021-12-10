package com.example.lab910.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int iduser;

    String description;

    String firstname;

    String lastname;

    String password;

    String username;

    @OneToMany(mappedBy = "user")
    List<PaymantEntity> paymants;

    @ManyToMany
    private List <DepartmentsEntity> departments;
}
