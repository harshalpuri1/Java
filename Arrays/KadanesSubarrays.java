public class KadanesSubarrays {

    public static void Kadane(int array[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            MaxSum = Math.max(MaxSum, currSum);
        }
        System.out.println(MaxSum);
    }
    public static void main(String[] args) {
        int array[] ={10,20,2,4,6,8,-8,-9,-10};
        Kadane(array);
    }
}
