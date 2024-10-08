package com.projetospring.newproject.userdept.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
