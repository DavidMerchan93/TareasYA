/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidmerchan.tareasya;

import java.util.Date;

/**
 *
 * @author davidmerchan
 */
public class Task {
    String title;
    String detail;
    Date date;
    TaskStatus status;
    
    public Task(String title, String detail, Date date, TaskStatus status) {
        this.title = title;
        this.detail = detail;
        this.date = date;
        this.status = status;
    }

}

