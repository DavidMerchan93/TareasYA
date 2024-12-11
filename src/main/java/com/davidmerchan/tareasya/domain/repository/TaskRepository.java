/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain.repository;

import com.davidmerchan.tareasya.domain.model.Task;
import java.util.List;

/**
 *
 * @author davidmerchan
 */
public interface TaskRepository {
    List<Task> getAllTasks();
    void saveTask(Task task);
    void deleteTask(Integer id);
    void updateTask(Task task);
}
