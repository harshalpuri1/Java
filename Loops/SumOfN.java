package Loops;
// Print sum of N natural numbers

import java.util.*;

public class SumOfN {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for sum of natural No. : ");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        sc.close();
    }
}
