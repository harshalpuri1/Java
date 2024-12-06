import java.util.Scanner;

public class BInToDec {

    public static void BinToDeci(int n){
        int pow = 0;
        int dec = 0;

        while(n>0){
            int ld = n%10;
            dec = dec+(ld* ((int)Math.pow(2, pow)));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal no is: "+ dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no: ");
        int n = sc.nextInt();
        BinToDeci(n);
        sc.close();
    }
}
