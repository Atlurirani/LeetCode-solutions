class Solution {
    public int reverse(int x) {
        int rev=0;
        boolean isNegative=x<0;
        if(isNegative){
            x=-x;
        }
       while(x>0){
            int digit=x%10;
            if(rev>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            rev=rev*10+digit;
            x=x/10;
       }
       if(isNegative){
        rev=-rev;
       }
       return rev;
    }
}