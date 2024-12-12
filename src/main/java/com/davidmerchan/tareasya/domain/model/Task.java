/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya.domain.model;

import java.util.Date;

/**
 *
 * @author davidmerchan
 */
public class Task {
    public Integer id;
    public String title;
    public String detail;
    public String endDate;
    public TaskStatus status;
    public String category;
    
    public Task() {
        this.id = 0;
        this.title = "N/A";
        this.detail = "N/A";
        this.endDate = "N/A";
        this.status = TaskStatus.UNDEFINED;
        this.category = "N/A";
    }
    
    public Task(String title, String detail, String endDate, TaskStatus status, String category) {
        this.title = title;
        this.detail = detail;
        this.endDate = endDate;
        this.status = status;
        this.category = category;
    }

}

