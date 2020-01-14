package com.example.ClientServiceApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Client implements Serializable{
    @Id
    @GeneratedValue
    private int idC;
    private String nameC;

    public Client(){
    }
    public Client(String name) {
        this.nameC = name;
    }
    public int getId() {
        return idC;
    }
    public void setId(int id) {
        this.idC = id;
    }
    public String getName() {
        return nameC;
    }
    public void setName(String name) {
        this.nameC = name;
    }
}