package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "mozzarella", name = "teams")
@Data
public class Teams {

    @Id
    private Long id;

    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "leader_id", referencedColumnName = "id")
    private User leader;
    @OneToMany(mappedBy="team")
    private List<User> members;
    @OneToMany (mappedBy = "team")
    private List<Team_tasks> team_tasks;

}
