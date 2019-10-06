
public class Lab5Part6 {
	private static double[][] array;
	public static void main (String[] args){
		twoDimArray();
		System.out.println(avg());	
	}
	
	private static void twoDimArray(){
		array = new double[5][2];
		array [0][0] = 1;
		array [0][1] = 12;
		array [1][0] = 3;
		array [1][1] = 5;
		array [2][0] = 9;
		array [2][1] = 5;
		array [3][0] = 4;
		array [3][1] = 7;
		array [4][0] = 1;
		array [4][1] = 3;
	}
	
	private static double avgRow(double[][] array,int row){
		int i = 0;
		double sum = 0;
//		for (int j = 0; j<array.length; j++)
			for (int k = 0; k<array.length; k++)
				sum = sum + array[row][k];
//		i++;
		return sum/array.length;
	}
}

