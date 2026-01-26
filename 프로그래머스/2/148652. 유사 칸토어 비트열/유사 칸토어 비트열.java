class Solution {
    public int solution(int n, long l, long r) {
        int answer = (int)(cal_one(n,r)-cal_one(n,l-1));
        return answer;
    }
    
    private long cal_one(int n, long r){
        if(r==0) return 0;
        if(n==0) return 1;

        long blockLen=(long)Math.pow(5,n-1);
        long preOneNum=(long)Math.pow(4,n-1);
        int blockNum=(int)(r/blockLen);
        long mod=r%blockLen;
        
        long oneNum=0;
        if(blockNum<2) oneNum=preOneNum*blockNum+cal_one(n-1,mod);
        else if(blockNum==2) oneNum=preOneNum*blockNum;
        else oneNum=preOneNum*(blockNum-1)+cal_one(n-1,mod);
        
        return oneNum;
    }
}