import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pattern: ");
        int n = sc.nextInt();

        for (int i=n; i>0; i--){
            for (int j=i; j>1; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
