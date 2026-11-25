package Two_Pointer.Array;
// container with most water(leetcode 11 and GFG practice)
public class e {
    public int calcArea(int [] arr,int i,int j)
    {
        int height =Math.min(arr[i],arr[j]);
        int width =j-i;
        return height*width;
    }
    public int maxArea(int[] height) {
        int max_area =0;
        int left =0;
        int right =height.length-1;
        while (left<right)
        {
            int area =calcArea(height,left,right);
            max_area =Math.max(area,max_area);
            if (height[left]<=height[right])left++;
            else right--;
        }
        return max_area;
    }
}
