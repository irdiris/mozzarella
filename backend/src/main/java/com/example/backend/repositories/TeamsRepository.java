package com.example.backend.repositories;

import com.example.backend.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepository extends JpaRepository<Team, Long> {
}
