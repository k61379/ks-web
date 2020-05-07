package com.kimjiyeung.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class SocialMedia {

    @GeneratedValue
    private String github;
    private String facebook;
    public SocialMedia(){}
    public SocialMedia(String github,  String facebook) {
        this.facebook = facebook;
        this.github = github;
    }
    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.facebook = facebook;
    }
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.github = github;
    }

}
