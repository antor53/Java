/*
 *	Kelvin Cho
 *	Feb 16, 2017
 *  Version 1.0
 *  Description:
 *  The deleteArray class is as the name imply,
 *  it is use for deleting array.
 */

//import
import java.util.ArrayList;

public class deletingArray {
	
	//deleteTriangle is a method to use for removing the smallest triangle in the arraylist
	public static ArrayList<Shape> deleteTriangle(ArrayList<Shape> a){
		//declare variable
		double min = 1000;
		int index = 0;
		
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getName().equalsIgnoreCase("Triangle")){
				if(min > a.get(i).getPerimeter()){
					min = a.get(i).getPerimeter();
					index = i;
				}
			}
		}
		
		a.remove(index);
		
		return a;
	}//end of deleteTriangle
	
	//deleteCircle is a method to use for removing the smallest circle in the arraylist
	public static ArrayList<Shape> deleteCircle(ArrayList<Shape> a){
		//declare variable
		double max = 0;
		int index = 0;
		
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getName().equalsIgnoreCase("Circle")){
				if(max < a.get(i).getPerimeter()){
					max = a.get(i).getPerimeter();
					index = i;
				}
			}
		}
		
		a.remove(index);
		
		return a;
	}//end of deleteCircle
	
}//end of class