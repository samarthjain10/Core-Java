public class Solution 
{
	public static String replaceCharacter(String s, char from, char to) 
    {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if (s.length() < 1) 
            return s;
        else 
        {
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + replaceCharacter(s.substring(1), from, to);
        }
	}
}
