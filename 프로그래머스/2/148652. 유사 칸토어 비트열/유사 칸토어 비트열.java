class Solution {
    public int solution(int n, long l, long r) {
        int answer = (int)(cal_one(n,r)-cal_one(n,l-1));
        return answer;
    }
    
    private long cal_one(int n, long r){
        if(r==0) return 0;
        if(n==0) return 1;

        long oneNum=0;
        
        for(int i=n;i>0;i--){
            
            long blockLen=(long)Math.pow(5,i-1);
            long preOneNum=(long)Math.pow(4,i-1);
            int blockNum=(int)(r/blockLen);
            long mod=r%blockLen;

            if(blockNum<2) oneNum+=preOneNum*blockNum;
            else if(blockNum==2) {
                oneNum+=preOneNum*blockNum;
                break;
            }
            else oneNum+=preOneNum*(blockNum-1);
            
            r=mod;
        }
        
        return oneNum;
    }
}