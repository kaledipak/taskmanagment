package com.taskmanagment.repo;

import com.taskmanagment.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepo extends JpaRepository<Task, Long> {

    Optional<Task> findByTitle(String  title);
}
