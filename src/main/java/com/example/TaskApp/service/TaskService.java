package com.example.TaskApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TaskApp.mapper.TaskMapper;
import com.example.TaskApp.model.Task;

@Service
public class TaskService {

    private final TaskMapper taskMapper;

    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public void saveTask(Task task) {
        taskMapper.insert(task);
    }

    public List<Task> getAllTasks() {
        return taskMapper.getAllTasks();
    }

    public void deleteTask(Long id) {
        taskMapper.deleteTaskById(id); 
    }
}
