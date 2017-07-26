/*
 *	Kelvin Cho
 *	Feb 13, 2017
 *  Version 1.0
 *  Description:
 *  The Triangle class that calculates the property of the triangle
 *
 */

public class Triangle implements Shape{
	//Initialize variable
	private final String name = "Triangle";
	private double a;
	private double b;
	private double c;
	private double perimeter;
	private double area;
	//Constructor
	public Triangle(double a, double b, double c){
		if(isValid(a,b,c)){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	//getter for name
	public String getName() {
		return name;
	}
	//this validate if the measurement complete a triangle
	public boolean isValid(double a, double b, double c){
		double temp;
		temp = (a + b + c)/2;
		if(temp > a && temp > b && temp > c){
			return true;
		}
		else{
			return false;
		}
	}
	//getter for sideA
	public double getA() {
		return a;
	}
	//getter for sideB
	public double getB() {
		return b;
	}
	//getter for sideC
	public double getC() {
		return c;
	}
	//getPerimeter return the perimeter of the Triangle
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
	public double getPerimeter(double a, double b, double c, TriangleProperty t) {
		return t.get(a, b, c);
	}
	//getArea return the area of the Triangle
	public double calArea() {//Heron's Formula
		double s = (a+b+c)/2;
		return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(perimeter);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(area) != Double
				.doubleToLongBits(other.area))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		if (Double.doubleToLongBits(perimeter) != Double
				.doubleToLongBits(other.perimeter))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", ";
	}
}