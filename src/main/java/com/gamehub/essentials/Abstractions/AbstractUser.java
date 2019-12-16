package com.gamehub.essentials.Abstractions;

public abstract class AbstractUser {

    protected String username;

    public AbstractUser() {
    }

    public AbstractUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
