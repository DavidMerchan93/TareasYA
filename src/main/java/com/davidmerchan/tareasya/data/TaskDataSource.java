/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.data;

import com.davidmerchan.tareasya.domain.model.Task;
import com.davidmerchan.tareasya.domain.model.TaskStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author davidmerchan
 */
public class TaskDataSource {
    
    private Integer taskIdCounter = 154;
    private List<Task> tasks = new ArrayList<Task>();
    
    public void saveTask(Task task) {
        task.id = taskIdCounter;
        this.tasks.add(task);
        taskIdCounter ++;
    }
    
    public void deleteTask(Integer id) {
        List<Task> newTasks = new ArrayList<Task>();
        
        for(Task task: tasks) {
            if(!Objects.equals(task.id, id)) {
                newTasks.add(task);
            }
        }
        
        tasks.clear();
        for(Task task: newTasks) {
            if(!Objects.equals(task.id, id)) {
                tasks.add(task);
            }
        }
    }
    
    public void updateTask(Task task) {
        for(int i = 0; i < tasks.size(); i++) {
            if(Objects.equals(tasks.get(i).id, task.id)) {
                tasks.get(i).title = task.title;
                tasks.get(i).detail = task.detail;
                tasks.get(i).endDate = task.endDate;
                tasks.get(i).status = task.status;
                tasks.get(i).category = task.category;
            }
        }
    }
    
    public Task getTaskById(Integer id) {
        Integer index = 0;
        for(int i = 0; i < tasks.size(); i++) {
            if(Objects.equals(tasks.get(i).id, id)) {
                index = i;
            }
        }
        return tasks.get(index);
    }
    
    public List<Task> getTasksByStatus(TaskStatus status) {
        List<Task> data = new ArrayList<Task>();
        for(int i = 0; i < tasks.size(); i++) {
            if(Objects.equals(tasks.get(i).status, status)) {
                data.add(tasks.get(i));
            }
        }
        return data;
    }
    
    public List<Task> getAllTasks() {
        return tasks;
    }
    
}
