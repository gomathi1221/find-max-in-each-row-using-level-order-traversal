class Solution {
    public List<Integer> largestValues(TreeNode root) {
       List<Integer>res=new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       if(root==null){
        return res;
       }
       q.add(root);
      int max=Integer.MIN_VALUE;
      
       while(!q.isEmpty()){
        max=Integer.MIN_VALUE;
        int n=q.size();
        for(int i=0;i<n;i++){
            TreeNode s=q.poll();
            max=Math.max(s.val,max);
            if(s.left!=null){
                q.add(s.left);
            }
            if(s.right!=null){
                q.add(s.right);
            }
        }
        res.add(max);
        
       }
       return res;

    }
}