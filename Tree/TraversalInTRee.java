package Tree;
import java.util.*;
public class TraversalInTRee {
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
    public static void main(String[] args) {

    }

//    ---------------PREORDER TRAVERSAL ---------------------
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>lst = new ArrayList<>();
        preorder(root,lst);
        return lst;

    }
    static void preorder(TreeNode root,List<Integer>lst){
        if(root==null)return;
        lst.add(root.val);
        preorder(root.left,lst);
        preorder(root.right,lst);
    }
//------------INORDER TRAVERSAL ---------------------
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>lst = new ArrayList<>();
        inorder(root,lst);
        return lst;
    }
    static void inorder(TreeNode root, List<Integer> lst){
        if(root == null)return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right, lst);

    }


//    ---------------POSTORDER TRAVERSAL ---------------
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer>lst= new ArrayList<>();
    postorder(root,lst);
    return lst;
}
    static void postorder(TreeNode root, List<Integer>lst){
        if(root == null)return;
        postorder(root.left,lst);
        postorder(root.right, lst);
        lst.add(root.val);
    }

}
