package com.mycompany.pharmacy_project;

public abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public abstract String getUsername();

    public abstract boolean checkPassword(String password);
    

    


}

