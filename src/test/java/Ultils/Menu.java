package Ultils;

import entity.Customer;

import java.util.HashMap;
import java.util.Scanner;

import static entity.addCustomer.addCustomer;
import static entity.findByName.findByName;


public class Menu {
    public static HashMap<String, Customer> customerHashMap = new HashMap<>();
    private static Scanner Menu = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.printf("1.Add new Customer \n");
            System.out.printf("2.Find by name \n");
            System.out.printf("3.Display all \n");
            System.out.printf("4.Exit \n");
            System.out.printf("****************** \n");
            System.out.printf("Enter your choice!");
            choice = Ultils.Menu.Menu.nextInt();
            Ultils.Menu.Menu.nextLine();
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.out.printf("Exit program !");
                    break;
                default:
                    System.out.printf("Please enter Choose !");
            }

        } while (choice != 4);
        Menu.close();


    }


    private static void displayAll() {
        if (customerHashMap.isEmpty()) {
            System.out.println("No customers to display.\n");
        } else {
            System.out.println("All Customers:");
            for (Customer customer : customerHashMap.values()) {
                System.out.println("Name: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Phone: " + customer.getPhone());
                System.out.println("--------------------");
            }


        }
    }
}
