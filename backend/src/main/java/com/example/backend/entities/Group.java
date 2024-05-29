package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table(name = "group", schema = "mozzarella")
@Entity
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "leader_id", referencedColumnName = "id")
    private User leader;
    @ManyToMany
    private List<User> members;
    @OneToMany( mappedBy = "group")
    private List<GroupTasks> group_tasks;
}
