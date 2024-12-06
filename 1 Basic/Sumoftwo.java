import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter First number: ");
            int a = scanner.nextInt();
            System.out.print("Enter Second number: ");
            int b = scanner.nextInt();

            System.out.println("The Sum of two numbers is: " + (a + b));
        } finally {
            scanner.close();
        }
    }
}