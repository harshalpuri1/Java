package Loops;
import java.util.*;

public class DoWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int SumEven = 0;
        int SumOdd= 0;

        do {
            System.out.print("Enter a Number : ");
            n = sc.nextInt();

            if (n % 2 == 0){
                SumEven += n;
            }else {
                SumOdd += n;
            }

            System.out.println("Do you want to Continue? Enter 1 for Yes and 0 for No");
            choice = sc.nextInt();

        }while (choice==1);

        System.out.println("Sum of Even no is " + SumEven);
        System.out.println("Sum of Odd no is " + SumOdd);
        sc.close();
    } 
}
