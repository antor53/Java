/*
 * Kelvin Cho
 * Feb 14, 2017
 * Version 1.0
 * Description:
 * This class is use for pure validation.
 * It checks if the string that was read,
 * was a valid number or a character.
 */
public class Validation {
	
	//This statement return if the Circle is has a valid radius
	public static boolean isCValid(String a){
		//Try and catch statement to see if the string that was read was a number or not
		try{
			//Create a temporary variable
			double tempR = Double.parseDouble(a);
			//checks if the number is greater than zero
			if(tempR > 0){
				//if all condition was met return true
				return true;
			}
			else{
				//if number is either zero or negative
				return false;
			}
		}
		catch(NumberFormatException e){
			//Return false if string was a character
			return false;
		}
	}// end of isCValid()
	
	//This statement return if the Circle is has a valid radius
	public static boolean isPValid(String a, String b){
		//Try and catch statement to see if the string that was read was a number or not
		try{
			//Create a temporary variable
			double tempL = Double.parseDouble(a);
			double tempW = Double.parseDouble(b);
			//checks if the number is greater than zero
			if(tempL > 0){
				if(tempW > 0){
					//if all condition was met return true
					return true;
				}
				else{
					//if number is either zero or negative
					return false;
				}
			}
			else{
				//if number is either zero or negative
				return false;
			}
		}
		catch(NumberFormatException e){
			//Return false if string was a character
			return false;
		}
	}//end of isPValid()
	
	//This statement return if the Circle is has a valid radius
	public static boolean isRValid(String a, String b){
		//Try and catch statement to see if the string that was read was a number or not
		try{
			//Create a temporary variable
			double tempL = Double.parseDouble(a);
			double tempW = Double.parseDouble(b);
			//checks if the number is greater than zero
			if(tempL > 0){
				if(tempW > 0){
					//if all condition was met return true
					return true;
				}
				else{
					//if number is either zero or negative
					return false;
				}
			}
			else{
				//if number is either zero or negative
				return false;
			}
		}
		catch(NumberFormatException e){
			//Return false if string was a character
			return false;
		}
	}//end of isRValid()
	
	public static boolean isSValid(String a){
		//Try and catch statement to see if the string that was read was a number or not
		try{
			//Create a temporary variable
			double tempL = Double.parseDouble(a);
			//checks if the number is greater than zero
			if(tempL > 0.0001){
				//if all condition was met return true
				return true;
			}
			else{
				//if number is either zero or negative
				return false;
			}
		}
		catch(NumberFormatException e){
			//Return false if string was a character
			return false;
		}
	}//end of isSValid()
	
	public static boolean isTValid(String a, String b, String c){
		//Try and catch statement to see if the string that was read was a number or not
		try{
			//Create a temporary variable
			double tempA = Double.parseDouble(a);
			double tempB = Double.parseDouble(b);
			double tempC = Double.parseDouble(c);
			//checks if the number is greater than zero
			if(tempA + tempB > tempC){
				return true;
			}
			else{
				return false;
			}
		}
		catch(NumberFormatException e){
			//Return false if string was a character
			return false;
		}
	}//end of isTValid()
}//end of class