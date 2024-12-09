package com.taskmanagment.service;


import com.taskmanagment.dtos.TaskDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    void saveTask(TaskDto taskDto);

    List<TaskDto> getAllTask();
}
