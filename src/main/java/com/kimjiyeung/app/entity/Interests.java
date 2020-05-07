package com.kimjiyeung.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interests {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Interests(){}

    public Interests( String name) {

        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}

