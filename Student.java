public class Student implements Comparable<Student>{
	public int age;
	public String name;
	public String city;
	
	/* Parameterized Constructor */
	public Student(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}

	@Override
	public int compareTo(Student s) {
		
		return age > s.age ? 1 : age < s.age ? -1 : 0;
	}
	
	
}