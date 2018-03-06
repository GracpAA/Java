package by.gsu.mslab;

public class Student {
	private String name;
	private int age;
	private int countOfdebd;
	
	
	public Student() {
		
	}
	
	public Student(String name, int age, int countOfdebd) {
		this.setName(name);
		this.setAge(age);
		this.setCountOfdebd(countOfdebd);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfdebd() {
		return countOfdebd;
	}

	public void setCountOfdebd(int countOfdebd) {
		this.countOfdebd = countOfdebd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"; "+age+"; "+countOfdebd+"; ";
	}

	
	
}
