package com.mycompany.pharmacy_project;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Add sample users
        pharmacy.addUser(new Pharmacist("Habiba", "1234"));

        pharmacy.addMedicine(new Medicine("Panadol", 20, "ABC Pharma", LocalDate.parse("2025-12-01"), 10.5));
        pharmacy.addMedicine(new Medicine("Vitamin C", 15, "DEF Pharma", LocalDate.parse("2024-10-01"), 15.0));
        pharmacy.addMedicine(new Medicine("Amoxicillin", 10, "GHI Pharma", LocalDate.parse("2026-03-01"), 25.0));
        pharmacy.addMedicine(new Medicine("Paracetamol", 18, "JKL Pharma", LocalDate.parse("2025-08-01"), 12.0));
        pharmacy.addMedicine(new Medicine("Aspirin", 30, "MNO Pharma", LocalDate.parse("2025-11-01"), 8.5));
        pharmacy.addMedicine(new Medicine("Cough Syrup", 12, "PQR Pharma", LocalDate.parse("2024-12-01"), 20.0));
        pharmacy.addMedicine(new Medicine("Ibuprofen", 22, "STU Pharma", LocalDate.parse("2025-06-01"), 17.5));
        pharmacy.addMedicine(new Medicine("Zinc", 15, "VWX Pharma", LocalDate.parse("2024-09-01"), 9.5));
        pharmacy.addMedicine(new Medicine("Antacid", 25, "YZA Pharma", LocalDate.parse("2026-01-01"), 13.0));
        pharmacy.addMedicine(new Medicine("Nurofen", 16, "BCD Pharma", LocalDate.parse("2025-04-01"), 14.0));
        pharmacy.addMedicine(new Medicine("Ranitidine", 28, "PQR Pharma", LocalDate.parse("2025-10-01"), 8.5));
        pharmacy.addMedicine(new Medicine("Lorazepam", 18, "XYZ Pharma", LocalDate.parse("2025-06-01"), 13.5));
        pharmacy.addMedicine(new Medicine("Diazepam", 22, "ABC Pharma", LocalDate.parse("2024-12-01"), 14.0));
        pharmacy.addMedicine(new Medicine("Albuterol", 24, "DEF Pharma", LocalDate.parse("2025-05-01"), 10.5));
        pharmacy.addMedicine(new Medicine("Tramadol", 15, "GHI Pharma", LocalDate.parse("2025-08-01"), 16.0));
        pharmacy.addMedicine(new Medicine("Hydroxychloroquine", 20, "JKL Pharma", LocalDate.parse("2026-01-01"), 25.0));
        pharmacy.addMedicine(new Medicine("Simvastatin", 26, "MNO Pharma", LocalDate.parse("2025-09-01"), 12.5));
        pharmacy.addMedicine(new Medicine("Ciprofloxacin", 19, "PQR Pharma", LocalDate.parse("2024-10-01"), 11.5));
        pharmacy.addMedicine(new Medicine("Lisinopril", 23, "STU Pharma", LocalDate.parse("2025-12-01"), 7.5));
        pharmacy.addMedicine(new Medicine("Gabapentin", 30, "VWX Pharma", LocalDate.parse("2025-03-01"), 13.0));
        pharmacy.addMedicine(new Medicine("Oxycodone", 17, "YZA Pharma", LocalDate.parse("2024-09-01"), 19.0));
        pharmacy.addMedicine(new Medicine("Sildenafil", 29, "BCD Pharma", LocalDate.parse("2025-04-01"), 10.0));
        pharmacy.addMedicine(new Medicine("Mirtazapine", 21, "EFG Pharma", LocalDate.parse("2025-07-01"), 14.5));
        pharmacy.addMedicine(new Medicine("Fexofenadine", 18, "HIJ Pharma", LocalDate.parse("2024-11-01"), 8.0));
        pharmacy.addMedicine(new Medicine("Cetirizine", 25, "KLM Pharma", LocalDate.parse("2025-02-01"), 6.5));
        pharmacy.addMedicine(new Medicine("Clonazepam", 20, "NOP Pharma", LocalDate.parse("2025-05-01"), 11.5));
        pharmacy.addMedicine(new Medicine("Methylprednisolone", 22, "QRS Pharma", LocalDate.parse("2025-10-01"), 20.0));
        pharmacy.addMedicine(new Medicine("Duloxetine", 19, "TUV Pharma", LocalDate.parse("2025-06-01"), 18.0));
        pharmacy.addMedicine(new Medicine("Fluticasone", 21, "WXY Pharma", LocalDate.parse("2024-12-01"), 16.5));
        pharmacy.addMedicine(new Medicine("Zolpidem", 24, "ZAB Pharma", LocalDate.parse("2025-08-01"), 12.5));
        pharmacy.addMedicine(new Medicine("Furosemide", 25, "CDE Pharma", LocalDate.parse("2025-07-01"), 14.0));
        pharmacy.addMedicine(new Medicine("Budesonide", 18, "EFG Pharma", LocalDate.parse("2025-02-01"), 17.5));
        pharmacy.addMedicine(new Medicine("Betamethasone", 23, "HIJ Pharma", LocalDate.parse("2024-11-01"), 10.0));
        pharmacy.addMedicine(new Medicine("Trazodone", 30, "KLM Pharma", LocalDate.parse("2025-09-01"), 9.0));
        pharmacy.addMedicine(new Medicine("Carbamazepine", 26, "NOP Pharma", LocalDate.parse("2025-04-01"), 13.0));
        pharmacy.addMedicine(new Medicine("Spironolactone", 20, "PQR Pharma", LocalDate.parse("2026-01-01"), 11.5));
        pharmacy.addMedicine(new Medicine("Venlafaxine", 15, "QRS Pharma", LocalDate.parse("2025-12-01"), 14.5));
        pharmacy.addMedicine(new Medicine("Levothyroxine", 28, "STU Pharma", LocalDate.parse("2025-06-01"), 18.0));
        pharmacy.addMedicine(new Medicine("Paroxetine", 22, "VWX Pharma", LocalDate.parse("2025-03-01"), 10.5));
        pharmacy.addMedicine(new Medicine("Prednisolone", 25, "YZA Pharma", LocalDate.parse("2024-10-01"), 12.0));
        pharmacy.addMedicine(new Medicine("Metronidazole", 19, "BCD Pharma", LocalDate.parse("2025-11-01"), 7.0));
        pharmacy.addMedicine(new Medicine("Omeprazole", 24, "EFG Pharma", LocalDate.parse("2025-07-01"), 6.0));
        pharmacy.addMedicine(new Medicine("Cetirizine", 25, "XYZ Pharma", LocalDate.parse("2025-07-01"), 5.0));
        pharmacy.addMedicine(new Medicine("Loratadine", 18, "LMN Pharma", LocalDate.parse("2024-11-01"), 7.5));
        pharmacy.addMedicine(new Medicine("Metformin", 20, "ABC Pharma", LocalDate.parse("2025-09-01"), 12.5));
        pharmacy.addMedicine(new Medicine("Omeprazole", 15, "DEF Pharma", LocalDate.parse("2025-05-01"), 13.0));
        pharmacy.addMedicine(new Medicine("Lipitor", 28, "GHI Pharma", LocalDate.parse("2026-02-01"), 20.0));
        pharmacy.addMedicine(new Medicine("Zoloft", 22, "JKL Pharma", LocalDate.parse("2025-12-01"), 18.5));
        pharmacy.addMedicine(new Medicine("Atenolol", 30, "MNO Pharma", LocalDate.parse("2024-08-01"), 9.0));
        pharmacy.addMedicine(new Medicine("Prednisone", 19, "PQR Pharma", LocalDate.parse("2025-10-01"), 11.0));
        pharmacy.addMedicine(new Medicine("Hydrochlorothiazide", 24, "STU Pharma", LocalDate.parse("2025-06-01"), 8.0));
        pharmacy.addMedicine(new Medicine("Doxycycline", 17, "VWX Pharma", LocalDate.parse("2024-12-01"), 15.0));
        pharmacy.addMedicine(new Medicine("Furosemide", 18, "YZA Pharma", LocalDate.parse("2025-03-01"), 14.5));
        pharmacy.addMedicine(new Medicine("Amlodipine", 20, "BCD Pharma", LocalDate.parse("2026-01-01"), 16.0));
        pharmacy.addMedicine(new Medicine("Naproxen", 21, "EFG Pharma", LocalDate.parse("2025-07-01"), 10.0));
        pharmacy.addMedicine(new Medicine("Fluoxetine", 23, "HIJ Pharma", LocalDate.parse("2024-10-01"), 9.5));
        pharmacy.addMedicine(new Medicine("Salbutamol", 30, "KLM Pharma", LocalDate.parse("2025-08-01"), 5.5));
        pharmacy.addMedicine(new Medicine("Clopidogrel", 27, "NOP Pharma", LocalDate.parse("2025-11-01"), 14.0));
        pharmacy.addMedicine(new Medicine("Warfarin", 18, "QRS Pharma", LocalDate.parse("2025-04-01"), 16.5));
        pharmacy.addMedicine(new Medicine("Citalopram", 14, "TUV Pharma", LocalDate.parse("2025-05-01"), 12.0));
        pharmacy.addMedicine(new Medicine("Levothyroxine", 16, "WXY Pharma", LocalDate.parse("2025-09-01"), 19.0));
        pharmacy.addMedicine(new Medicine("Tamsulosin", 20, "ZAB Pharma", LocalDate.parse("2025-12-01"), 11.5));
        pharmacy.addMedicine(new Medicine("Gabapentin", 22, "CDE Pharma", LocalDate.parse("2024-11-01"), 13.5));

        Scanner sc = new Scanner(System.in);
        System.out.print("Are you a Pharmacist or Customer? ");
        String role = sc.nextLine().trim().toLowerCase();

        
      
        switch (role) {
            case "pharmacist":{
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                User user = pharmacy.login(username, password);
                if (user instanceof Pharmacist) {
                    System.out.println("Pharmacist logged in successfully!");
                    System.out.println("Available medicines:");
                    List<Medicine> meds = pharmacy.getMedicines();
                    int count = 0;
                    for (Medicine med : meds) {

                        System.out.println((count + 1) + ". " + med.getName() + " - $" + med.getPrice());
                        count++;
                    }

                    String addMore;
                    do {
                        System.out.print("Do you want to add a new medicine? (y/n): ");
                        addMore = sc.nextLine().trim().toLowerCase();

                        if (addMore.equals("y")) {
                            System.out.print("Enter medicine name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter price: ");
                            double price = Double.parseDouble(sc.nextLine());

                            System.out.print("Enter quantity: ");
                            int quantity = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter company name: ");
                            String company = sc.nextLine();

                            System.out.print("Enter expiry date (YYYY-MM-DD): ");
                            String expiryInput = sc.nextLine();
                            LocalDate expiryDate;
                            try {
                                expiryDate = LocalDate.parse(expiryInput);
                                if (expiryDate.isBefore(LocalDate.now())) {
                                    System.out.println("Error: Expiry date cannot be in the past.");
                                    continue;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid date format.");
                                continue;
                            }

                            if (quantity < 0 || price < 0 || company.isEmpty() || name.isEmpty()) {
                                System.out.println("Error: Invalid input.");
                                continue;
                            }

                            pharmacy.addMedicine(new Medicine(name, quantity, company, expiryDate, price));
                            System.out.println("Medicine added successfully!");
                        } else if (!addMore.equals("n")) {
                            System.out.println("Invalid choice.");
                        }

                    } while (!addMore.equals("n"));

                    System.out.print("Thanks for using the pharmacy system. Do you want to log out? (y/n): ");
                    String logout = sc.nextLine().trim().toLowerCase();
                    if (logout.equals("y")) {
                        System.out.println("Logged out successfully!");
                    } else {
                        System.out.println("You are still logged in.");
                    }
                } else if (user == null) {
                    System.out.println("Invalid username or password.");

                } else {
                    System.out.println("Login failed!");
                }
            }
            //customer loop 
            case "customer": {
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                Customer customer = new Customer("guest", "", name);
                Order order = new Order(customer);
                System.out.println("Available medicines:");
                ArrayList <Medicine> meds = pharmacy.getMedicines();
                int count = 0;
                for (Medicine med : meds) {

                    System.out.println((count + 1) + ". " + med.getName() + " - $" + med.getPrice());
                    count++;
                }
                
                String choice = "y"; // initialize before the loop
                do {
                    System.out.print("Enter the number of the medicine you want to buy (or 0 to finish): ");
                    int num = Integer.parseInt(sc.nextLine());
                    if (num == 0) {
                        break;
                    }
                    if (num < 1 || num > meds.size()) {
                        System.out.println("Invalid number.");
                        continue;
                    }
                    Medicine selected = meds.get(num - 1);
                    System.out.print("How many? ");
                    int qty = Integer.parseInt(sc.nextLine());
                    order.addMedicine(selected, qty);

                    System.out.print("Do you want to add more? (y/n): ");
                    choice = sc.nextLine().trim().toLowerCase();
                } while (choice.equals("y"));
                Invoice invoice = new Invoice("INV001", customer, order.getMedicines(), order.getQuantities());

                System.out.println(invoice.printInvoice());

                //Save invoice in Excel Sheet file 
                try {
                    FileWriter writer = new FileWriter("Order2.csv", true); // true = append mode
                    writer.write(invoice.printInvoice()); // add some spacing between invoices
                    writer.close();
                    System.out.println("Invoice saved successfully!");
                } catch (IOException e) {
                    System.out.println("An error occurred while saving the invoice.");
                }
            }

            default : System.out.println("Invalid role. Please restart.");

        }
        sc.close();

    }

}
