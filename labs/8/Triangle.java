import java.util.Scanner;
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public static void main(String[] args){
	double s1;
	double s2;
	double s3;
	String color;
	boolean fill;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a color: ");
	color = input.nextLine();
	
	System.out.println("Enter length of sides: ");
	s1 = input.nextDouble();
	s2 = input.nextDouble();
	s3 = input.nextDouble();
	
	System.out.println("Is the triangle filled(true/ false): ");
	fill = input.nextBoolean();
	
		Triangle triangle = new Triangle(s1,s2,s3);
		triangle.putColor(color);
		triangle.setFill(fill);
		
		System.out.println("Sides of "+triangle.toString());
		System.out.println("Area of the triangle is " + triangle.getArea());
		System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter());
		System.out.println("Color of the triangle is " + triangle.getColor());
		System.out.println("Is the triangle filled: " +triangle.isFilled());
	}
		public Triangle(double s1, double s2, double s3){
			side1 = s1;
			side2 = s2;
			side3 = s3;
			
		}
		
		public double getSide1(){
			return side1;
		}
		
		public double getSide2(){
		return side2;
		}
	
		public double getSide3(){
			return side3;
		}
		
		
	public double getArea(){
		double s = (side1 + side2 + side3)/2;
		double area = s*(s - side1)*(s - side2)*(s - side3);
		return area;
	}
	
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	public String toString(){
		return "Triangle : side1 = " + side1 + " side2 = " + side2 + " side3 = "+ side3;
		
	}

}
