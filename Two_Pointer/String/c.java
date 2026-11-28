package Two_Pointer.String;
// faulty keyword(leetcode )
public class c {
    public void reverse(char [] arr,int i,int j)
    {
        while (i<j)
        {
            char temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
    public String finalString(String s) {
        char[] ans =new char[s.length()];
        int idx =0;
        for(int i =0;i<s.length();i++)
        {
            if (s.charAt(i)=='i')
            {
                reverse(ans,0,idx-1);
            }
            else
            {
                ans[idx] =s.charAt(i);
                idx++;
            }
        }
        return new String(ans,0,idx);
    }
}
