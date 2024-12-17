public class ithBit {
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
    public static int UpdateithBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // }
        int clear = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return bitmask | clear;
    }

    public static int clearLastIthBit(int n, int i) {
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }

    public static int clearRangeofBits(int n, int i, int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
 
    public static void main(String[] args) {
        System.out.println(getithBit(10, 3));
        System.out.println(setithBit(10, 2));
        System.out.println(clearIthBit(10, 2));
        System.out.println(UpdateithBit(10, 4, 0 ));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearRangeofBits(10, 2, 4 ));
    }
}
