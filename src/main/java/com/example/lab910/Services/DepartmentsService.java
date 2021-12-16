package com.example.lab910.Services;

import com.example.lab910.Model.DepartmentsEntity;
import com.example.lab910.Repositories.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentsService {
    @Autowired
    DepartmentsRepository departmentsRepository;

    public List<DepartmentsEntity> getAllDepartments()
    {
        List<DepartmentsEntity> departments = new ArrayList<DepartmentsEntity>();
        departmentsRepository.findAll().forEach(departments1 -> departments.add(departments1));
        return departments;
    }
    public DepartmentsEntity getDepartmentById(int id)
    {
        return departmentsRepository.findById(id).get();
    }

    public void saveOrUpdate(DepartmentsEntity departmentsEntity)
    {
        departmentsRepository.save(departmentsEntity);
    }
    public void delete(int id)
    {
        departmentsRepository.deleteById(id);
    }
    public void update(DepartmentsEntity departmentsEntity)
    {
        departmentsRepository.save(departmentsEntity);
    }
}
