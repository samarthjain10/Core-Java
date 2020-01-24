import java.util.Scanner;

public class Solution{	
	
	public static int findUnique(int[] arr){
		
        int unique=0;
		for(int i=0;i<arr.length;i++)
            unique=unique^arr[i];
        return unique;
	}
}
public class Runner {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("N numbers are present twice and one number is present unique");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(Solution.findUnique(arr));
	}
}