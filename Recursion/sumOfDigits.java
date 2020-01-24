import java.util.Scanner;

public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        int rem=0,digit=0;
        if(input==0)
            return 0;
        rem=input%10;
        input=input/10;
        return rem+sumOfDigits(input);
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.sumOfDigits(n));
	}
}
