import java.util.Scanner;

public class First {
    public static void PrintHello() {
        System.out.println("Hello Harshal");
    }
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        PrintHello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Sum is: "+ Sum(a, b));
        sc.close();
    }
}
