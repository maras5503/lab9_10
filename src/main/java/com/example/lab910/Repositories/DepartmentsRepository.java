package com.example.lab910.Repositories;

import com.example.lab910.Model.DepartmentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends CrudRepository<DepartmentsEntity,Integer> {
}
