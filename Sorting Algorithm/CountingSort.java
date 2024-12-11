public class CountingSort {

    public static void Counting(int[] arr) {
        // step 1 : count frequency / largest no
        int larg = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            larg = Math.max(larg, arr[i]);
        }

        // step 2 : Update frequency in new array
        int count[] = new int[larg + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3 : Sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0,5,6,4,8,9,7,3,1,2,0};
        Counting(arr);
        print(arr);
    }  
}
