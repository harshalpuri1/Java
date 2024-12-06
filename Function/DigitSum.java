import java.util.Scanner;

public class DigitSum {
    public static int Sum(int n){
        int sum = 0;

        while (n>0) {
            int ld = n%10;
            sum = ld + sum;
            n=n/10;
        } return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        System.out.println("The sum of "+n+ " is "+Sum(n));
        sc.close();
    }
}
