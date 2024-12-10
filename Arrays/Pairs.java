public class Pairs {

    public static void Pair(int array[]){
        int total = 0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+array[i]+","+array[j]+") ");
                total++;
            } System.out.println(" ");
        } System.out.println("Total pairs: "+total);
    }
    public static void main(String[] args){
        int array[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        Pair(array);
    }
}
