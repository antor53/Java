/*
 *	Kelvin Cho
 *	Feb 13, 2017
 *  Version 1.0
 *  Description:
 *  The Parallelogram class that calculates the property of the parallelogram
 *
 */

public class Parallelogram implements Shape{
	//Initialize variable
	private final String name = "Parrallelogram";
	private double length;
	private double width;
	private double height;
	private double perimeter;
	private double area;
	//Constructor
	public Parallelogram(double l, double w){
		length = l;
		width = w;
		height = (double) Math.round(Math.sqrt(Math.pow(width, 2) - Math.pow(length, 2)) * 100)/100;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//getter for length
	public double getLength() {
		return length;
	}
	//getter for width
	public double getWidth() {
		return width;
	}
	//getPerimeter return the perimeter of the Parallelogram
	public double getPerimeter() {
		return perimeter;
	}
	//setter for perimeter
	public void setPerimeter(double p){
		perimeter = p;
	}
	//getter for area
	public double getArea() {
		return area;
	}
	//setter for area
	public void setArea(double a) {
		area = a;
	}
	//for lambda expression
	 public double getPerimeter(double l, double w, ParallelogramProperty p) {
		 return p.get(l, w);
	}
	//calArea return the area of the Parallelogram
	public double calArea() {
		return length * height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Parallelogram other = (Parallelogram) obj;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
			return false;
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
		return "Parallelogram [length=" + length + ", width=" + width
				+ ", height=" + height + ", ";
	}	
}