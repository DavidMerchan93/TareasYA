/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain;

import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import com.davidmerchan.tareasya.domain.repository.TaskRepository;

/**
 *
 * @author davidmerchan
 */
public class SaveTaskUseCase {
    private TaskRepository repository;
    
    public SaveTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }
    
    public void saveTask(
        String title,
        String detail,
        String endDate,
        TaskStatus status,
        String category
    ) {
        
        Task task = new Task(title, detail, endDate, status, category);
        repository.saveTask(task);
    }
}
