package com.trainingapp.springserver.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "params_of_clients")
public class Params {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private int id;
    private LocalDate date_of_measure;
    private Double weight;
    private Double arm_measure;
    private Double chest_measure;
    private Double waist_measure;
    private Double hip_measure;
    private int client_id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate_of_measure() {
        return date_of_measure;
    }

    public void setDate_of_measure(LocalDate date_of_measure) {
        this.date_of_measure = date_of_measure;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getArm_measure() {
        return arm_measure;
    }

    public void setArm_measure(Double arm_measure) {
        this.arm_measure = arm_measure;
    }

    public Double getChest_measure() {
        return chest_measure;
    }

    public void setChest_measure(Double chest_measure) {
        this.chest_measure = chest_measure;
    }

    public Double getWaist_measure() {
        return waist_measure;
    }

    public void setWaist_measure(Double waist_measure) {
        this.waist_measure = waist_measure;
    }

    public Double getHip_measure() {
        return hip_measure;
    }

    public void setHip_measure(Double hip_measure) {
        this.hip_measure = hip_measure;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    @Override
    public String toString() {
        return "Params{" +
                "id=" + id +
                ", date_of_measure=" + date_of_measure +
                ", weight=" + weight +
                ", arm_measure=" + arm_measure +
                ", chest_measure=" + chest_measure +
                ", waist_measure=" + waist_measure +
                ", hip_measure=" + hip_measure +
                ", client_id=" + client_id +
                '}';
    }
}
