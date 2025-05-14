package com.mycompany.pharmacy_project;

import java.util.ArrayList;

public class Pharmacy {
    private ArrayList <User> users = new ArrayList<>();
    private ArrayList<Medicine> medicines = new ArrayList<>();
    

    public void addUser(User user) {
        users.add(user);
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.checkPassword(password)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }
}
