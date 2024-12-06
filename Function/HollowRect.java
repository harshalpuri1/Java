import java.util.Scanner;

public class HollowRect {
    public static void Hollow_Rectangle(int r, int c){
        for (int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if (i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Rows and Columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        Hollow_Rectangle(r,c);
        sc.close();
    }
}
