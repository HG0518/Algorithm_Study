import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[] now;
        int[] next=new int[]{triangle[0][0]};
        for(int i=0;i<triangle.length-1;i++){
            now=next;
            next=new int[i+2];
            for(int j=0;j<now.length;j++){
                inputNext(next,now[j]+triangle[i+1][j],j);
                inputNext(next,now[j]+triangle[i+1][j+1],j+1);
            }
        }
        int max=0;
        for(int i:next){
            if(max<i)max=i;
        }
        return max;
    }
    
    public void inputNext(int[] next, int sum, int j){
        if(next[j]==0) next[j]=sum;
        else next[j]=next[j]>sum?next[j]:sum;
    }
    
}