/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain;

import com.davidmerchan.tareasya.domain.repository.TaskRepository;

/**
 *
 * @author davidmerchan
 */
public class UpdateTaskUseCase {
    private TaskRepository repository;
    
    public UpdateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }
}
