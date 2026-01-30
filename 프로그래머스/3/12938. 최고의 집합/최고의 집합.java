import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        
        if(s<n)return new int[]{-1};
        
        int elements=s/n;
        int mod=s%n;
        
        int[] answer = new int[n];
        Arrays.fill(answer,elements);
        
        for(int i=0;i<mod;i++)
            answer[n-1-i]++;
        return answer;
    }
}