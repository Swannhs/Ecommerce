package com.swann.repository.employee;

import com.swann.model.employee.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
    @Override
    Optional<EmployeeEntity> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
