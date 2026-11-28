package Two_Pointer.String;
// remove vowels
public class d {
    public boolean isVowel(char c)
    {
        return c =='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    String removeVowels(String s) {
        int n =s.length();
        char [] arr =new char[n];
        int idx =0;
        for (int i =0;i<n;i++)
        {
            if (!isVowel(s.charAt(i)))
            {
                arr[idx] =s.charAt(i);
                idx++;
            }
        }
        return new String(arr,0,idx);
    }
}
