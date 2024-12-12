/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.presentation;

import com.davidmerchan.tareasya.domain.DeleteTaskUseCase;
import com.davidmerchan.tareasya.domain.GetTasksUseCase;
import com.davidmerchan.tareasya.domain.SaveTaskUseCase;
import com.davidmerchan.tareasya.domain.UpdateTaskUseCase;
import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidmerchan
 */
public class TaskPresenter {
    
    private DeleteTaskUseCase deleteTaskUseCase;
    private GetTasksUseCase getTasksUseCase;
    private SaveTaskUseCase saveTaskUseCase;
    private UpdateTaskUseCase updateTaskUseCase;
    
    List<Task> todoTasks = new ArrayList<>();
    List<Task> inProgressTasks = new ArrayList<>();
    List<Task> completedTasks = new ArrayList<>();
    
    public Task taskSelected;
    
    public TaskPresenter() {}
    
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
        
        getAllTasks();
    }
    
    public void selectTask(Task task) {
        this.taskSelected = task;
    }
    
    public void getAllTasks() {
        getToDoTasks();
        getInProgressTasks();
        getDoneTasks();
    }
    
    private void getToDoTasks() {
        todoTasks.clear();
        List<Task> allToDoTasks = getTasksUseCase.getAllTasks(TaskStatus.TO_DO);
        for(Task task: allToDoTasks) {
            todoTasks.add(task);
        }
    }
    
    private void getInProgressTasks() {
        inProgressTasks.clear();
        List<Task> allToDoTasks = getTasksUseCase.getAllTasks(TaskStatus.IN_PROGRESS);
        for(Task task: allToDoTasks) {
            inProgressTasks.add(task);
        }
    }
    
    private void getDoneTasks() {
        completedTasks.clear();
        List<Task> allToDoTasks = getTasksUseCase.getAllTasks(TaskStatus.DONE);
        for(Task task: allToDoTasks) {
            completedTasks.add(task);
        }
    }
    
    public void saveTask(
        String title,
        String detail,
        String endDate,
        TaskStatus status,
        String category
    ) {
        saveTaskUseCase.saveTask(title, detail, endDate, status, category);
        getToDoTasks();
    }
    
    public void deleteTask() {
        deleteTaskUseCase.deleteTask(taskSelected.id);
        getAllTasks();
    }
    
    public void updateTask(
        String title,
        String detail,
        String endDate,
        TaskStatus status,
        String category
    ) {
        updateTaskUseCase.updateTask(taskSelected.id, title, detail, endDate, status, category);
        getAllTasks();
    }
}
