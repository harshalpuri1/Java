import java.util.Scanner;
public class Fibonacci{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        
        PrintFibonacci(n);
    }

// Print fibinacci no to n

    public static void PrintFibonacci (int n){
        int first = 0;
        int second = 1;
        if (n < 1) {
            System.out.println("Invalid Number of terms");
            return;
        }
        System.out.print(first+" ");

        if(n==1)
        return;
            System.out.print(second+" ");
        
        for(int i=3; i<=n; i++){
            int fib = first + second;
            System.out.print(fib +" ");
            first= second;
            second = fib;
            }
        
    }

}