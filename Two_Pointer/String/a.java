package Two_Pointer.String;
// reverse vowel of a string(leetcode 345 and GFG practice)
public class a {
    public boolean isVowel(char a)
    {
        return "aeiouAEIOU".indexOf(a) != -1;
    }
    public String reverseVowels(String s) {
        char [] ans =s.toCharArray();
        int i =0;
        int j =ans.length-1;
        while (i<j)
        {
            if (!isVowel(ans[i]))i++;
            else if (!isVowel(ans[j])) {
                j--;
            }
            else
            {
                char temp =ans[i];
                ans[i] =ans[j];
                ans[j] =temp;
                i++;
                j--;
            }
        }
        return new String(ans);
    }
}
