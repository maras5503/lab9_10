package com.example.lab910;

import com.example.lab910.Model.DepartmentsEntity;
import com.example.lab910.Model.PaymantEntity;
import com.example.lab910.Model.UsersEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.lab910.Services.DepartmentsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class Lab910ApplicationTests {
	private DepartmentsEntity departmentsEntity;
	private PaymantEntity paymantEntity;
	private UsersEntity usersEntity;

	@Autowired
	private DepartmentsService departmentsService;

	@Test
	public void testSaveNewDeparment(){
		departmentsEntity.setAddress("Address1");
		departmentsEntity.setDepartmentname("Department1");
		departmentsEntity.setDescription("Description1");
		departmentsEntity.setMainmail("Mail1");
		departmentsEntity.setMainphone("Phone1");
		departmentsEntity.setMainwww("Www1");
		departmentsService.saveOrUpdate(departmentsEntity);

		List<DepartmentsEntity> list=departmentsService.getAllDepartments();
		DepartmentsEntity d1=list.get(list.size());
		assertEquals(d1.getDepartmentname(),"Department1");

	}

}
