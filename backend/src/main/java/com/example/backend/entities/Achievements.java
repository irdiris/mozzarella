package com.example.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "mozzarella", name = "achievements")
@Data
public class Achievements {
    @Id
    private Long id;
    private String description;
    private String name;
    @ManyToMany
    private List<User> members;
}
