import java.util.Scanner;

public class Solution {
	public static int[] indexAll(int[] input,int x,int start)
	{
		if(start == input.length)
		{
			int output[] = new int[0];
			return output;
		}
		int smallOutput[] = indexAll(input, x, start+1);
		if(input[start] == x)
		{
			int output[] = new int[smallOutput.length+1];
			output[0] = start;
			for(int i=0;i<smallOutput.length;i++)
				output[i+1] = smallOutput[i];
			return output;
		}
		else
			return smallOutput;
	}
	public static int[] allIndexs(int input[], int x)
	{	
		return	indexAll(input, x, 0);
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
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}