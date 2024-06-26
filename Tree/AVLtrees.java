package Tree;

import java.util.ArrayList;
import java.util.List;

public class AVLtrees {

    public static TreeNode rotate(TreeNode node){
        if (maxDepth(node.left)-maxDepth(node.right)>1){
            //left-left rotation
            if (maxDepth(node.left.left)>=maxDepth(node.left.right)){
               return rightRotate(node);
            }
            //left-right rotation
            else{
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //Right Rotation
        else if (maxDepth(node.left)-maxDepth(node.right)<-1){
            //right-right rotation
            if (maxDepth(node.right.right)>=maxDepth(node.right.left)){
                return leftRotate(node);
            }
            //left-right rotation
           else{
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    static TreeNode rightRotate(TreeNode p){
        TreeNode c = p.left;
        TreeNode t = c.right;

        c.right = p;
        p.left = t;
        return  c;

    }
    static TreeNode leftRotate(TreeNode p){
        TreeNode c = p.right;
        TreeNode t = c.left;
        c.left=p;
        p.right = t;
        return c;
    }
    static int maxDepth(TreeNode root){
        if(root == null)return  0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
    static TreeNode insert(TreeNode root,int val){
        if (root == null)return new TreeNode(val);
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return rotate(root);
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(0);

        for (int i = 0; i <1000 ; i++) {
           root =  insert(root,i);
        }
        System.out.println(maxDepth(root));

    }
}
