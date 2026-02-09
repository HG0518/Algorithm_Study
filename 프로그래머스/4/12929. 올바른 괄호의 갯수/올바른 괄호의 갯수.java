import java.util.*;

class Solution {
    public int solution(int n) {
        int[][] visited=new int[n+1][n*2];
        for(int[] tmp:visited){
            Arrays.fill(tmp,-1);  
        }
        
        return getCount(0,0,n*2,visited);
    }
    
    public int getCount(int sum, int i, int n, int[][] visited){
        if(sum<0 || sum>n/2) return 0;
        if(i==n) return sum==0?1:0;
        if(visited[sum][i]!=-1) return visited[sum][i];
        visited[sum][i]=getCount(sum+1,i+1,n,visited)+getCount(sum-1,i+1,n,visited);
        return visited[sum][i];
    }
}