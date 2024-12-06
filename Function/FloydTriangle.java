import java.util.Scanner;

public class FloydTriangle {

    public static void FloydTringle(int n){
        int counter =1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }   System.out.println();
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows or Columns: ");
        int n = sc.nextInt();
        FloydTringle(n);
        sc.close();
    }
}
