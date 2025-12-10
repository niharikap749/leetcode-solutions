class Solution {
    //Solution 1
    public boolean isPowerOfTwoSol1(int n) {
       if(n==1) return true;
       if(n<=0 || n%2!=0) return false;

       return isPowerOfTwoSol1(n/2);
    }
    //Solution 2
    public boolean isPowerOfTwoSol2(int n) {
        if(n<=0) return false;
        return (n & (n-1))==0;
    }
}