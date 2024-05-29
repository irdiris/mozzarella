package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "mozzarella", name = "achievements")
@Data
public class Achievement {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private String name;
    @ManyToMany
    private List<User> members;
}
