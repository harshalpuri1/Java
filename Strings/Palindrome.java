import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(String str){

        int n = str.length();
        for (int i=0; i<=n/2; i++) {
           if (str.charAt(i) != str.charAt(n-1-i)) {
            return false;
           } 
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check Palindrome: ");
        String str = sc.next();
        sc.close();
        
        System.out.println(isPalindrome(str));
    }    
}
