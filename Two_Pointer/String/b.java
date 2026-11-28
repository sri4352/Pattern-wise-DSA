package Two_Pointer.String;
// reverse a string(leetcode 344 and GFG practice)
public class b
{
    public static String reverseString(String s) {
        char [] ans =s.toCharArray();
        int i =0;
        int j =ans.length-1;
        while (i<j)
        {
            char temp =ans[i];
            ans[i] =ans[j];
            ans[j] =temp;
            i++;
            j--;
        }
        return new String(ans);
    }
}
