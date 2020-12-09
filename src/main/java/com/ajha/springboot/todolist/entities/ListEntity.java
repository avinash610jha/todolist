package com.ajha.springboot.todolist.entities;

import javax.persistence.*;

@Entity
public class ListEntity {

    @Id
    @Column(name="task_id")
    private Integer id;

    @Column(length = 2000)
    private String description;

    @Column(length = 10)
    private String status;


}