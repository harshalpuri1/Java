import java.util.*;

public class BinomalCoefficient {
   public static int Fact(int n){
        int f= 1;
        for (int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static int BinCoef(int n,int r){
                // Binomial Coefficient 
                int factN = Fact(n);
                System.out.println("Factorial of n: " + factN);
                int factR = Fact(r);
                System.out.println("Factorial of r: " + factR);
                int factNR = Fact(n-r);
                System.out.println("Factorial of n-r: " + factNR);
                int BinCoe = factN / (factR * factNR);
                return BinCoe;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: " );
        int r = sc.nextInt();
        System.out.println("Binomial coefficient is : "+ BinCoef(n,r));
        sc.close();
    }
}