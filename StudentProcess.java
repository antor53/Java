/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentProcess;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

/**
 * @author mimahmud
 */
public class StudentProcess 
{//StudentProcess class starts here	
	Student[] students = {
			new Student("Jack", "Smith", 50.0, "IT"),
			new Student("Aaron", "Johnson", 76.0, "IT"),
			new Student("Maaria", "White", 35.8, "Business"),
			new Student("John", "White", 47.0, "Media"),
			new Student("Laney", "White", 62.0, "IT"),
			new Student("Jack", "Jones", 32.9, "Business"),
			new Student("Wesley", "Jones", 42.89, "Media")};
	//An array of string has been converted to as List.
	List<Student> studentList = Arrays.asList(students);
        //number format specifier
        DecimalFormat n = new DecimalFormat(".##");

	public void taskOne(){ //task_1_start
            
		System.out.println("Task 1: \n\nComplete Student List:");
                //Collections.sort(studentList);
		for(Iterator<Student> it = studentList.iterator();it.hasNext();){
		System.out.println(it.next());		
		}
	}//task_1_end
        

	public void taskTwo(){//task_2_start
            
		System.out.println("\nTask 2: \n\nStudents who got 50.0-100.0 sorted by grade:");
		studentList.stream()
				.filter(Student ->Student.getGrade()>=50.0 && Student.getGrade()<=100.0)
                                .sorted((s1, s2)-> Double.compare(s1.getGrade(),s2.getGrade()))
				.collect(Collectors.toList())
                                .forEach(System.out::println); 
	}//task_2_end
        

        public void taskThree(){//task_3_start
            
                System.out.println("\nTask 3: \n\nFirst Student who got 50.0-100.0:");
                Optional<Student> firstStudent = studentList.stream()
				.filter(Student ->Student.getGrade()>=50.0 && Student.getGrade()<=100.0)
                                .sorted((s1, s2)-> Double.compare(s1.getGrade(),s2.getGrade())).findFirst();
                System.out.println(firstStudent.get());
        }//task_3_end
        

        public void taskFour(){//task_4_start
            
                System.out.println("\nTask 4: \n\nStudents in ascending order by last name then first:");
                studentList.stream()
                        .sorted()
                        .forEach(System.out::println); 
                
                System.out.println("\nStudents in descending order by last name then first:");                
                studentList.stream()
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println); 
        }//task_4_end
        

        public void taskFive(){//task_5_start
            
                System.out.println("\nTask 5: \n\nUnique Student last names:");
                studentList.stream()
                        .map(Student::getLastName)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
        }//task_5_end
        

        public void taskSix(){//task_6_start
            
                System.out.println("\nTask 6: \n\nStudent names in order by last name then first name: ");
                studentList.stream()
                        .sorted()
                        .map(Student::getName)
                        .collect(Collectors.toList())
                        .forEach(System.out::println); 
        }//task_6_end
        

        public void taskSeven(){//task_7_start
            
                System.out.println("\nTask 7: \n\nStudents by department:");
                Map<String,List<Student>> StudentByDepartment = studentList.stream()
                                                                .collect(Collectors.groupingBy(Student::getDepartment));
                //using forEach method from stream class
                StudentByDepartment.forEach((String key, List<Student> student)->
                System.out.println(key +"\n "+ student.toString().replace("[","").replace("]", "").replaceAll(",","\n")));
        }//task_7_end
        

        public void taskEight(){//task_8_start
            
               System.out.println("\nTask 8: \n\nCount of Students by department:");
               Map<String,Long> countingByDepartment = studentList.stream()
                                              .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting())).sortedMap());
               countingByDepartment.forEach((String key, Long count)->
               System.out.println(key + " has "+count.toString().replace("[","").replaceAll(",","\n")+" student(s)"));
        }//task_8_end
        

        public void taskNine(){//task_9_start
            
                 double totalGrade = studentList.stream()
                       .collect(Collectors.summingDouble(Student::getGrade));
                 System.out.println("\nTask 9: \n\nSum of Students' grades: " + totalGrade);
        }//task_9_end

        
        public void taskTen(){//task_10_start
            
                 double averageGrade = studentList.stream()
                       .collect(Collectors.averagingDouble(Student::getGrade));
                 System.out.println("\nTask 10: \n\nAverage of Students' grades: " + n.format(averageGrade));
        }//task_10_end

    
	public static void main(String[] args) { //main starts here
		// TODO Auto-generated method stub
                StudentProcess tasks = new StudentProcess();
                System.out.println("<-----Student Contest---->");
		tasks.taskOne();
		tasks.taskTwo();
		tasks.taskThree();
		tasks.taskFour();
		tasks.taskFive();
		tasks.taskSix();
		tasks.taskSeven(); 
		tasks.taskEight();
		tasks.taskNine();
		tasks.taskTen();
	}//main ends here
    
}