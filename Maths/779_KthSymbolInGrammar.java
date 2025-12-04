class Solution {
    public int kthGrammarHelper(int n, int k, int flip) {
        if(n==1) {
            return flip%2==0 ? 0 : 1;
        }
        if(k%2==0) {
            return kthGrammarHelper(n-1,k/2,flip+1);
        }
        return kthGrammarHelper(n-1,(k+1)/2,flip);
    }
    public int kthGrammar(int n, int k) {
        return kthGrammarHelper(n,k,0);
    }
}
