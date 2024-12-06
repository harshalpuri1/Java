import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n){
        int realN = n;
        int rev = 0;

        while (n>0) {
            int ld = n%10;
            rev = ld + rev*10;
            n=n/10;
        } return realN == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        System.out.print(isPalindrome(n));
        sc.close();
    }
}
