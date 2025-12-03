class Solution {
    public double myPow(double x, int n) {
        return helperPow(x,n);
    } 
    private double helperPow(double x, long n) {
        if(n==0) return 1.0;
        if(n<0) return 1.0/helperPow(x,-n);
        if(n%2==0) return helperPow(x*x,n/2);
        else return x*helperPow(x*x,(n-1)/2);
    } 
}