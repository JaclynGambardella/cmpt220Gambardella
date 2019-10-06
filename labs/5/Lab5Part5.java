import java.util.Scanner;
public class Lab5Part5 {
	public static void main(String[] args){
		int row; 
		int column; 
		int m;
		int[][] array; 
		int matrix;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		row = scan.nextInt();
		
		System.out.print("Enter the number of columns: ");
		column = scan.nextInt();
		
		array = new int[row][column];
		
		for(int i = 0; i < row; i++){
			System.out.println("Enter " + column + " elements for row " + (i + 1) + ":");
			
			for(int j = 0; j < column; j++){	
				array[i][j] = scan.nextInt();		
			}
		
		}
		matrixTranspose = new int[column][row];
		//matrixTranspose = array;
		
		for(int k = 0; k < rows; k++){
			
			for(int l = 0; l < columns; l++){
				
//				if(k<l){
//					m = matrixTranspose[h][i];
					matrixTransposex[l][k] = matrix[k][l];
//					matrixTranspose[l][k] = m;
					
//				}
					
			}
		}
		System.out.println("The tranpose of the matrix is: ");
		
		for(int x = 0; x < column; x++){
			
			for(int y = 0; y < rows; y++){
				System.out.print(matrixTranspose[x][y] + " ");
			
			}
			System.out.println();
		}
	}		
}	
	
	

