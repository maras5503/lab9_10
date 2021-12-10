package com.example.lab910.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class PaymantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idpaymant;

    float bonus;

    Date dateOfPaymant;

    @ManyToOne
    UsersEntity user;

    float pay;
}
