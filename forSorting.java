/*
 *	Kelvin Cho
 *	Feb 16, 2017
 *  Version 1.0
 *  Description:
 *  The forSorting class is use for mainly sorting the arrays
 *  but it also allow array to be added into an arraylist
 */

//import
import java.util.ArrayList;

public class forSorting {
	
	//list turn array into arraylist
	public static ArrayList<Shape> list(ArrayList<Shape> a, Object[] b, int size){
		for(int i = 0; i < size; i++){
			a.add((Shape) b[i]);
		}
		return a;
	}//end of list
	
	//sortingName is use for sorting the arraylist base on the name
	public static ArrayList<Shape> sortingName(ArrayList<Shape> a){
		//declared variable
		ArrayList<Shape> temp = new ArrayList<Shape>();
		String tempName = "";
		boolean C = true;
		boolean P = false;
		boolean S = false;
		boolean T = false;
		boolean R = false;
		
		for(int i = 0; i <  5; i++){
			tempName = a.get(i).getName();
			for(int j = 0; j < a.size(); j++){
				if(C){
					if(tempName.equals("Circle")){
						temp.add(a.get(j));
					}
				}
				else if(P){
					if(tempName.equals("Parallelogram")){
						temp.add(a.get(j));
					}
				}
				else if(R){
					if(tempName.equals("Rectangle")){
						temp.add(a.get(j));
					}
				}
				else if(S){
					if(tempName.equals("Square")){
						temp.add(a.get(j));
					}
				}
				else{
					if(tempName.equals("Triangle")){
						temp.add(a.get(j));
					}
				}
			}
			if(C){
				P = true;
				C = false;
			}
			else if(P){
				R = true;
				P = false;
			}
			else if(R){
				S = true;
				R = false;
			}
			else if(S){
				T = true;
				S = false;
			}
			else{
				T = false;
			}
		}
		return temp;
	}//end of sortingName
    
	//sortingName is use for sorting the arraylist base on the perimeter
	public static Shape[] sortingPerimeter(Shape[] a){
		//declare variable
		Shape temp;
		//loop
		for(int i = 0; i < a.length ; i++){
			for(int j = 0; j < a.length - 1; j++){
				if(a[i].getPerimeter() < a[j].getPerimeter()){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}		
		return a;
	}//end of sortingPerimeter
}//end of class