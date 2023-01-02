//Naive Approach 

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int maxval = Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
             int k=i;
            for(j=0;j<nums.length;j++){
               sum += nums[k%n]*j;
                k++;
            }
            maxval = Math.max(maxval,sum);
        }
        return maxval;
    }
}


//Optimised Approach
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int maxval = Integer.MIN_VALUE;
        int tsum = 0, firstsum = 0;
        for(int i=0;i<n;i++){
            tsum += nums[i];
            firstsum += (nums[i]*i);
        }

        maxval = firstsum;
        for(int i=0;i<n;i++){
            firstsum = firstsum - tsum + nums[i]*n;
            maxval = Math.max(maxval,firstsum); 
        }
        return maxval;
    }
}
