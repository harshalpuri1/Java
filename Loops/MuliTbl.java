package Loops;
import java.util.*;
public class MuliTbl {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int table=0;
        for(int i=1; i<=10; i++){
            table = n*i;
            System.out.println(n+ " X " +i+ " = " +table );
        }

        sc.close();
    }
}
