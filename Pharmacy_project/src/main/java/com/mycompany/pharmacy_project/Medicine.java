package com.mycompany.pharmacy_project;

import java.time.LocalDate;

public class Medicine {
    protected String name;
    protected int quantity;
    protected String company;
    protected LocalDate expiryDate;
    protected double price;
    
    // Constructors
    public Medicine(){
    }
    public Medicine( String name,  int quantity, String company, 
                    LocalDate expiryDate , double price) {
        this.name = name;
        this.quantity = quantity;
        this.company = company;
        this.expiryDate= expiryDate;
        this.price = price;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
         { System.out.println("Error: Name cannot be null or empty."); }
          else {
        this.name = name;}
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
       
        if (quantity < 0) 
        { System.out.println("Error: Quantity cannot be negative."); } 
        else {
        this.quantity = quantity;}
    }

    public String getcompany() {
        return company;
    }

    public void setcompany(String company) {
        if (company == null || company.isEmpty()) 
        { System.out.println("Error: Company cannot be null or empty."); }
         else {
        this.company = company;}
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
    public void setexpirydate(LocalDate expirDate) {
        if (expiryDate == null || expiryDate.isBefore(LocalDate.now())) 
        { System.out.println("Error: Expiry date cannot be in the past."); } 
        else {
        this.expiryDate = expirDate;}
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) 
        { System.out.println("Error: Price cannot be negative."); } 
        else {
        this.price = price;}
    }
    //updating medicin detals
    public void update(String name , int quantity , String company ,LocalDate expiryDate,double price ){
        this.setName(name);  
        this.setquantity(quantity); 
        this.setcompany(company); 
        this.setexpirydate(expiryDate); 
        this.setPrice(price);
    }
    //  Get medicine details
    public String getMedicineDetails() {
        return "Name: " + name + "\n" +
               "Quantity: " + quantity + "\n" +
               "company: " + company + "\n" +
               "expiry Date: " + expiryDate + "\n" +
               "Price: " + price;
    }

    
}
