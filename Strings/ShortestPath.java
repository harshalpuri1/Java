import java.util.Scanner;

public class ShortestPath {

    public static float Shortestpath(String str){
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            }else if (dir == 'W') {
                x--;
            }else if (dir == 'N') {
                y++;
            }else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        
        return (float) Math.sqrt(x2+y2);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Direction like WNEENESENNN to check Shortest Path: ");
        String str = sc.next();
        sc.close();
        
        System.out.println(Shortestpath(str));
    } 
}
