package com.mycompany.pharmacy_project;

public class Pharmacist extends User {
    // Constructors
    public Pharmacist(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}

