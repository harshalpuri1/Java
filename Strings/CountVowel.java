import java.util.*;
public class CountVowel {

    public static void LowercaseVowelCount(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch== 'a'|| ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        System.out.println("Number of lowecase vowels in strings are: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        LowercaseVowelCount(str);
        sc.close();

        String str1 = "Apnacollege".replace("l", "");
        System.out.println(str1);
        String str2 = "Harshal Puri";
        String str3 = "Harshal Puri";
        System.out.println(str2.equals(str1)+" "+str2.equals(str3));
    }   
}
