package com.example.backend.DTOs;

import com.example.backend.entities.Achievement;
import com.example.backend.entities.Group;
import com.example.backend.entities.Team;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
public class UserDTO {

    private Long id;
    private String first_name;
    private String last_name;
    private String nickname;
    private String email;
    private String password;
    private String type;
    private boolean is_best_member;
    private int score;
    private String photo;

    private Group group;


    private List<Group> groups;

    private List<Achievement> achievements;


    private Team team;
}
