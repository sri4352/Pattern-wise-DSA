package Two_Pointer.Array;

import java.util.ArrayList;
import java.util.Arrays;

// two sum in a sorted array(leetcode 167 and GFG practice)
public class a {

    // leetcode solution
    public int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j =numbers.length-1;
        while (i<j)
        {
            int sum =numbers[i]+numbers[j];
            if (sum==target)return new int[]{i+1,j+1};
            else if (sum<target) {
                i++;
            }
            else j--;
        }
        return new int[]{-1,-1};
    }

    // GFG solution
    public ArrayList<Integer> TwoSum(int[] numbers, int target) {
        int i =0;
        int j =numbers.length-1;
        while (i<j)
        {
            int sum =numbers[i]+numbers[j];
            if (sum==target)
            {
                return new ArrayList<>(Arrays.asList(i+1,j+1));
            } else if (sum<target) {
                i++;
            }
            else j--;
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}


