package Strings.Arrays;

public class prdExceptItSelf {
    public static int[] productExceptSelf(int[] nums) {
        int result=1;
        int n=nums.length;
        int[] p=new int[n];
        for(int i=0;  i<nums.length; i++){
            result=result*nums[i];
        }
        for(int i=0;  i<nums.length; i++){
            p[i]=result/nums[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int [] v= productExceptSelf(nums);

        for (int val : v) {
            System.out.print(val + " ");
        }
    }
}
