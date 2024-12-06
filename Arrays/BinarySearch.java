import java.util.Scanner;

public class BinarySearch {

    public static int BinarySrch(int array[], int key){
        int start = 0;
        int end = array.length-1;

        while (start <= end) {
            int mid = (start + end) / 2 ;

            if (array[mid] == key) {
                return mid;
            }

            //right
            if (array[mid] < key) { 
                start = mid +1;
            }

            //left
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key that you have to find: ");
        int key = sc.nextInt();
        int ans = BinarySrch(array, key);
        
        if(ans == -1){
            System.out.println("Given key is Not found");
        } else {
            System.out.println("Key is found at index "+ans);
        }
        sc.close();
    }
}
