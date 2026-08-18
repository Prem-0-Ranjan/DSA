class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int min = 1;
        int max = 0;
        for(int x : nums){
            max = Math.max(x,max);
        } 

        int ans = 1;
        while(min <= max){
            int mid = min + (max - min)/2;
            
            if(check(nums,mid,t)){
                ans = mid;
                max = mid - 1;
            }
            else min = mid + 1;
            
        }
        return ans;
    }
    boolean check(int[] arr, int ans, int t){
        int sum = 0;
        for(int x : arr){
            sum += Math.ceil(x/(ans * 1.0));
        }
        return sum <= t;
    }
}