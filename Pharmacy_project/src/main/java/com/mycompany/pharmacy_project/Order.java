package com.mycompany.pharmacy_project;


import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Medicine> medicines;
    private ArrayList<Integer> quantities;

    public Order(Customer customer) {
        this.customer = customer;
        this.medicines = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addMedicine(Medicine med, int quantity) {
        medicines.add(med);
        quantities.add(quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < medicines.size(); i++) {
            total += medicines.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public ArrayList<Medicine> getMedicines() { return medicines; }
    public ArrayList<Integer> getQuantities() { return quantities; }
    public Customer getCustomer() { return customer; }
}
