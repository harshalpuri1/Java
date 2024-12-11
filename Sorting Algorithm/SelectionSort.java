public class SelectionSort {
    public static void Selection(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                }
            }
            //swap 
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,8,9,7,3,1,2,0};
        Selection(arr);
        print(arr);
    }
}
