//default method that the each shape class should have
public interface Shape {
	public double getPerimeter();
	public double getArea();
	public double calArea();
	public void setPerimeter(double p);
	public void setArea(double a);
	public String getName();
}
//interface for creating perimeter
interface CircleProperty {
	 double get(double r);
}
//interface for creating perimeter
interface RectangleProperty {
	 double get(double l, double w);
}
//interface for creating perimeter
interface SquareProperty {
	 double get(double l);
}
//interface for creating perimeter
interface ParallelogramProperty {
	 double get(double l, double w);
}
//interface for creating perimeter
interface TriangleProperty {
	 double get(double a, double b, double c);
}