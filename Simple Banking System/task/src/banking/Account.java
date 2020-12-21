package banking;

import java.util.Random;

public class Account {
    final static double IIN = 400000L;
//    private String lastDigits;
    double cardNumber;
    short cardPin;
    double custommerAccount;


    private static void createCardNumber() {
        Random random = new Random();
        double min = 0L;
        double max = 9999999999L;
        double custommerAccount = random.nextDouble(max - min) + min;

        return IIN.concat(custommerAccount);
        }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }


        System.out.println("Your card has been created" + "\n" +
                "Your card number: " + "\n" + cardNumber + "\n" +
                "Your card PIN: " + cardPin);
    }
}