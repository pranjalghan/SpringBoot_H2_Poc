package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private Integer id;
    private String name;
    private float wages;
    public Employee(Integer id, String name, float wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }
    public Employee()
    {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }
}
