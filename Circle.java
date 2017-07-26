/*
 *	Kelvin Cho
 *	Feb 13, 2017
 *  Version 1.0
 *  Description:
 *  The circle class that calculates the property of the circle
 *
 */
//imports

public class Circle implements Shape{
	//Initialize variable
	private final String name = "Circle";
	private double radius;
	private double perimeter;
	private double area;
	//Constructor
	public Circle(double r){
		radius = r;
	}
	//getPerimeter return the perimeter of the circle
	public double getPerimeter() {
		return perimeter;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//setter for perimeter
	public void setPerimeter(double p){
		perimeter = p;
	}

	 //getter for area
	 public double getArea(){
		 return area;
	 }
	 //setter for area
	 public void setArea(double a){
		 area = a;
	 }
	//get function for radius
	public double getRadius() {
		return radius;
	}
	//calArea return the area of the circle
	public double calArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	//lambda expression
	 public double getPerimeter(double r, CircleProperty c) {
		 return c.get(r);
	}
	//Set function for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Creating hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double
				.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [r=" + radius + ", ";
	}
	
}