import java.util.*;

public class LinearSearch {

    public static void LargestN(int numbers[]){
        int larg = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(numbers.length);
        for (int i=0; i<numbers.length; i++){
            if(larg<numbers[i]){
                larg= numbers[i];
            }
            if(min>numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println(larg+" is the Largest number in this array");
        System.out.println(min+" is the Smallest number in this array");

    }

    public static int LinearSrch(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={45, 55, 11, 88, 2, 3, 46, 5, 6, 7, 8, 9, 10, 99, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key that you have to find: ");
        int key = sc.nextInt();
        int ans = LinearSrch(numbers, key);
        
        LargestN(numbers);

        if(ans == -1){
            System.out.println("Given key is Not found");
        } else {
            System.out.println("Key is found at index "+ans);
        }
        sc.close();
    }
}
