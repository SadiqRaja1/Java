public class Question_four {
    public static void main(String args[]) {
        int input1 [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int input2 [] = {4,2,0,3,2,5};
        System.out.println(trap(input1)); 
        System.out.println(trap(input2)); 
    }
    public static int trap(int height []){
        int n = height.length;

        int res = 0, l = 0, r = n-1;
        int rMax = height[r],lMax =height[l];

        while (l < r) {
            if (lMax<rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax -height[l];
            }else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res+= rMax - height[r];
            }
        }
        return res;
    }
}
