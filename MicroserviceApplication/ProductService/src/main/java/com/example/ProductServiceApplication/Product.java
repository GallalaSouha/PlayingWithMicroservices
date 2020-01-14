package com.example.ProductServiceApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private int idP;
    private String nameP;
    public Product(){}
    public Product(String name) {
        this.nameP = name;
    }
    public int getIdP() {
        return idP;
    }
    public void setIdP(int id) {
        this.idP = id;
    }
    public String getName() {
        return nameP;
    }
    public void setName(String name) {
        this.nameP = name;
    }

}
