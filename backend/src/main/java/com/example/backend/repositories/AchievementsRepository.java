package com.example.backend.repositories;

import com.example.backend.entities.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementsRepository extends JpaRepository<Achievement, Long> {

}
