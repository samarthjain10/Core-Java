public class solution {

    public static void helper(String input,String ans)
    {
        if(input.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<input.length();i++)
        {
            helper(input.substring(0,i) + input.substring(i+1), ans + input.charAt(i));
        }
    }
	public static void permutations(String input){
		// Write your code here
        helper(input,"");
	}
}