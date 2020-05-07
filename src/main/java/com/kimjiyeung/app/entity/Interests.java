package com.kimjiyeung.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interests {
    @Id
    @GeneratedValue
    private String sleep;
    private String game;
    public Interests(){}

    public Interests(String sleep, String game) {
        this.sleep = sleep;
        this.game = game;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }
    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.sleep = game;
    }
}

