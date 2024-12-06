import java.util.Scanner;

public class InvrtHlfPyramid {

    public static void HalfPyramidNo(int r){
        for (int i=1; i<=r; i++){
            for (int j=1; j<=r-i+1; j++){
                System.out.print(j+" ");
            }System.out.println();
        } 
    }

    public static void HalfPyramid(int r){
            for (int i=1; i<=r; i++){
                for (int j=1; j<=r-i; j++) {
                    System.out.print(" ");
                }
    
                for (int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }   
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows or Columns: ");
        int r = sc.nextInt();
        HalfPyramid(r);
        HalfPyramidNo(r);
        sc.close();
    }
}
