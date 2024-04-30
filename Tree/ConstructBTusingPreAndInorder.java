package Tree;

import java.util.*;
public class ConstructBTusingPreAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }

    static TreeNode build(int[]pre,int ps,int pe,int[] inorder,int is,int ie,HashMap<Integer,Integer>map){
        if(ps>pe||is>ie)return null;

        TreeNode root = new TreeNode(pre[ps]);
        int mid = map.get(pre[ps]);
        int left = mid-is;
        root.left = build(pre,ps+1,ps+left,inorder,is,mid-1,map);
        root.right = build(pre,ps+left+1,pe,inorder,mid+1,ie,map);
        return root;
    }
}
