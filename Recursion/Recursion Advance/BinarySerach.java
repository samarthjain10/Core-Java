public class solution 
{
	public static int binarySearch(int input[], int element) 
    {
        int n = input.length; 
        int x = element; 
        int result = Search(input, 0, n - 1, x);
        return result;
	}
    public static int Search(int arr[], int l, int r, int x) 
    { 
        if (r >= l) 
        { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return Search(arr, l, mid - 1, x); 
            return Search(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}