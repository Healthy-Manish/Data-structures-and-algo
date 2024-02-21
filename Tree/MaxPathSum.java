package Tree;

public class MaxPathSum {
        public int maxPathSum(TreeNode root){
            int maxvalue[]=new int[1];
            maxvalue[0]=Integer.MIN_VALUE;
            maxPathDown(root,maxvalue);
            return maxvalue[0];
        }
        private  int maxPathDown(TreeNode node,int maxvalue[]){
            if (node==null)return 0;
            int left = Math.max(0,maxPathDown(node.left,maxvalue));
            int right = Math.max(0,maxPathDown(node.right,maxvalue));
            maxvalue[0]=Math.max(maxvalue[0],left+right+node.val);
            return Math.max(left,right)+ node.val;
        }
}
