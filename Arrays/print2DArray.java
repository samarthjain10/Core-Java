import java.util.Scanner;

public class solution {
	public static void print2DArray(int input[][]) {
	    int y=0;
        for(int i=0;i<input.length;i++)
        {
            y=input[i].length;
    
          }
        
          for(int i=0;i<input.length;i++)
          {   int x=input.length-i;
              while(x>0)
              {
              for(int j=0;j<y;j++)
              {
                  System.out.print(input[i][j]+" ");
              }
                 System.out.println(); 
                  x--;
              }
         }
	}
}
public class Main {

	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		solution.print2DArray(input);
	}
}