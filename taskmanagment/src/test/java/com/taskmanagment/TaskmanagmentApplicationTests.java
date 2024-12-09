package com.taskmanagment;

import com.taskmanagment.dtos.TaskDto;
import com.taskmanagment.dtos.TaskStatus;
import com.taskmanagment.entities.Task;
import com.taskmanagment.repo.TaskRepo;
import jakarta.validation.Valid;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@SpringBootTest
class TaskmanagmentApplicationTests {

	@Autowired
	private TaskRepo taskRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void checkInputs(){
		TaskDto taskDto=new TaskDto();
		taskDto.setTitle("TaskTest1");
		taskDto.setDescription("Task1Decription");
		taskDto.setStatus(TaskStatus.Pending);

		Task task=new Task();
		//task.setId(5l);
		task.setStatus(taskDto.getStatus());
		task.setDescription(taskDto.getDescription());
		task.setTitle(taskDto.getTitle());
		taskRepo.save(task);
		Optional<Task> byId = taskRepo.findByTitle("TaskTest1");
		if(byId.isPresent()){
			Task task1 = byId.get();
			if(task1.getTitle().equals("TaskTest1")&& task1.getDescription().equals("Task1Decription"))
			System.out.println("Success");
			else
			System.out.println("UnSuccess");

		}

	}

//	@PostMapping
//	public void saveTask(@RequestBody @Valid TaskDto taskDto){
//		System.out.println(taskDto);
//		taskService.saveTask(taskDto);
//	}

}
