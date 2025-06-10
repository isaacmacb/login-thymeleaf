package com.projeto.layout.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Task {

    public Task(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Task() {

    }


    @DateTimeFormat(pattern = "yyyy-MM-dd") // <- Adicione isso aqui
    private Date date;

    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
