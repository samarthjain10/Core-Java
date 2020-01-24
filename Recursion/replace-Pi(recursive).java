import java.util.Scanner;

public class solution {

	// Return the changed string
	public static String replace(String input){
		
       if( input.length() <= 1 )
       {
           return input ;
       }
       if( input.charAt(0) == 'p' && input.charAt(1) == 'i' && input.length() >= 2 )
       {
           return 3.14 + replace( input.substring(2, input.length()) );
       }
       return input.charAt(0) + replace(input.substring(1, input.length()));
        
    }
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}
