package com.trainingapp.springserver.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "competitions_of_clients")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private int id;
    private String competition_name;
    private LocalDate competition_date;
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public LocalDate getCompetition_date() {
        return competition_date;
    }

    public void setCompetition_date(LocalDate competition_date) {
        this.competition_date = competition_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "id=" + id +
                ", competition_name='" + competition_name + '\'' +
                ", competition_date=" + competition_date +
                ", address='" + address + '\'' +
                '}';
    }
}
