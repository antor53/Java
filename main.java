/*
 *	Kelvin Cho
 *	Feb 16, 2017
 *  Version 1.5
 *  Description:
 *  The main class of the assignment 1. 
 *  This is where all the majority of the method
 *  are being called.
 */

//imports
import java.io.*;
import java.util.ArrayList;

public class main extends Validation {
	//Declare global variables
	static File inputFile;
	static BufferedReader inputReader;
	static String input;
	static forSorting ssort;
	static deletingArray delete;

	public static void main(String[] args) {
		//Declare local variables
		int numCircle = 0;
		int numRectangle = 0;
		int numSquare = 0;
		int numParallelogram = 0;
		int numTriangle = 0;

		Circle[] c = null;
		Rectangle[] r = null;
		Square[] s = null;
		Parallelogram[] p = null;
		Triangle[] t = null;

		try{
			//giving inputFile a file name Shapes.txt
			inputFile = new File("Shapes.txt");
			//temp array
			String[] arg = null;
			//open buffer reader
			inputReader = new BufferedReader(new FileReader(inputFile));

			//checking number of different objects
			while((input = inputReader.readLine()) != null){
				arg = input.split(",");
				//System.out.println(arg[0]);//Checking first element(This was for test usage only)
				if(arg[0].equals("Circle")){
					if(arg.length == 2){
						if(isCValid(arg[1]))
							numCircle++;
					}
				}
				else if(arg[0].equals("Rectangle")){
					if(arg.length == 3){
						if(isRValid(arg[1],arg[2]))
							numRectangle++;
					}
				}
				else if(arg[0].equals("Square")){
					if(arg.length == 2){
						if(isSValid(arg[1])){
							numSquare++;
						}
					}
				}
				else if(arg[0].equals("Parallelogram")){
					if(arg.length == 3){
						if(isPValid(arg[1],arg[2])){
							numParallelogram++;
						}
					}
				}
				else if(arg[0].equals("Triangle")){
					if(arg.length == 4){
						if(isTValid(arg[1],arg[2],arg[3])){
							numTriangle++;
						}
					}
				}
			}
			//Closes buffer reader
			inputReader.close();

			//Clear temp variable
			arg = null;

			//Declaring the size of the object array
			c = new Circle[numCircle];
			r = new Rectangle[numRectangle];
			s = new Square[numSquare];
			p = new Parallelogram[numParallelogram];
			t = new Triangle[numTriangle];

			//For test usage
			/*
			System.out.println("Circle = " + numCircle);
			System.out.println("Rectangle = " + numRectangle);
			System.out.println(numTriangle);
			 */

			//Temporary variable to keep track of current element
			int CCE = 0;//"Current Circle Element"
			int CRE = 0;//"Current Rectangle Element"
			int CSE = 0;//"Current Square Element"
			int CPE = 0;//"Current Parallelogram Element"
			int CTE = 0;//"Current Triangle Element"
			
			System.out.println("------Task 1------");
			
			//re-open buffer reader but this time for input values
			inputReader = new BufferedReader(new FileReader(inputFile));

			//checking number of different objects
			while((input = inputReader.readLine()) != null){
				arg = input.split(",");
				//checking the first element of the array
				if(arg[0].equals("Circle")){
					//comparing the size of the array
					if(arg.length == 2){
						//validing input to see if it is a valid value
						if(isCValid(arg[1])){
							//Temporary variable that's use for converting
							double temp = Double.parseDouble(arg[1]);
							//Setting the circle array with variable
							c[CCE] = new Circle(temp);
							//Increase current count
							CCE++;
						}
					}
				}
				//checking the first element of the array
				else if(arg[0].equals("Rectangle")){
					//comparing the size of the array
					if(arg.length == 3){
						//validing input to see if it is a valid value
						if(isRValid(arg[1],arg[2])){
							//Temporary variable that's use for converting
							double tempL = Double.parseDouble(arg[1]);
							double tempW = Double.parseDouble(arg[2]);
							//Setting the rectangle array with variable
							r[CRE] = new Rectangle(tempL,tempW);
							//Increase current count
							CRE++;
						}
					}
				}
				//checking the first element of the array
				else if(arg[0].equals("Square")){
					//comparing the size of the array
					if(arg.length == 2){
						if(isSValid(arg[1])){
							//Temporary variable that's use for converting
							double temp = Double.parseDouble(arg[1]);
							//Setting the square array with variable
							s[CSE] = new Square(temp);
							//Increase current count
							CSE++;		
						}
					}
				}
				//checking the first element of the array
				else if(arg[0].equals("Parallelogram")){
					//comparing the size of the array
					if(arg.length == 3){
						//validing input to see if it is a valid value
						if(isPValid(arg[1],arg[2])){
							//Temporary variable that's use for converting
							double tempL = Double.parseDouble(arg[1]);
							double tempW = Double.parseDouble(arg[2]);
							//Setting the rectangle array with variable
							p[CPE] = new Parallelogram(tempL,tempW);
							//Increase current count
							CPE++;	
						}
					}
				}
				//checking the first element of the array
				else if(arg[0].equals("Triangle")){
					//comparing the size of the array
					if(arg.length == 4){
						//validing input to see if it is a valid value
						if(isTValid(arg[1],arg[2],arg[3])){
							//Temporary variable that's use for converting
							double tempA = Double.parseDouble(arg[1]);
							double tempB = Double.parseDouble(arg[2]);
							double tempC = Double.parseDouble(arg[3]);
							//Setting the rectanglea array with variable
							t[CTE] = new Triangle(tempA,tempB, tempC);
							//Increase current count
							CTE++;	
						}
					}
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("File Read");
		System.out.println("");
		//Calculating and setting the area and perimeter for the shape
		//------------------------------------------------------------
		for(int i = 0; i < numCircle; i++){
			CircleProperty cc = result -> 2 * Math.PI * result;
			double perimeter = c[i].getPerimeter(c[i].getRadius(), cc);
			double perRound = (double) Math.round(perimeter * 100)/100;
			c[i].setPerimeter(perRound);
			double areaRound = (double) Math.round(c[i].calArea()*100)/100;
			c[i].setArea(areaRound);
			//For Debug usage only
			//System.out.print(c[i].toString());
			//System.out.println("perimeter = " + c[i].getPerimeter() + ", area = " + c[i].getArea() + "]");
		}
		//Calculating and setting the area and perimeter for the shape
		//------------------------------------------------------------
		for(int i = 0; i < numRectangle; i++){
			RectangleProperty rr = (len,wid) -> (2*len) + (2*wid);
			double perimeter = r[i].getPerimeter(r[i].getLength(), r[i].getWidth(), rr);
			double perRound = (double) Math.round(perimeter * 100)/100;
			r[i].setPerimeter(perRound);
			double areaRound = (double) Math.round(r[i].calArea()*100)/100;
			r[i].setArea(areaRound);
			//For Debug usage only
			//System.out.print(r[i].toString());
			//System.out.println("perimeter = " + r[i].getPerimeter() + ", area = " + r[i].getArea() + "]");
		}
		//Calculating and setting the area and perimeter for the shape
		//------------------------------------------------------------
		for(int i = 0; i < numSquare; i++){
			SquareProperty ss = (len) -> (4*len);
			double perimeter = s[i].getPerimeter(s[i].getLength(), ss);
			double perRound = (double) Math.round(perimeter * 100)/100;
			s[i].setPerimeter(perRound);
			double areaRound = (double) Math.round(s[i].calArea()*100)/100;
			s[i].setArea(areaRound);
			//For Debug usage only
			//System.out.print(s[i].toString());
			//System.out.println("perimeter = " + s[i].getPerimeter() + ", area = " + s[i].getArea() + "]");
		}
		//Calculating and setting the area and perimeter for the shape
		//------------------------------------------------------------
		for(int i = 0; i < numTriangle; i++){
			TriangleProperty tt = (a,b,cs) -> (a + b + cs);
			double perimeter = t[i].getPerimeter(t[i].getA(),t[i].getB(),t[i].getC(), tt);
			double perRound = (double) Math.round(perimeter * 100)/100;
			t[i].setPerimeter(perRound);
			double areaRound = (double) Math.round(t[i].calArea()*100)/100;
			t[i].setArea(areaRound);
			//For Debug usage only
			//System.out.print(t[i].toString());
			//System.out.println("perimeter = " + t[i].getPerimeter() + ", area = " + t[i].getArea() + "]");
		}
		//Calculating and setting the area and perimeter for the shape
		//------------------------------------------------------------
		for(int i = 0; i < numParallelogram; i++){
			ParallelogramProperty pp = (len,wid) -> (2*len) + (2*wid);
			double perimeter = p[i].getPerimeter(p[i].getLength(),p[i].getWidth(), pp);
			double perRound = (double) Math.round(perimeter * 100)/100;
			p[i].setPerimeter(perRound);
			double areaRound = (double) Math.round(p[i].calArea()*100)/100;
			p[i].setArea(areaRound);
			//For Debug usage only
			//System.out.print(p[i].toString());
			//System.out.println("perimeter = " + p[i].getPerimeter() + ", area = " + p[i].getArea() + "]");
		}
		//------------------------------------------------------------
		//end of calculation and setting
		ArrayList<Shape> allShape = new ArrayList<Shape>();
		
		//sorting the arrays base on the Perimeter
		ssort.sortingPerimeter(c);
		ssort.sortingPerimeter(r);
		ssort.sortingPerimeter(p);
		ssort.sortingPerimeter(s);
		ssort.sortingPerimeter(t);
		
		//add the array into an arraylist
		allShape = ssort.list(allShape, c, numCircle);
		allShape = ssort.list(allShape, r, numRectangle);
		allShape = ssort.list(allShape, p, numParallelogram);
		allShape = ssort.list(allShape, s, numSquare);
		allShape = ssort.list(allShape, t, numTriangle);
		
		//sorting the arraylist base on the name
		allShape = ssort.sortingName(allShape);
		
		System.out.println("------Task 2------");
		allShape = delete.deleteTriangle(allShape);
		System.out.println("");
		allShape = delete.deleteCircle(allShape);
		System.out.println("Shapes Deleted");
		System.out.println("");
		System.out.println("------Task 3------");
		System.out.println("");
		System.out.println("All Shapes Calculated");
		System.out.println("");
		System.out.println("------Task 4------");
		System.out.println("");
		
		for(int i = 0; i < allShape.size(); i++)
			System.out.println(allShape.get(i).toString() + "perimeter = " + 
							   allShape.get(i).getPerimeter() + ", area = " + 
							   allShape.get(i).getArea() + "]");
		//System.out.println(allShape.size());
		System.out.println("");
		System.out.println("-----Task End-----");


	}
}//end of class