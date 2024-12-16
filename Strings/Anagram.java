import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = sc.next();
        System.out.println("Enter string 2: ");
        String str2 = sc.next(); 

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length()==str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean anagram = Arrays.equals(str1CharArray, str2CharArray);

            if (anagram) {
                System.out.println("The given strings are anagram of each other");
            }
        }else{
            System.out.println("The given strings are not anagram of each other");
        }
        sc.close();
    }
}