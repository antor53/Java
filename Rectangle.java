/*
 *	Kelvin Cho
 *	Feb 13, 2017
 *  Version 1.0
 *  Description:
 *  The Rectangle class that calculates the property of the rectangle
 *
 */

public class Rectangle implements Shape{
	//Initialize variable
	private final String name = "Rectangle";
	private double length;
	private double width;
	private double perimeter;
	private double area;
	//Constructor
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}
	//getPerimeter return the perimeter of the rectangle
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
	public void setArea(double a) {
		area = a;
	}
	//getter for length
	public double getLength() {
		return length;
	}
	//getter for length
	public double getWidth() {
		return width;
	}
	//lambda expression
	public double getPerimeter(double l, double w, RectangleProperty r){
		return r.get(l, w);
	}
	//calArea calculate the area of the rectangle
	public double calArea() {
		return length*width;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double
				.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double
				.doubleToLongBits(other.width))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", ";
	}

}