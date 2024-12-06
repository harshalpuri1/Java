package Loops;
import java.util.*;


public class ReverseN {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to reverse: ");
        int n = sc.nextInt();
        int revsN = 0;

        while (n>0){
            int lastNo = n%10;
            n = n/10;
            revsN = revsN * 10  + lastNo;
        }
        System.out.println("Reverse Number is : " + revsN);
        sc.close();
    }    
}

