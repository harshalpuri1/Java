import java.util.*;
// Print no in decreasing order
public class NoDecOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
    IncreasingNo NO = new IncreasingNo();
    IncreasingNo.PrintIncNo(n);
        Noprint(n);
    }

    public static void Noprint(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        Noprint(n-1);
    }
    
}

// Print no in increasing order

class IncreasingNo {

    public static void PrintIncNo(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        PrintIncNo(n-1);

        System.out.println(n);
    }
}