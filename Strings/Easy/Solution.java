public class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen==0) return 0;
        for(int i=0;i<=hlen-nlen;i++) {
            boolean match = true;
            for(int j=0;j<nlen;j++) {
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match) return i;    
        }
        return -1;
    }
} 
