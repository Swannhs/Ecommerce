package com.swann.model.employee;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "Seller")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Your didn't provide employee name")
    private String name;

    @NotBlank(message = "Enter firstname")
    private String first_name;

    private String last_name;

    @NotBlank(message = "Please provide address")
    private String address;

    @NotBlank(message = "Please provide phone number")
    private String phone;

    @NotBlank(message = "Please provide an email")
    @Email(message = "Please enter the correct email")
    private String email;

    @NotNull
    private String password;
}
