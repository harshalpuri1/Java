package Loops;
public class FindIndex {
    public static int findIndex(int[] inputArray, int n) {
        int left = 0, right = inputArray.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (inputArray[mid] == n) {
                return mid;
            } else if (inputArray[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1, 3, 5, 6};
        int n1 = 5;
        System.out.println(findIndex(inputArray1, n1));  // Output: 2

        int[] inputArray2 = {1, 3, 5, 6};
        int n2 = 7;
        System.out.println(findIndex(inputArray2, n2));  // Output: 4
    }
}
