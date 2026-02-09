import java.util.*;

class Solution {
    int count;
    public int solution(int n) {
        count=0;
        int sum=0;
        int i=0;
        getCount(sum,i,n*2);
        return count;
    }
    
    public void getCount(int sum, int i, int n){
        if(sum<0 || sum>n/2) return;
        if(i==n){
            if(sum==0)count++;
            return;
        }
        getCount(sum+1,i+1,n);
        getCount(sum-1,i+1,n);
    }
}