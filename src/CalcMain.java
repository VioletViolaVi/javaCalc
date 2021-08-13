import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose: a = Add, s = Subtract, x = Exit ");
        String userLetterChoice = scanner.next();

        while (!userLetterChoice.equalsIgnoreCase("x")) {
            if(userLetterChoice.equalsIgnoreCase("a") || userLetterChoice.equalsIgnoreCase("s")) {
                System.out.println("Enter your 1st number: ");
                int first = scanner.nextInt();
                System.out.println("Enter your 2nd number: ");
                int second = scanner.nextInt();
                if (userLetterChoice.equalsIgnoreCase("a")) {
                    System.out.println(calc.addNumbers(first, second));
                } else {
                    System.out.println(calc.subtractNumbers(first, second));
                }
            } else {
                System.out.println("Invalid Input!");
            }
            System.out.println("Choose: a = Add, s = Subtract, x = Exit ");
            userLetterChoice = scanner.next();
        }
        System.out.println("Thanks & Goodbye!");

    }
}
