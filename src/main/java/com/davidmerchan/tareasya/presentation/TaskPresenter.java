/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.presentation;

import com.davidmerchan.tareasya.domain.DeleteTaskUseCase;
import com.davidmerchan.tareasya.domain.GetTasksUseCase;
import com.davidmerchan.tareasya.domain.SaveTaskUseCase;
import com.davidmerchan.tareasya.domain.UpdateTaskUseCase;

/**
 *
 * @author davidmerchan
 */
public class TaskPresenter {
    
    private DeleteTaskUseCase deleteTaskUseCase;
    private GetTasksUseCase getTasksUseCase;
    private SaveTaskUseCase saveTaskUseCase;
    private UpdateTaskUseCase updateTaskUseCase;
    
    public TaskPresenter(
        DeleteTaskUseCase deleteTaskUseCase,
        GetTasksUseCase getTasksUseCase,
        SaveTaskUseCase saveTaskUseCase,
        UpdateTaskUseCase updateTaskUseCase
    ) {
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getTasksUseCase = getTasksUseCase;
        this.saveTaskUseCase = saveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
    }
    
}
