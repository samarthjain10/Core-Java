import java.util.Scanner;

public class Solution {

	
	public static int[] arrange(int n){
		
		int[] arr=new int[n];
        int x=0,y=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                arr[x]=i;
                x++;
            }
        }
        for(int i=n;i>=2;i--)
        {
            if(i%2==0)
            {
                arr[x+y]=i;
                y++;
            }
        }
        return arr;
	}
	
}

public class Runner {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = Solution.arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}		
	}

}
