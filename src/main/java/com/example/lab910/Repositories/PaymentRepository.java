package com.example.lab910.Repositories;

import com.example.lab910.Model.PaymantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymantEntity,Integer> {
}
