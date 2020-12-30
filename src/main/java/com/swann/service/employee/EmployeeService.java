package com.swann.service.employee;

import com.swann.model.employee.EmployeeEntity;
import com.swann.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Iterable<EmployeeEntity> viewAll() {
        return repository.findAll();
    }

    public Optional<EmployeeEntity> viewById(Long id) {
        return repository.findById(id);
    }

    public EmployeeEntity save(EmployeeEntity newEmployee) {
        return repository.save(newEmployee);
    }

    public EmployeeEntity update(Long id, EmployeeEntity update) {
        Optional<EmployeeEntity> entity = repository.findById(id);
        entity.get().setId(id);
        entity.get().setFirst_name(update.getFirst_name().equals("") ? entity.get().getFirst_name() : update.getFirst_name());
        entity.get().setLast_name(update.getLast_name().equals("") ? entity.get().getLast_name() : update.getLast_name());
        entity.get().setAddress(update.getAddress().equals("") ? entity.get().getAddress() : update.getAddress());
        entity.get().setPhone(update.getPhone().equals("") ? entity.get().getPhone() : update.getPhone());
        entity.get().setPassword(update.getPassword().equals("") ? entity.get().getPassword() : update.getPassword());

        return repository.save(entity.get());
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
