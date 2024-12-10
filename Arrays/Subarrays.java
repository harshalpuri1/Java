public class Subarrays {

    public static void PrintMaxSubarrays(int array[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for(int j=i; j< array.length; j++){
                int end = j;
                curr = 0;
                for(int k=start; k<=end; k++){
                    curr += array[k];
                    if (max < curr) {
                        System.out.println("Current sum: "+curr);
                        max = curr;
                    }
                }
            }
        }
        System.out.println("Max Sum: "+max);
    }


    public static void PrintSubarrays(int array[]){
        int ttl = 0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for(int j=i; j< array.length; j++){
                int end = j;
                System.out.print("[");
                for(int k=start; k<=end; k++){
                    System.out.print(" "+array[k]+ " ");
                } System.out.println("]");
                ttl++;

            }System.out.println();
        }System.out.println(ttl);
    }
    public static void main(String[] args) {
        int array[] ={10,20,2,4,6,8};
        PrintMaxSubarrays(array);
    }
}
