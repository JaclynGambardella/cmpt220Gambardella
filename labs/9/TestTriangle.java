import java.util.Scanner; 

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a color: ");
		String color = input.next();
		
		System.out.println("Is the triangle filled (true/false): ");
		boolean filled = input.nextBoolean();
				
		System.out.print("Enter 3 double values for sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
			
		try {
			Triangle myTriangle = new Triangle(side1, side2, side3);
				
			myTriangle.setColor(color);
			myTriangle.setFilled(filled);
				
			System.out.println(myTriangle.toString());
			System.out.println("Area: " + myTriangle.getArea());
			System.out.println("Perimeter: " + myTriangle.getPerimeter());
			System.out.println("Color: " + myTriangle.getColor());
			
			if(filled)
				System.out.println("The triangle is filled");
			else
				System.out.println("The triangle is not filled.");
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}