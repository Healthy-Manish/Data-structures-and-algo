package recursion;

import java.util.ArrayList;

public class subsequence_questions {
    public static void main(String[] args) {
        int sum = 10;
        int[] arr = {9,1,5,3,2,5};
        ArrayList<Integer> ans = new ArrayList<>();
        print_sumInSubsequence2(0,ans,arr,arr.length,sum);
        System.out.println(print_sumInSubsequence3(0,0,arr,arr.length,sum));
    }
    static void print_sumInSubsequence(int ind, ArrayList<Integer> ans,int[] arr,int length,int sum){
        int temp = 0;

        if (ind==length) {
            for (int i = 0; i < ans.size(); i++) {
                temp = temp + ans.get(i);
            }
            if (temp== sum) System.out.println(ans);

            return ;
        }
        ans.add(arr[ind]);
        print_sumInSubsequence(ind+1,ans,arr,length,sum);
        ans.remove(ans.size()-1);
        print_sumInSubsequence(ind+1,ans,arr,length,sum);
    }

    //what if we wanna print only one subsequence that gives the sum
    //time complexity : O(N^2)
    static boolean print_sumInSubsequence2(int ind, ArrayList<Integer> ans,int[] arr,int length,int sum){
        int temp = 0;

        if (ind==length) {
            for (int i = 0; i < ans.size(); i++) {
                temp = temp + ans.get(i);
            }
            if (temp== sum) {
                System.out.println(ans);
                return true;
            }
            return false;
        }
        ans.add(arr[ind]);
        if(print_sumInSubsequence2(ind+1,ans,arr,length,sum)==true)return true;
        ans.remove(ans.size()-1);
        if(print_sumInSubsequence2(ind+1,ans,arr,length,sum)==true) return true;
        return false;
    }

    //what if we wanna get total numbers of subsequences
    static int print_sumInSubsequence3(int ind, int s,int[] arr,int length,int sum){

        if (ind==length) {

            if (s== sum) return 1;

            return 0;
        }
        s+=arr[ind];

        int l = print_sumInSubsequence3(ind+1,s,arr,length,sum);
        s-=arr[ind];
        int r = print_sumInSubsequence3(ind+1,s,arr,length,sum);
        return l+r;
    }
}



