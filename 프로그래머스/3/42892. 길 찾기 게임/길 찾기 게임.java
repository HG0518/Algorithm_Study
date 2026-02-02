import java.util.*;

class Solution {
    public int[][] solution(int[][] nodeinfo) {
        int[][] arr=new int[nodeinfo.length][3];
        int[][] answer = new int[2][nodeinfo.length];
        int[] index={0};
        
        for(int i=0;i<nodeinfo.length;i++){
            arr[i][0]=nodeinfo[i][0];
            arr[i][1]=nodeinfo[i][1];
            arr[i][2]=i+1;
        }
        
        Arrays.sort(arr,(o1,o2)->Integer.compare(o2[1],o1[1]));
        
        TreeNode root=null;
        for(int i=0;i<arr.length;i++){
            root=makeTree(root,arr[i][0],arr[i][1],arr[i][2]);
        }
        
        preOrder(root,answer,index);
        index[0]=0;
        postOrder(root,answer,index);
        
        return answer;
    }
    
    public TreeNode makeTree(TreeNode root, int x, int y, int index){
        if(root==null) return new TreeNode(x,y,index);
        if(root.x>x) root.left=makeTree(root.left,x,y,index);
        else root.right=makeTree(root.right,x,y,index);
        return root;
    }
    
    public void preOrder(TreeNode root, int[][] answer, int[] index){
        if(root==null)return;
        answer[0][index[0]++]=root.index;
        preOrder(root.left,answer,index);
        preOrder(root.right,answer,index);
    }
    public void postOrder(TreeNode root, int[][] answer, int[] index){
        if(root==null)return;
        postOrder(root.left,answer,index);
        postOrder(root.right,answer,index);
        answer[1][index[0]++]=root.index;
    }
}

class TreeNode{
    public int x;
    public int y;
    public int index;
    public TreeNode left;
    public TreeNode right;
    
    TreeNode(int x, int y, int index){
        this.x=x;
        this.y=y;
        this.index=index;
    }
}