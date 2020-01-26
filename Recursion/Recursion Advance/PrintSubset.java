public class solution 
{
    public static void printSubsets(int input[]) 
    {
        int n = input.length; 
        for (int i = 0; i < (1<<n); i++) 
        {  
            for (int j = 0; j < n; j++) 
                if ((i & (1 << j)) > 0) 
                    System.out.print(input[j] + " "); 
            System.out.println(); 
        }
    }
}