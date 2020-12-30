package com.swann.model.product;

import com.swann.model.employee.EmployeeEntity;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "You forget to provide a name")
    private String name;

    @NotBlank(message = "Please provide a price")
    private Float price;

//    @Type(type = "Text")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeId")
    private EmployeeEntity employee;
}
