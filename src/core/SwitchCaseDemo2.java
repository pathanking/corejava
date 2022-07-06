package core;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            System.out.println("Select Your Fav Item >>>");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enjoy Hyderabadi Dum Biryani");
                    break;
                case 2:
                    System.out.println("Enjoy North Indian Thali");
                    break;
                case 3:
                    System.out.println("Enjoy South Indian Thali");
                    break;
                case 4:
                    System.out.println("Enjoy Idli");
                    break;
                case 5:
                    System.out.println("Enjoy Dosa");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do You Want to Continue? [1 - YES | 2 - NO]");
            int choice = scanner.nextInt();
            if (choice == 1)
                flag = true;
            else flag =false;
        } while (flag);
    }

    public static void showMenu() {
        System.out.println("***** WELCOME TO FIVE STAR RESTAURANT *****");
        System.out.println("[1] Hyderabadi Dum Biryani");
        System.out.println("[2] North Indian Thali");
        System.out.println("[3] South Indian Thali");
        System.out.println("[4] Idli");
        System.out.println("[5] Dosa");
        System.out.println("***** Pls Give Your Feedback *****");
    }

}
