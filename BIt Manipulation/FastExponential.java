public class FastExponential {

    public static int FastExpo(int n , int p){
        int ans = 1; 
        while (p > 0) {
            if ((p & 1)!= 0) {
                ans = ans * n;
            }
            n = n*n; 
            p = p>>1; 
        }
        return ans;
    }
    public static void main (String[] args){
        System.out.println(FastExpo(2,3));
    }
}
