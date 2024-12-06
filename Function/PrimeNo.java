import java.util.Scanner;

public class PrimeNo {

    public static boolean Prime(int n){
        for(int i=2; i<=(0.5*n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void RangePrime(int n){
        for (int i=2; i<=n; i++){
            if (Prime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Prime(n));
        RangePrime(n);
        sc.close();
    }
}
