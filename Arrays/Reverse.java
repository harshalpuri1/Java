public class Reverse{

    public static void reverse(int array[]){
        int first = 0;
        int last = array.length -1;

        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int array[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        reverse(array);

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        } System.out.println();
    }
}