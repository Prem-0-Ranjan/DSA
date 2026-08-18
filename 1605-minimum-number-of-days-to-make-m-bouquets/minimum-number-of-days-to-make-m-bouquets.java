class Solution {
    public int minDays(int[] bloomday, int m, int k) {
        if((long)m*k > bloomday.length) return -1;
        int min = 1000000000;
        int max = 1;
        int ans = 1;
        for(int x : bloomday){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }

        while(min <= max){
            int mid = min + (max - min)/2;
            if(check(bloomday,mid,m,k)){
                max = mid - 1;
                ans = mid;
            }
            else min = mid + 1;
        }
        return ans;
    }
    boolean check(int[] arr,int days, int m, int k){
        int c = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= days) c++;
            else c = 0;

            if(c==k){
                b++;
                c = 0;
            }
        }
        return b >= m;
    }
}