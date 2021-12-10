package com.example.lab910.Repositories;

import com.example.lab910.Model.PaymantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymantEntity,Integer> {
}
