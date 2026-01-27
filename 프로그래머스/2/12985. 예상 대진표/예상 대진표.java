class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int small=a<b?a:b;
        int big=a>b?a:b;
        int gameNum=(int)(Math.log(n)/Math.log(2));
        for(;answer<=gameNum;answer++){
            if(small+1==big){
                if(small%2==1) break;
            }
            small=nextNum(small);
            big=nextNum(big);
        }
        
        return answer;
    }
    
    private int nextNum(int n){
        return n%2==0?n/2:n/2+1;
    }
}