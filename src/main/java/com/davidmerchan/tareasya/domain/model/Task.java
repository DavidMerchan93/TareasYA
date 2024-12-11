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
    Integer id;
    String title;
    String detail;
    String endDate;
    TaskStatus status;
    String category;
    
    public Task(Integer id, String title, String detail, String endDate, TaskStatus status, String category) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.endDate = endDate;
        this.status = status;
        this.category = category;
    }

}

