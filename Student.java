/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentProcess;
/**
 * @author Owner
 */
public class Student implements Comparable<Student>{ //Student class starts
                //class fields
		private String firstName; 
		private String lastName;
		private double grade;
		private String department;

		/*public Student(){
                //default constructor
		}*/
                
                //all agrumants Constructor
		public Student(String firstName, String lastName, double grade, String department){
			this.firstName = firstName;
			this.lastName = lastName;
			this.grade = grade;
			this.department = department;
		}
		//setters and getter for firstName
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		public String getFirstName(){
			return firstName;
		}
		//setter and getter for lastName
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		public String getLastName(){
			return lastName;
		}
		//setter and getter for grades
		public void setGrade(double grade){
			this.grade = grade;
		}
		public double getGrade(){
			return grade;
		}
		//setter and getter for department
		public void setDepartment(String department){
			this.department = department;
		}
		public String getDepartment(){
			return department;
		}
		//getName method 
                //format method form string class is used here to format the full name
		public String getName(){
			return String.format("%-8s",firstName)+ " " + String.format("%-8s",lastName);
		}
		
		//Overriden toString Method
		@Override
		public String toString() {
			return String.format("%-8s",getFirstName()) + " " 
                        +String.format("%-8s",getLastName()) + " " 
                        + String.format("%-7.2f",grade) + " "
                        + String.format("%-10s", department);
			}
		
		//Overriden equals method
		@Override
		public boolean equals(Object obj){
			if(obj == this){
				return true;
			}
			if(obj == null){
				return false;
			}
			if(this.getClass() !=  obj.getClass()){
				return false;
			}
			Student other =  (Student) obj ;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			
			if (this.grade != other.grade) {
				return false;
			}	
			if (department == null) {
				if (other.department != null)
					return false;
			} else if (!department.equals(other.department))
				return false;
			
			return true;
		}
		
		//Overriden HashCode
		@Override
		public int hashCode(){
			final int prime= 31;
			int result = 1;
			result = prime * result + ((firstName == null)? 0:firstName.hashCode());
			result = prime * result + ((lastName == null)? 0:lastName.hashCode());
			result = prime * result + (int)grade;
			result = prime * result + ((department == null)? 0:department.hashCode());
			return result;
		}
        //the compareTo method been overriden here to supoort sorting by lastName and then by firstName.
            //so that sorted method of the stream class can be used without argument, 
                //as this assignment involves similar type of sorting several times
        @Override
        public int compareTo(Student o)
        {
            int d = getLastName().compareTo(o.getLastName());
            if (d == 0)
                d = getFirstName().compareTo(o.getFirstName());
            return d;
        } 
}//Student class ends here
