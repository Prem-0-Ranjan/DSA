class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(k < arr[0]) return k;

        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int miss = arr[mid] - (mid + 1);
            if(miss < k) low = mid + 1;
            else high = mid - 1;
        }
        int missing = arr[high] - (high + 1);
        int more = k - missing;
        return arr[high] + more;
    }
}