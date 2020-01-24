import java.util.Scanner;

public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        String str="";
        if(input.length()-1<=0)
            return true;
        if(input.charAt(0)!=input.charAt(input.length()-1))
            return false;
        for(int i=1;i<input.length()-1;i++)
            str+=input.charAt(i);
        if(input.length()-1>0)
            return isStringPalindrome(str);
        return true;
        }
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}
