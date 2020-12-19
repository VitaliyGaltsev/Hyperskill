import java.util.Scanner;

class Converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double result = convertStringToDouble(input);

        System.out.println(result);

    }
   

    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
