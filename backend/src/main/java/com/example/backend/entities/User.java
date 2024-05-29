package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Table(name = "user", schema = "mozzarella")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
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
    @OneToOne(mappedBy = "leader")
    private Group group;
    @ManyToMany
    @JoinTable(
            name = "group_members",
            schema = "mozzarella",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Group> groups;
    @ManyToMany
    @JoinTable(
            name = "user_achievements",
            schema = "mozzarella",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "achievement_id"))
    private List<Achievement> achievements;

    @ManyToOne
    @JoinColumn(name = "team", foreignKey = @ForeignKey(name = "fk_team"))
    private Team team;
}
