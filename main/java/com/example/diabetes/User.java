package com.example.diabetes;

import androidx.annotation.NonNull;

public class User {
    private String userName;
    private String password;

    public User() {
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
