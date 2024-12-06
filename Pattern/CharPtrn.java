import java.util.*;

public class CharPtrn {
    public static void main(String[] args) {
        char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }    
}
