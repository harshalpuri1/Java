import java.util.Scanner;

public class isEven {
    public static boolean IsEven(int n){
        if (n/2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        System.out.println(IsEven(n));
        sc.close();

    }
}