package com.example.backend.DTOs;

import com.example.backend.entities.User;

import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;
@Data
public class AchievementDTO {

    private Long id;
    private String description;
    private String name;

    private List<User> members;
}
