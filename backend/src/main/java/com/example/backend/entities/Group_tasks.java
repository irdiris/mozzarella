package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table(name = "group_tasks", schema = "mozzarella")
@Entity
public class Group_tasks {
    @Id
    private Long id;
    private String name;
    private String description;
    private int points;
    private boolean is_done;
    @Temporal(TemporalType.DATE)
    private LocalDate deadline;
    @ManyToOne()
    @JoinColumn(name = "group", foreignKey = @ForeignKey(name = "fk_group"))
    private Group group;




}
