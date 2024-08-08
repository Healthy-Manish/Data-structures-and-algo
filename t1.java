import Linked_List.ListNode;

import java.lang.reflect.Array;
import java.util.*;

public class t1 {
    public int appendCharacters(String s, String t) {
        int len = 0;
        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);
            if (s.indexOf(temp) == -1) {
                return t.length() - i;
            }
        }
        return 0;
    }

    static boolean Check(int[] arr, int size) {
        if (arr.length % size != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int i = first; i < first + size; i++) {
                if (!map.containsKey(i)) return false;
                int c = map.get(i);
                if (c == 1) map.remove(i);
                else map.put(i, c - 1);
            }
        }

        return true;
    }

    static String dic(List<String> str, String sentence) {
        StringBuilder st = new StringBuilder();
        String[] temp = sentence.split(" ");
        for (int i = 0; i < temp.length; i++) {
            int flag = 0;
            for (int j = 0; j < str.size(); j++) {
                if (temp[i].contains(str.get(j))) {
                    st.append(str.get(j) + " ");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) st.append(temp[i] + " ");
        }
        return st.toString();
    }

    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) rem += k;
            if (map.containsKey(rem)) ans += map.get(rem);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }

    static String clearDigit(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                st.deleteCharAt(st.length() - 1);
            } else st.append(c);

        }
        return st.toString();
    }

    static int findWinningPlayer(int[] skills, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ind = 0;
        for (int a : skills) {
            arr.add(a);
            map.put(a, ind++);
        }
        int cnt = 0;
        int maxi = arr.get(0);

        while (cnt != k) {
            if (arr.get(1) > maxi) {
                cnt = 1;
                maxi = arr.get(1);
                int num = arr.remove(0);
                arr.add(num);
            } else {
                cnt++;
                int num = arr.remove(1);
                arr.add(num);
            }
        }
        return map.get(maxi);
    }


    public static int maxTotalReward(int[] rewardValues) {
        int sum = 0;
        int maxi = 0;
        Arrays.sort(rewardValues);

        for (int j = 0; j < rewardValues.length; j++) {
            sum = rewardValues[j];
            maxi = sum;
            for (int k = j + 1; k < rewardValues.length; k++) {
                if (rewardValues[k] > sum) sum += rewardValues[k];
            }
            maxi = Math.max(sum, maxi);

        }


        return maxi;
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(interval[1], ans.get(ans.size() - 1)[1]);
            }
        }
        int res[][] = new int[ans.size()][];
        res = ans.toArray(res);

        return res;
    }

    public static int lengthOfLongestSubstring(String arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int s = 1;
        int i = 0;
        for (i = 0; i < arr.length(); i++) {

            if (map.containsKey(arr.charAt(i))) {

                ans = Math.max(i - s + 1, ans);

                s = map.get(arr.charAt(i)) + 1;
                map.put(arr.charAt(i), i + 1);
            } else {
                map.put(arr.charAt(i), i + 1);

            }
        }
        ans = Math.max(i - s + 1, ans);
        return ans;
    }

    static void median(int k, int ind, int arr[], int[] sum, ArrayList<Integer> ans) {
        if (ind == arr.length) {
            if (ans.size() == k) {
                Collections.sort(ans);
                sum[0] += ans.get((k+1 )/ 2);
            }
            return;
        }
        ans.add(arr[ind]);
        median(k, ind + 1, arr, sum, ans);
        ans.remove(ans.size() - 1);
        median(k, ind + 1, arr, sum, ans);
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i=0;i<n;i++){
            if(gas[i]>cost[i]){
                int total = gas[i];
                int ind =i;
                int len =0;
                while(len!=n)
                {
                    if(total<cost[ind%n])break;
                    total=total-cost[ind%n]+gas[(ind+1)%n];
                    ind++;
                    len++;
                }
                if(len==n)return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int gas[] = {5,8,2,8};
    int cost[] = {6,5,6,6};
        System.out.println(canCompleteCircuit(gas,cost));

    }

}
