package com.swann.controller.employee;

import com.swann.model.employee.EmployeeEntity;
import com.swann.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<?> viewAll() {
        return new ResponseEntity<>(service.viewAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> viewById(@PathVariable Long id) {
        return new ResponseEntity<>(service.viewById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/create")
    public ResponseEntity<EmployeeEntity> create(@RequestBody EmployeeEntity entity) {
        EmployeeEntity employeeEntity = service.save(entity);
        return new ResponseEntity<>(employeeEntity, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody EmployeeEntity entity, @PathVariable Long id) {
        service.update(id, entity);
        return new ResponseEntity<>(service.viewById(id), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<EmployeeEntity> entity = service.viewById(id);
        service.delete(id);
        return new ResponseEntity<>(entity, HttpStatus.ACCEPTED);
    }

}
