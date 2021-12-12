package com.example.lab910.Repositories;

import com.example.lab910.Model.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity,Integer> {
}
