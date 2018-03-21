package lab3;

public class Words {
	
	private Words() {
		
	}
	
	public static String[] returnWords(String sentencies){
		
		return sentencies.split(" ");
	}
}


