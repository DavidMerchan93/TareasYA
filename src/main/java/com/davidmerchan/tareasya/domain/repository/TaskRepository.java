/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain.repository;

import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import java.util.List;

/**
 *
 * @author davidmerchan
 */
public interface TaskRepository {
    List<Task> getTasks();
    List<Task> getTasks(TaskStatus status);
    Task getTask(Integer id);
    void saveTask(Task task);
    void deleteTask(Integer id);
    void updateTask(Task task);
}
