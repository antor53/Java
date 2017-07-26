/*
 *	Kelvin Cho
 *	Feb 13, 2017
 *  Version 1.0
 *  Description:
 *  The Square class that calculates the property of the square
 *
 */

public class Square implements Shape{
	//Initialize variable
	private final String name = "Square";
	private double length;
	private double perimeter;
	private double area;
	
	//Constructor
	public Square(double l){
		length = l;
	}
	public String getName() {
		return name;
	}
	//getPerimeter return the perimeter of the square
	public double getPerimeter() {
		return perimeter;
	}
	//setter for perimeter
	public void setPerimeter(double p){
		perimeter = p;
	}
	//getArea return the area of the square
	public double getArea() {
		return area;
	}
	//setter for area
	public void setArea(double a) {
		area = a;
	}
	//getter for length
	public double getLength() {
		return length;
	}
	//for lambda expression
	public double getPerimeter(double l, SquareProperty s){
		return s.get(l);
	}
	//calculate the area of the square
	public double calArea() {
		return Math.pow(length, 2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
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
		Square other = (Square) obj;
		if (Double.doubleToLongBits(length) != Double
				.doubleToLongBits(other.length))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Square [length=" + length + ", ";
	}	
}