class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = findgcd(numsDivide);
        Arrays.sort(nums);
   
        for(int i=0;i<nums.length;i++){
            if(gcd % nums[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public int findgcd(int[] nums){
        int ans = nums[0];
       for(int i=1;i<nums.length;i++){
           ans =  gcd(ans,nums[i]); 
       }
       return ans;
    }
    public static int gcd(int a,int b){
        if(a == 0)
        return b;

        return gcd(b%a,a);
    }
}
