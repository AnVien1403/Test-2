package entity;

import java.util.Scanner;

import static Ultils.Menu.customerHashMap;

public class findByName {
    public static void findByName(){
        Scanner findByName = new Scanner(System.in);
            System.out.println("\nFinding customer by name:");
            System.out.print("Enter name to search: ");
            String name = findByName.nextLine();

            Customer customer = customerHashMap.get(name);
            if (customer != null) {
                if (customer.getPhone() != null && !customer.getPhone().isEmpty()) {
                    System.out.println("Customer details: " + customer);
                } else {
                    System.err.println("Customer found, but their phone number is Not found");
                }
            } else {
                System.err.println("Can't find the customer with the name: " + name);
            }
        }

    }

