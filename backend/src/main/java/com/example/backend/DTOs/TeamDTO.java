package com.example.backend.DTOs;

import com.example.backend.entities.TeamTasks;
import com.example.backend.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
public class TeamDTO {


    private Long id;

    private String name;
    private String description;

    private User leader;

    private List<User> members;

    private List<TeamTasks> team_tasks;
}
