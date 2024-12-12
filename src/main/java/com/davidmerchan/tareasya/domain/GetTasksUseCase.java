/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain;

import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import com.davidmerchan.tareasya.domain.repository.TaskRepository;
import java.util.List;

/**
 *
 * @author davidmerchan
 */
public class GetTasksUseCase {
    private TaskRepository repository;
    
    public GetTasksUseCase(TaskRepository repository) {
        this.repository = repository;
    }
    
    public Task getTaskById(Integer id) {
        return repository.getTask(id);
    }
    
    public List<Task> getAllTasks() {
        return repository.getTasks();
    }
    
    public List<Task> getAllTasks(TaskStatus status) {
        return repository.getTasks(status);
    }
}
