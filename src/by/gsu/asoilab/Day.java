package by.gsu.asoilab;

public enum Day {
	
	SUNDAY(),MONDAY(),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY();
	

	public String getName() {
		return name().toLowerCase();
	}
}
