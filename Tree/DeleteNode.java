package Tree;
//PROBLEM LINK: https://leetcode.com/problems/delete-node-in-a-bst/
public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        if(root.val ==key)return helper(root);

        TreeNode dummy = root;

        while(root!=null){
            if(root.val>key){
                if(root.left!=null&&root.left.val==key){
                    root.left =helper(root.left);
                    break;
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right!=null&&root.right.val==key){
                    root.right = helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }

        }
        return dummy;
    }
    static TreeNode helper(TreeNode root){
        if(root.left==null)return root.right;
        if(root.right==null)return root.left;

        TreeNode rightChild = root.right;
        TreeNode lastright = findRight(root.left);
        lastright.right = rightChild;
        return root.left;
    }
    static TreeNode findRight(TreeNode root){
        if(root.right==null)return root;
        return findRight(root.right);
    }
}

