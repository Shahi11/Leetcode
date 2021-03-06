class Solution {
    public boolean isPerfectSquare(int num) {
  int lo=1; int hi=num;long mid=-1;
    while(lo<=hi){
         mid = lo +(hi-lo)/2;
        if(mid*mid==num){
            return true;
        }
       else if(mid*mid>num){
            hi=(int)mid-1;
        }
        else{
            lo=(int)mid+1;
        }
    }
    return false;

    }
}