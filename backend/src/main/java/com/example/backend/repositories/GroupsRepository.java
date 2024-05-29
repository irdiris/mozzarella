package com.example.backend.repositories;

import com.example.backend.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Group, Long> {

}
