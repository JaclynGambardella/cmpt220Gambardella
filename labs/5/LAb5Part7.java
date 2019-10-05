
public class LAb5Part7 {
	public static void main(String[] args){
		double[][] array = {{2,1,4}, {0,3,-1}, {0,0,-2}};
		
		if(isUpperTriangular(array))
			System.out.println("The matrix is upper Triangualar");
		else
			System.out.println("The matrix is not upper Triangualar");
	}
	
	
		public static boolean isUpperTriangular(double[][] array){
			for(int i = 1; i<array.length; i++)
				for(int j = 1; j<array.length; j++)
				if(array[i][j] != 0)
					return false;
			return true;	
		
	}
}
