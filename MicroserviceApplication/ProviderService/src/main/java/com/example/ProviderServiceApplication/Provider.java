package com.example.ProviderServiceApplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Provider implements Serializable{
    @Id
    @GeneratedValue
    private int idF;
    private String nameF;

    public Provider(){
    }
    public Provider(String name) {
        this.nameF = name;
    }
    public int getId() {
        return idF;
    }
    public void setId(int id) {
        this.idF = id;
    }
    public String getName() {
        return nameF;
    }
    public void setName(String name) {
        this.nameF = name;
    }
}