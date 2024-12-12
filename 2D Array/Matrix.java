import java.util.Scanner;

public class Matrix {

    public static void Largest(int matrics[][]){
        int larg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < matrics.length; i++) {
            for (int j = 0; j < matrics[0].length; j++) {
                if (matrics[i][j]>larg) {
                    larg = matrics[i][j];
                }
                if (matrics[i][j]<small) {
                    small = matrics[i][j];
                }
            }
        }
        System.out.println("Largest no is : "+larg);
        System.out.println("Smallest no is : "+small);
    }

    public static boolean Search(int matrics[][], int key) {
        for (int i = 0; i < matrics.length; i++) {
            for(int j=0; j<matrics[0].length; j++){
                if (matrics[i][j]==key) {
                    System.out.println("Key found at index ("+i+","+j+")");
                }
            }
        }
        return true;
    }
     public static void main(String[] args) {
        int matrics[] [] = new int[3][3];
        int n = matrics.length, m = matrics[0].length;
        
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers for matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrics[i] [j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i <n; i++) {
            for(int j=0; j<m; j++){
                System.out.print(matrics[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

        Search(matrics, 9);
        Largest(matrics);

     }
}