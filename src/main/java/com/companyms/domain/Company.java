package com.companyms.domain;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;


}
