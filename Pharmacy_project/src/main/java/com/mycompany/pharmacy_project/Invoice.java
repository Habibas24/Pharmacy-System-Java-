package com.mycompany.pharmacy_project;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {

    private String invoiceID;
    private Customer customer;
    private ArrayList<Medicine> purchasedMeds;
    private ArrayList<Integer> quantities;
    private double totalAmount;
    private LocalDate dateIssued;

    public Invoice(String invoiceID, Customer customer, ArrayList<Medicine> purchasedMeds,
            ArrayList<Integer> quantities) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.purchasedMeds = purchasedMeds;
        this.quantities = quantities;
        this.dateIssued = LocalDate.now();
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        double total = 0;
        for (int i = 0; i < purchasedMeds.size(); i++) {
            total += purchasedMeds.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public String printInvoice() {
        String invoice
                = "_________________________________________\n"
                + "              ----- Invoice -----              \n"
                + "_________________________________________\n"
                + "Customer name: " + customer.getName() + "\n"
                + "Date: " + dateIssued + "\n"
                + "_________________________________________\n"
                + String.format("%-20s %-10s %-10s%n", "Medicine", "Quantity", "Price");

        for (int i = 0; i < purchasedMeds.size(); i++) {
            invoice += String.format("%-20s %-10d %-10.2f%n",
                    purchasedMeds.get(i).getName(),
                    quantities.get(i),
                    purchasedMeds.get(i).getPrice());
        }

        invoice += "_________________________________________\n"
                + "Total:            " + String.format("%.2f", calculateTotal()) + " $\n"
                + "_________________________________________\n";

        return invoice;

    }

   
}
