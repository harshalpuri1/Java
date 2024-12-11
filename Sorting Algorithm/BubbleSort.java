class BubbleSort {

    public static void BubleSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
        for (int j=0; j<arr.length-1-i; j++){
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
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
        int arr[] = {5,6,4,8,9,7,3,1,2,0};
        BubleSort(arr);
        print(arr);
    }
    
}