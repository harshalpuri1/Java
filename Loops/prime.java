package Loops;
import java.util.*;

public class prime {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();
            int div = 2;
            Boolean isPrime = true;
            while (div<n){
                if (n % div == 0){
                    System.out.println(n + " is not an Prime number");
                    isPrime = false;
                    break;
                } else {
                    div= div +1;
                }
            }
            if (isPrime){
                System.out.println(n + " is an Prime number");
            }
        } finally {
            sc.close();
        }
    }
}
