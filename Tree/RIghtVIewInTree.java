package Tree;

import java.util.ArrayList;
import java.util.List;

public class RIghtVIewInTree {


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root,0,ans);
        return ans;
    }
    static void rightView(TreeNode root,int level,List<Integer>ans){
        if(root==null)return;
        if(level==ans.size())ans.add(root.val);

        rightView(root.right,level+1,ans);
        rightView(root.left,level+1,ans);
    }
}
