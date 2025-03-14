import java.util.*;
public class Fibonacci{

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        System.out.println(NthFibonacci(n));
        // NthFibonacci(n);
    }

// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).

    public static int NthFibonacci (int n){
        int fibn;
        if(n==0 || n==1){
            return n;
        }

        fibn = NthFibonacci(n-1) + NthFibonacci(n-2);
        // System.out.print(fibn+" ");
        return fibn;
    }

}