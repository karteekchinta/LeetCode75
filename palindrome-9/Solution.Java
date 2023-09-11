class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0 && x!=0)){
            return false;
        }
        int reverseSum =0;
        while(x>reverseSum){
           int pop = x%10;
            reverseSum= reverseSum*10+pop;
            x=x/10;
        }
            return x==reverseSum || x==reverseSum/10;
    }
}