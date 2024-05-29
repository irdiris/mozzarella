package com.example.backend.DTOs;

import com.example.backend.entities.Team;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
public class TeamTasksDTO {

    private Long id;
    private String name;
    private String description;
    private int points;
    private boolean is_done;

    private LocalDate deadline;

    private Team team;

}
