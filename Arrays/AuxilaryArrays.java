// Helper Array
public class AuxilaryArrays {
    public static int TrappedWater(int height[]){
        int n=height.length;
        // leftMax Array
        int leftMax[] = new int[n];
        leftMax[0]= height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Rightmax Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }

        int trapWater =0;
        // Loop
        for(int i=0; i<n; i++ ){
            // calculate water level
            int watLev = Math.min(leftMax[i], rightMax[i]);
            
            //Trapped water
            trapWater += watLev - height[i];
        }

        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(TrappedWater(height));
    }
}
