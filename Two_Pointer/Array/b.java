package Two_Pointer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 3 sum(leetcode 15 and GFG practice)
public class b {

    // leetcode solution
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        for (int i =0;i<n-2;i++)
        {
            if (i>0 && nums[i]==nums[i-1])continue;
            int j =i+1;
            int k =nums.length-1;
            while (j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if (sum==0)
                {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while (j<k && nums[j]==nums[j-1])j++;
                    while (j<k && nums[k]==nums[k+1])k--;
                } else if (sum<0) {
                    j++;
                }
                else k--;
            }
        }
        return ans;
    }

    // GFG solution
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans =new ArrayList<>();
        HashMap<Integer,List<Integer>> map =new HashMap<>();
        int n =arr.length;
        for (int i =0;i<n-1;i++)
        {
            for (int j =i+1;j<n;j++)
            {
                int target =-1*(arr[i]+arr[j]);
                if (map.containsKey(target))
                {
                    for (int k : map.get(target)) {
                        ans.add(Arrays.asList(k, i, j));
                    }
                }
            }
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        return ans;
    }
}
