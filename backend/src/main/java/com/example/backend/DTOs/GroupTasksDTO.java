package com.example.backend.DTOs;

import com.example.backend.entities.GroupTasks;
import com.example.backend.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
public class GroupTasksDTO {

    private Long id;

    private String name;
    private String description;

    private User leader;

    private List<User> members;

    private List<GroupTasks> group_tasks;
}
