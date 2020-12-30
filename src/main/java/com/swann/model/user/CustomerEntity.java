package com.swann.model.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Please provide a name;")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "Please provide an email")
    @Column(nullable = false)

    @Email(message = "please provide a valid email")
    private String email;
}
