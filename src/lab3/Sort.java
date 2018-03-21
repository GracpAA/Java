package lab3;

public class Sort {
	
	private Sort() {
	}

	public static void sortCentencies(String[] sentencies) {
		
		int indexOfTheNextSmallest;
		for(int i =0; i< sentencies.length;i++) {
			indexOfTheNextSmallest = nextSmallestIndex(i, sentencies);
			interchange(i, indexOfTheNextSmallest, sentencies);
		}
	    			    
	}
	
	private static void interchange(int i, int j, String[] sentencies) {
		String temp = sentencies[i];
		sentencies[i]=sentencies[j];
		sentencies[j]=temp;
	}
	
	private static int nextSmallestIndex(int uns, String[] sentencies) {
		String sentence = sentencies[uns];
		int nextIndex = uns;
		for(int i=uns+1;i<sentencies.length;i++) {
			if(Words.returnWords(sentencies[i]).length<Words.returnWords(sentence).length) {
				sentence = sentencies[i];
				nextIndex = i;
			}
		}
		return nextIndex;
		
	}
}
