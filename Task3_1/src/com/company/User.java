package com.company;

public class User {
    private int id;
    private String name;
    private String password;
    private String role;

    public User() {
    }

    public User(int id, String name, String password, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            System.out.println("error");
        }
        else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
            System.out.println("error");
        else
            this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.isEmpty())
            System.out.println("error");
        else
            this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role.isEmpty())
            System.out.println("error");
        else
            this.role = role;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getRole();
    }
}
