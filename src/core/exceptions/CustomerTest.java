package core.exceptions;

import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {

        //create an array of customers
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(101, "John", "Doe", "john@email.com");
        customers[1] = new Customer(102, "James", "Walker", "james@email.com");
        customers[2] = new Customer(103, "Joe", "Pasala", "joe@email.com");

        System.out.println("Enter Customer ID to Display Details >>>");
        int id = new Scanner(System.in).nextInt();

        search(customers, id);

    }

    private static void search(Customer[] customers, int id) {
        boolean flag = false;
        for (Customer customer : customers) {
            if (customer.custId() == id) {
                System.out.println(customer);
                flag = true;
                break;
            }
        }
        if (!flag) throw new CustomerNotFoundException("No Customer Found With ID : " + id);
    }
}
