package com.example.lab910;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.lab910.Model.DepartmentsEntity;
import com.example.lab910.Model.PaymantEntity;
import com.example.lab910.Model.UsersEntity;
import com.example.lab910.Repositories.DepartmentsRepository;
import com.example.lab910.Services.DepartmentsService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab910ApplicationTests {
  @Autowired
  private DepartmentsService departmentsService;

  @Autowired
  private DepartmentsRepository departmentsRepository;

  @Test
  public void testSaveNewDeparment() {
    final DepartmentsEntity departmentsEntity = new DepartmentsEntity();
    departmentsEntity.setAddress("Address1");
    departmentsEntity.setDepartmentname("Department1");
    departmentsEntity.setDescription("Description1");
    departmentsEntity.setMainmail("Mail1");
    departmentsEntity.setMainphone("Phone1");
    departmentsEntity.setMainwww("Www1");
    departmentsRepository.save(departmentsEntity);

    List<DepartmentsEntity> list = departmentsService.getAllDepartments();
    assertEquals(1, list.size());
  }

}
