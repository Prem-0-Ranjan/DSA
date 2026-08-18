class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int x : weights){
            min = Math.max(x,min);
            max += x;
        }
        int ans = max;
        while(min <= max){
            int mid = min + (max - min)/2;

            if(check(weights,days,mid)){
                max = mid - 1;
                ans = mid;
            }
            else min = mid + 1;
        }
        return ans;
    }
    boolean check(int[] arr, int days, int mid){
        int d = 0;
        int s = 0;
        for(int x : arr){
            s += x;
            if(s > mid){
                d++;
                s = x;
            }
            else if(s == mid){
                d++;
                s = 0;
            }
        }
        if(s != 0) d++;
        return d <= days;
    }
}