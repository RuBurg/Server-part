package com.trainingapp.springserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercises_of_training")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private int id;
    private String exe_name;
    private String exe_link;
    private int training_id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getExe_name() {
        return exe_name;
    }

    public void setExe_name(String exe_name) {
        this.exe_name = exe_name;
    }

    public String getExe_link() {
        return exe_link;
    }

    public void setExe_link(String exe_link) {
        this.exe_link = exe_link;
    }

    public int getTraining_id() {
        return training_id;
    }

    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", exe_name='" + exe_name + '\'' +
                ", exe_link='" + exe_link + '\'' +
                ", training_id=" + training_id +
                '}';
    }
}
