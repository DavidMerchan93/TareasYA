/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.davidmerchan.tareasya;

import com.davidmerchan.tareasya.data.TaskDataSource;
import com.davidmerchan.tareasya.data.TaskRepositoryImpl;
import com.davidmerchan.tareasya.domain.DeleteTaskUseCase;
import com.davidmerchan.tareasya.domain.GetTasksUseCase;
import com.davidmerchan.tareasya.domain.SaveTaskUseCase;
import com.davidmerchan.tareasya.domain.UpdateTaskUseCase;
import com.davidmerchan.tareasya.domain.repository.TaskRepository;
import com.davidmerchan.tareasya.presentation.Home;
import com.davidmerchan.tareasya.presentation.TaskPresenter;

/**
 *
 * @author davidmerchan
 */
public class TareasYa {

    private TaskDataSource datasource;
    private TaskRepository repository;
    
    private DeleteTaskUseCase deleteTaskUseCase;
    private GetTasksUseCase getTasksUseCase;
    private SaveTaskUseCase saveTaskUseCase;
    private UpdateTaskUseCase updateTaskUseCase;
    
    private static TaskPresenter taskPresenter;

    public TareasYa() {
        datasource = new TaskDataSource();
        repository = new TaskRepositoryImpl(datasource);
        
        deleteTaskUseCase = new DeleteTaskUseCase(repository);
        getTasksUseCase = new GetTasksUseCase(repository);
        saveTaskUseCase = new SaveTaskUseCase(repository);
        updateTaskUseCase = new UpdateTaskUseCase(repository);
        
        taskPresenter = new TaskPresenter(deleteTaskUseCase, getTasksUseCase, saveTaskUseCase, updateTaskUseCase);
       
    }
    
    private void prepareHomeView() {
        Home homeView = new Home();
        homeView.setPresenter(taskPresenter);
        homeView.prepareView();
        homeView.setVisible(true);
    }
    
    public void main(String[] args) {
        prepareHomeView();
    }
}
