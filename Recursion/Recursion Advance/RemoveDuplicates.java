public class Solution
{
	public static String removeConsecutiveDuplicates(String s)
    {
		if(s.length()==1)
        {
            return s;
        }
        String ans="";
        if(s.charAt(0)!=s.charAt(1))
        {
            ans=s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
        }
        else
        {
            ans=removeConsecutiveDuplicates(s.substring(1));
        }
        return ans;
	}
}