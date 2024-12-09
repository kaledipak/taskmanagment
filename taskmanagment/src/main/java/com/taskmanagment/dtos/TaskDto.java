package com.taskmanagment.dtos;


import jakarta.validation.constraints.NotNull;

public class TaskDto {


    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private TaskStatus status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskDto(String title, String description, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public TaskDto() {
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
