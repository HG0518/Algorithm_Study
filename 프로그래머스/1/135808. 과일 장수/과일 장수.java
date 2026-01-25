class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int score_len=score.length;
        int[] score_num=new int[score_len+1];
        
        for(int i=0;i<score_len;i++){
            score_num[score[i]]++;
        }
    
        int index=k;
        for(int i=0;i<score_len/m;i++){
            for(int j=0;j<m;j++){
                while(score_num[index]==0)index--;
                score_num[index]--;
            }
            answer+=index*m;
        }
        return answer;
    }
}