package Tree;

public class Balanced_Binary_Tree {
    static boolean balance_binary(Node root){
    return dfsHeight(root)!=-1;
    }
    static int dfsHeight(Node root){
        if (root == null)return 0;
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1)return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight==-1)return -1;

        if (Math.abs(leftHeight-rightHeight)>1)return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}
