package com.great.demo.Thymeleaf.Application.models;


import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;


@Validated
@Entity
@
import javax.persistence.Id;

public class User {
    @Id
    @Column(name = "id", nullable = false)
}
