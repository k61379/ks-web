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
    private String game;
    public Interests(){}

    public Interests( String name,String game) {
        this.game=game;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
    public String getGame(){
        return game;
    }

    public void setGame(){
        this.game = game;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}

