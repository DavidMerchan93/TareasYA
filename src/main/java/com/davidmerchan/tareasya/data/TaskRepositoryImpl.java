/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.data;

import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import com.davidmerchan.tareasya.domain.repository.TaskRepository;
import static java.io.IO.println;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidmerchan
 */
public class TaskRepositoryImpl implements TaskRepository {
    
    private TaskDataSource taskDataSource;
    
    public TaskRepositoryImpl(TaskDataSource taskDataSource) {
        this.taskDataSource = taskDataSource;
    }

    @Override
    public void saveTask(Task task) {
        try {
            taskDataSource.saveTask(task);
        } catch(Exception e) {
            println("Error");
        }
    }

    @Override
    public void deleteTask(Integer id) {
        try {
            taskDataSource.deleteTask(id);
        } catch(Exception e) {
            println("Error");
        }
    }

    @Override
    public void updateTask(Task task) {
        try {
            taskDataSource.updateTask(task);
        } catch(Exception e) {
            println("Error");
        }
    }

    @Override
    public List<Task> getTasks() {
        List<Task> data = new ArrayList<Task>();
        try {
            data = taskDataSource.getAllTasks();
        } catch(Exception e) {
            println("Error");
        }
        return data;
    }

    @Override
    public List<Task> getTasks(TaskStatus status) {
        List<Task> data = new ArrayList<Task>();
        try {
            data = taskDataSource.getTasksByStatus(status);
        } catch(Exception e) {
            println("Error");
        }
        return data;
    }

    @Override
    public Task getTask(Integer id) {
        Task data = new Task();
        try {
            data = taskDataSource.getTaskById(id);
        } catch(Exception e) {
            println("Error");
        }
        return data;
    }
}
