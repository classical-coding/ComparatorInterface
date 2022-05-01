import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
	
	public static void main(String args[]){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10,"Agnibha","Delhi"));
		studentList.add(new Student(16,"Monami","Delhi"));
		studentList.add(new Student(15,"Sriraj","Orissa"));
		studentList.add(new Student(17,"Swapnil","Kolkata"));
		studentList.add(new Student(11,"Vicky","Mumbai"));
		studentList.add(new Student(19,"Ritesh","Kolkata"));
		studentList.add(new Student(7,"Ramratan","Bhubaneswar"));
		studentList.add(new Student(14,"Mritsha","Hyderabad"));
		studentList.add(new Student(20,"Watson","Goa"));
		studentList.add(new Student(12,"Subhajit","Bangalore"));
		studentList.add(new Student(15,"Saheli","Pune"));
		studentList.add(new Student(20,"Tubai","Jharkhand"));
		
		/* Original List */
		System.out.println("---------------Original List:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age+", City: "+s.city);
		});
		
		/* Sorting using Comparable Interface (in ascending order of age) */
		Collections.sort(studentList);
		
		System.out.println("---------------Sorted List in ascending order of age using Comparable:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age+", City: "+s.city);
		});
		
		/* Sorting using Comparator Interface (in ascending order of name)*/
		Collections.sort(studentList, new NameComparator());
		
		System.out.println("---------------Sorted List in ascending order of name using Comparator:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age+", City: "+s.city);
		});
		
		/* Sorting using Comparator Interface (in ascending order of age)*/
		Collections.sort(studentList, new AgeComparator());
		
		System.out.println("---------------Sorted List in ascending order of age using Comparator:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age+", City: "+s.city);
		});
	}
	
}