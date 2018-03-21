package lab3;

public class Sentencies {
	
	
	private Sentencies() {

	};

    public static String[] returnSentencies(String text) {
    	return text.split("\\. ");
    }

}
