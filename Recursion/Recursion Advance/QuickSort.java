public class Solution {
	
	public static void quickSort(int[] input) {
        quick(input,0,input.length-1);
		
	}
    public static void quick(int[] input,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(input,low,high);
            quick(input,low,pi-1);
            quick(input,pi+1,high);
        }
    }
    public static int partition(int[] input,int low, int high)
    {
        int pivot=input[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(input[j]<=pivot)
            {
                i++;
                int t=input[i];
                input[i]=input[j];
                input[j]=t;
            }
        }
        int t=input[i+1];
        input[i+1]=input[high];
        input[high]=t;
        return (i+1);
    }
	
}