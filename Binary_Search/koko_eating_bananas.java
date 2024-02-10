package Binary_Search;

public class koko_eating_bananas {
    /*
    piles[]-> [3,6,7,11] , hrs = 8
    return the min integer k such  that koko can eat all
    bananas within H hrs

    here we can see she need min speed of 4bananas/hr to eat
    all bananas in 8 hrs
     */
        static public int minEatingSpeed(int[] piles, int h) {

            int right =Integer.MAX_VALUE;
            int left = 1;
            int ans = 0;
            while(left<=right){
                int mid = left+(right-left)/2;
                int thr = canEatAll(piles, mid);

                if (thr<=h){
                    ans = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            return ans;
        }

        static public int canEatAll(int [] piles,int k){
            int cnt = 0;
            for(int pile : piles){
                int currH = pile%k == 0 ? pile/k : pile/k+1;
                cnt += currH;


            }
            return cnt;
        }

}
