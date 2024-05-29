package com.example.backend.repositories;

import com.example.backend.entities.TeamTasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamTasksRepository extends JpaRepository<TeamTasks, Long> {
}
