package com.mycompany.pharmacy_project;

public class Customer extends User {
    private final String name;

    public Customer(String username, String password, String name) {
        super(username, password);
        this.name = name;
    }
 
    public String getName() {
        return name;
    }

    @Override
    public String getUsername() {
        return username; 
    }

    @Override
    public boolean checkPassword(String password) {
        return true;  
    }
   
}
