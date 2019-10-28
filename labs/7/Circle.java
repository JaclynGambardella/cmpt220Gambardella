
public class Circle {
	public double radius;
	public double x;
	public double y;
	
			Circle(){
			x = y = 0;
			radius = 1;
		
	}
	
	public Circle(double x, double y, double radius){
		this.radius = radius;
		this.x = x;
		this.y = y;
		
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
		
	}
	
	public double getPerimeter(){
		return 2*Math.PI*radius;
		
	}
	
	public boolean contains(double x, double y){
		double d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y,  2));
		
		if(d<= radius){
			return true;
			
		}
		
		else{
			return false;
			
		}
	}
	
	public boolean contains(Circle circle){
		return contains(circle.x, circle.y);
		
	}
	
	public boolean overlaps(Circle circle){
		double center = Math.sqrt(Math.pow(this.x - circle.x,  2) + Math.pow(this.y - circle.y, 2));
		double circleRadius = radius + circle.radius;
	
	if(center < circleRadius && center > radius && center > circle.radius){
		return true;
		
	}
	else{
		return false;
		
	}
	}
	
public void test(){
	System.out.println("The radius of the circle is: " + radius);
	System.out.println("The area of the circle is: " + getArea());
	System.out.println("The circumference of the circle is: " + getPerimeter());
	
}
	
public static void main(String[] args){
	Circle circle1 = new Circle(2, 2, 5.5);
	circle1.test();
		System.out.println("circle1.contains (3, 3): " + circle1.contains (3, 3));
		System.out.println("circle1.contains (4.0, 5.0, 10.5): " + circle1.contains(4, 5, 10.5));
		System.out.println("circle1.contains (3.0, 5.0, 2.3): " + circle1.overlaps(3, 5, 2.3));
	
}
}
