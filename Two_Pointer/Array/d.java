package Two_Pointer.Array;

public class d {
    public void swap(int[] arr,int i,int j)
    {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    void segregate0and1(int[] arr) {
        int left =0;
        int right =arr.length-1;
        while (left<=right)
        {
            if (arr[left]==0)
            {
                left++;
            } else if (arr[left]==1) {
                swap(arr,left,right);
                right--;
            }
        }
    }
}
