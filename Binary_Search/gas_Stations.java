package Binary_Search;

import java.util.PriorityQueue;
class pair{
    double  val;
    int ind;
    pair(double  v,int in){
        this.val =v;
        this.ind =in;
    }
}
// PROBLEM LINK: https://www.naukri.com/code360/problems/minimise-max-distance_7541449
public class gas_Stations  {
    public double min_Distance(int[]arr,int k){
        PriorityQueue<pair> queue = new PriorityQueue<>((a, b) -> Double.compare(b.val, a.val));

        int how_many[] = new int[arr.length-1];
        for (int i = 0; i <arr.length-1 ; i++) {

            queue.add(new pair(arr[i+1]-arr[i],i));
        }
        for(int i=1;i<=k;i++){
            pair tp = queue.poll();
            int secInd = tp.ind;
            double distance =arr[secInd+1]-arr[secInd];
            how_many[secInd]++;
            distance = distance/ (double)(how_many[secInd]+1);
            queue.add(new pair( distance,secInd));
        }

        return queue.peek().val;
    }
}
