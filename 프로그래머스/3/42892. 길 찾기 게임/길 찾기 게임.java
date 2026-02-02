import java.util.*;

class Solution {
    int idx;
    public int[][] solution(int[][] nodeinfo) {
        int n=nodeinfo.length;
        List<TreeNode> nodes=new ArrayList<>();
        for(int i=0;i<n;i++){
            nodes.add(new TreeNode(nodeinfo[i][0],nodeinfo[i][1],i+1));
        }
        
        nodes.sort((a,b)->b.y!=a.y?b.y-a.y:a.x-b.x);
        
        TreeNode root=nodes.get(0);
        for(int i=1;i<n;i++){
            root.insertNode(nodes.get(i));
        }
        
        int[][] answer = new int[2][n];
        idx=0;
        preOrder(root,answer);
        idx=0;
        postOrder(root,answer);
        
        return answer;
    }
    
    public void preOrder(TreeNode root, int[][] answer){
        if(root==null)return;
        answer[0][idx++]=root.index;
        preOrder(root.left,answer);
        preOrder(root.right,answer);
    }
    
    public void postOrder(TreeNode root, int[][] answer){
        if(root==null)return;
        postOrder(root.left,answer);
        postOrder(root.right,answer);
        answer[1][idx++]=root.index;
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
    
    public void insertNode(TreeNode node){
        if(this.x>node.x){
            if(this.left==null) this.left=node;
            else this.left.insertNode(node);
        }
        else
            if(this.right==null) this.right=node;
            else this.right.insertNode(node);
    }
}