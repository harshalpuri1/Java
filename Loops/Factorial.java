import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the number for Factorial: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n +" is " + fact );
        sc.close();
    }
}
