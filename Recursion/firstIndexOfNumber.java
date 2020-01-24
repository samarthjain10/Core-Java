import java.util.Scanner;


public class Solution {

	public static int firstIndex(int input[], int x) {
		      
        if(input.length<=0)
            return -1;
        
        int count; 
            if(input[0]==x)
            return 0;
        else
        {
            int[] small=new int[input.length-1];
            for(int i=0;i<small.length;i++)
                small[i]=input[i+1];
            count=firstIndex(small,x);
        }
        if(count+ 1 >0)
        return count+ 1;
        else
        return -1;    
        
	}
	
}
public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.firstIndex(input, x));
	}
}