package Tree;

public class SegmentTree {
    private static class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;
        public  Node(int start,int end){
            this.start = start;
            this.end =end;
        }
    }
    Node root;
    public SegmentTree(int[]arr){
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[]arr,int start,int end){
        if (start==end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);
        node.data = node.left.data+node.right.data;
        return node;
    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        if (node.start>=qsi&&node.end<=qei){
            //node is lying inside query
            return node.data;
        }
        else if (node.start>qei||node.end<qsi){
            //completely outside
            return 0;
        }
        else {
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }
    }

    //updating
    public void update(int index,int val){
        this.root.data = update(this.root,index,val);
    }
    private int update(Node node,int index,int value){
        if (index>=node.start&&index<=node.end){
            if (index==node.start&&index==node.end){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left,index,value);
                int rightAns =update(node.right,index,value);
                node.data = leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
