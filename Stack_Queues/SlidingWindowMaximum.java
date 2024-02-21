package Stack_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    static int[] maxSlidingWindow(int[]arr,int k){
        int  n= arr.length;
        int[]r=new int[n-k+1];
        int ri= 0;
        Deque<Integer>q = new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while (!q.isEmpty()&&arr[q.peekLast()]<=arr[i]){
                q.pollLast();
            }
            q.offer(i);

            if(i>=k-1)r[ri++]=arr[q.peek()];
        }
        return r;
    }
}
