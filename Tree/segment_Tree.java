package Tree;

import java.util.Scanner;

public class segment_Tree {
    static int[] a =new int[10005];
    static int[] seg = new int[4*10005];

    static void build(int ind,int low,int high){
        if (low==high){
            seg[ind]=a[low];
            return;
        }
        int mid =(low+high)/2;
        build(2*ind+1,low,mid);
        build(2*ind+2,mid+1,high);
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2]);
    }
    static int query(int ind,int low,int high,int l,int r){
        if (low>=l && high<=r){
            return seg[ind];
        }
        if (high<l|| low>r) return Integer.MIN_VALUE;
        int mid = (low+high)/2;
        int left = query(2*ind+1,low,mid,l,r);
        int right = query(2*ind+2,mid+1,high,l,r);
        return Math.max(left,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        build(0,0,n-1);
        int q = sc.nextInt();
        while (q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(query(0,0,n-1,l,r));
        }
    }

}
