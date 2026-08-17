class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int max = 0;
    //     StringBuilder sb = new StringBuilder();
    //     for(int i = 0; i < s.length(); i++){
    //         int c = 0;
    //         for(int j = i; j < s.length(); j++){
    //             char ch = s.charAt(j);
    //             if(sb.indexOf(ch + "") != -1){
    //                 sb.setLength(0);
    //                 break;
    //             }
    //             else{
    //                 sb.append(ch + "");
    //                 c++;
    //             }

    //         }
    //         max = Math.max(max,c);
    //     }
    // return max;
    HashMap<Character,Integer> map = new HashMap<>();
    int len = 0;
    int l = 0;
    for(int r = 0; r < s.length(); r++){
        char c = s.charAt(r);
        if(!map.containsKey(c)){
            
            map.put(c,r);
        }
        else{
            if(map.get(c) >= l){
                l = map.get(c) + 1;
            }
        }
        map.put(c,r);
        
        len = Math.max(len,r-l+1);
    }


    return len;
    // neww
    }
}