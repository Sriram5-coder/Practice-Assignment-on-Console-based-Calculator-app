import java.util.Scanner;

public class Console_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: division by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the percentage: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num2 / 100));
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Result: " + fact);
                    break;
                case 7:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num1));
                    break;
                case 8:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num1 * num1));
                    break;
                case 9:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error: square root of negative number");
                    } else {
                        System.out.println("Result: " + Math.sqrt(num1));
                    }
                    break;
                case 10:
                    System.out.print("Enter the base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 11:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the root: ");
                    num2 = sc.nextDouble();
                    if (num1 < 0 && num2 % 2 == 0) {
                        System.out.println("Error: even root of negative number");
                    } else {
                        System.out.println("Result: " + Math.pow(num1, 1 / num2));
                    }
                    break;
                case 12:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
