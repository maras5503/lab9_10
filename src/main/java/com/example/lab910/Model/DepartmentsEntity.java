package com.example.lab910.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class DepartmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int iddepartment;

    String address;

    String departmentname;

    String description;

    String mainmail;

    String mainphone;

    String mainwww;

    @ManyToMany(mappedBy = "departments")
    List<UsersEntity> users;
}
