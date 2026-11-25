package Two_Pointer.Array;
// trapping rain water(leetcode 42 and GFG practice)
public class f {

    // brute force
    public int maxWater(int arr[]) {
        int max_water =0;
        int n =arr.length;
        for (int i =0;i<n;i++)
        {
            int left_max =0;
            int right_max =0;
            for (int j =i;j>=0;j--)
            {
                left_max =Math.max(left_max,arr[j]);
            }
            for (int j =i;j<n;j++)
            {
                right_max =Math.max(right_max,arr[j]);
            }
            max_water +=Math.min(left_max,right_max)-arr[i];
        }
        return max_water;
    }

    // optimize approach
    public int trap(int[] height) {
        int max_Water =0;
        int n =height.length;
        int left =0;
        int right =n-1;
        int left_max =height[left];
        int right_max =height[right];
        while (left<right)
        {
            if (left_max<right_max)
            {
                left++;
                left_max =Math.max(height[left],left_max);
                max_Water+=left_max-height[left];
            }
            else
            {
                right--;
                right_max =Math.max(height[right],right_max);
                max_Water+=right_max-height[right];
            }
        }
        return max_Water;
    }
}




