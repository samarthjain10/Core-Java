public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		divide(input,0,input.length-1);
	}
    public static void divide(int[] input,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            divide(input,start,mid);
            divide(input,mid+1,end);
            merge(input,start,mid,end);
        }
        
    }
    public static void merge(int[] input,int start,int mid,int end)
    {
        int size1=mid-start+1;
        int size2=end-mid;
        int[] temp1=new int[size1];
        int[] temp2=new int[size2];
        for( int i=0 ; i<size1 ; ++i)
        {
            temp1[i]= input[ start + i];
        }
        for( int i=0 ; i<size2 ; ++i )
        {
            temp2[i] = input[mid + 1 + i];
        }
        int i=0,j=0,k=start;
        while(i<size1&&j<size2)
        {
            if(temp1[i]<=temp2[j])
            {
                input[k]=temp1[i];
                i++;
            }
            else
            {
                input[k]=temp2[j];
                j++;
            }
            k++;
        }
        while(i<size1)
        {
            input[k]=temp1[i];
            i++;
            k++;
        }
        while(j<size2)
        {
            input[k]=temp2[j];
            j++;
            k++;
        }
    }
}