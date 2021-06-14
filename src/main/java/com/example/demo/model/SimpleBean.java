package com.example.demo.model;

public class SimpleBean {
    private String username;

    public SimpleBean(String username) {
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "username='" + username + '\'' +
                '}';
    }
}
