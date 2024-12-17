public class OddEven {
    public static void isOddEven(int n) {
        if ((n & 1)==0) {
            System.out.println(n + " is Even no");
        }else{
            System.out.println(n + " is Odd no");
        }
    }

    public static int getithBit(int n, int i){
        if ((n&(1<<i))==0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        isOddEven(10);
        isOddEven(11);
        isOddEven(2);
        System.out.println(getithBit(10, 3));
        System.out.println(setithBit(10, 2));
        System.out.println(clearIthBit(10, 2));
    }
}
