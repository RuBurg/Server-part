package com.trainingapp.springserver.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "trainings_of_clients")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private int id;
    private LocalDate train_date;
    private int client_id;
    private boolean if_cancelled;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getTrain_date() {
        return train_date;
    }

    public void setTrain_date(LocalDate train_date) {
        this.train_date = train_date;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public boolean isIf_cancelled() {
        return if_cancelled;
    }

    public void setIf_cancelled(boolean if_cancelled) {
        this.if_cancelled = if_cancelled;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", train_date=" + train_date +
                ", client_id=" + client_id +
                ", if_cancelled=" + if_cancelled +
                '}';
    }
}
