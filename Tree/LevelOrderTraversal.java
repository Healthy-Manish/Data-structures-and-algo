package Tree;
import java.util.*;
public class LevelOrderTraversal {


     public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
              this.right = right;
          }
     }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)return levelList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer>lst = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right != null)queue.offer(queue.peek().right);
                lst.add(queue.poll().val);
            }
            levelList.add(lst);
        }
        return levelList;
    }

}
