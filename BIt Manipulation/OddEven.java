public class OddEven {
    public static void isOddEven(int n) {
        if ((n & 1)==0) {
            System.out.println(n + " is Even no");
        }else{
            System.out.println(n + " is Odd no");
        }
    }

    public static void main(String[] args) {
        isOddEven(10);
        isOddEven(11);
        isOddEven(2);
    }
}
