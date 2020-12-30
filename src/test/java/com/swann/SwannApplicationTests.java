package com.swann;

import com.swann.model.employee.EmployeeEntity;
import com.swann.repository.employee.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SwannApplicationTests {

    @Autowired
    private EmployeeRepository repository;

    private Long id = 1L;
    private EmployeeEntity entity;

    String empty = "";

    @Test
    void contextLoads() {

        System.out.println(empty.equals("") ? id : false);
    }

}
