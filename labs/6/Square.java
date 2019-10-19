
public class Square {
	private double squareWidth;
		public Square() {
			squareWidth = 1;
			
		}
		
	public Square(double squareWidth){
		this.squareWidth = squareWidth;
		
	}
	
	public double getSquareWidth(){
		return squareWidth;
		
	}
	
	public void setSquareWidth(double squareWidth){
	this.squareWidth = squareWidth;
	
	}

	public double getPerimeter() {
		return squareWidth*4;
		
	}
	
	public double getArea(){
		return Math.pow(squareWidth, 2);
		
	}

	public static void main(String[] args){
		Square firstSquare = new Square(40);
		Square secondSquare = new Square(35.9);
		
	

	System.out.println("The width of the first square is: " + firstSquare.getSquareWidth());
	System.out.println("The area of the first square is: " + firstSquare.getArea());
	System.out.println("The perimeter of the first square is: " + firstSquare.getPerimeter());
	System.out.println("The width of the second square is: " + secondSquare.getSquareWidth());
	System.out.println("The area of the second square is: " + firstSquare.getArea());
	System.out.println("The Perimeter of the second square is: " + firstSquare.getPerimeter());
	}
}
