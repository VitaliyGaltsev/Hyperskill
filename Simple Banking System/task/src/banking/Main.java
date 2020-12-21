package banking;

import com.jogamp.common.net.Uri;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Create an account" + "\n" +
                           "2. Log into account" + "\n" +
                           "0. Exit");

        Scanner sc = new Scanner(System.in);
        int input;
        while(!sc.hasNext("0") || sc.hasNext("< 3")) {
            input = sc.nextInt();

            switch (input) {
                case 1:
                    new Account();
                    break;
                case 2:
                    logIn();
                    break;
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
            }

        }
    }

    private static void logIn() {
        String pin = null;

        System.out.println("Enter your card number: ");

        System.out.println("Enter your PIN: ");
        pin = new Scanner(System.in).nextLine();

        while(!pin.equals())
        System.out.println();
    }


    private static void createAccount() {
        String generatedNumber = Random.;
        String cardNumber = "400000" + generatedNumber;
        String cardPin;




            }
}