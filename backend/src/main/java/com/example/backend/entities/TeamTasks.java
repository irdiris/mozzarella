package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(schema = "mozzarella", name = "team_tasks")
@Data

public class TeamTasks {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private int points;
    private boolean is_done;
    @Temporal(TemporalType.DATE)
    private LocalDate deadline;
    @ManyToOne()
    @JoinColumn(name = "team", foreignKey = @ForeignKey(name = "fk_group"))
    private Team team;


}
