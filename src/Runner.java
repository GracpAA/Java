import java.util.Arrays;
import java.util.Comparator;

import by.gsu.mslab.Student;

public class Runner {
	
	public static void main(String[] args) {
		Student[] students = {
				new Student("Andrew", 20, 0),
				new Student("Anton", 19, 2),
				new Student("Boris", 21, 1),
				new Student("Gleb", 20, 0),
				new Student("Georgiy", 18, 3),
				new Student("Denis", 19, 1),
				new Student("Anton", 21, 2),
				new Student("Dmitriy", 18, 0),
				new Student("Denis", 22, 3),
				new Student("Mihail", 19, 3)
		};
		
		printArray(students);
		
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.getName().length()<o2.getName().length()) {
					return -1;
				}
				else if(o1.getName().length()>o2.getName().length()) {
					return 1;
				}
				
				else {
					return 0;
				}
			}
		});
		
		
		printArray(students);
		
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.getAge()<o2.getAge()) {
					return -1;
				}
				else if(o1.getAge()>o2.getAge()) {
					return 1;
				}
				
				else {
					return 0;
				}
			}
		});
		
		printArray(students);
		
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.getCountOfdebd()<o2.getCountOfdebd()) {
					return -1;
				}
				else if(o1.getCountOfdebd()>o2.getCountOfdebd()) {
					return 1;
				}
				
				else {
					return 0;
				}
			}
		});
		
		printArray(students);
	}
	
	private static void printArray(Student[] students) {
        System.out.println();
		
		for(Student student: students) {
			System.out.println(student);
		}
	}
	
	

}
