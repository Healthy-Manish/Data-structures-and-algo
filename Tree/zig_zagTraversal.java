package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zig_zagTraversal {

    public List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>>wrapList = new ArrayList<>();
        if(root == null) return wrapList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer>row = new ArrayList<>();
            for(int i =0;i<level;i++){
                if(queue.peek().left != null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                if(flag==true)row.add(queue.poll().val);
                else row.add(0,queue.poll().val);
            }
            flag = !flag;
            wrapList.add(row);
        }
        return wrapList;
        }

    }

