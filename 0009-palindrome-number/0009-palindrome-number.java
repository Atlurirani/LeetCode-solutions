class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int res=0;
        if(n<0){
           return false;
        }
        while(n>0){
           int digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
        if(temp==res){
            return true;
        }else{
            return false;
        }
    }
}