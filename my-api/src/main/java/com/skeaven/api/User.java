package com.skeaven.api;

import java.io.Serializable;

public class User implements Serializable {
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
