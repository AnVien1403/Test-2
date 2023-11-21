package entity;

import Ultils.Menu;


import java.util.Scanner;

import static Ultils.Menu.customerHashMap;

public class addCustomer {
    public addCustomer(String name, String email, String phone) {
    }

    public static void addCustomer() {
        Scanner addCustomer = new Scanner(System.in);
        System.out.printf("Enter customer name :");
        String name = addCustomer.nextLine();
        System.out.printf("Enter customer Email : ");
        String email = addCustomer.nextLine();
        System.out.printf("Enter customer Phone : ");
        String phone =addCustomer.nextLine();

        Customer customer = new Customer(name,email,phone);
        customerHashMap.put(phone,customer);

    }
}

