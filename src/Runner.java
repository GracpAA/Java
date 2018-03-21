

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import lab3.Sentencies;
import lab3.Sort;

public class Runner {

	public static void main(String args[]) throws IOException {

		String[] sentencies = null;

		FileWriter writer = null;
		FileReader reader = null;
		String string = "";
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			writer = new FileWriter("in.txt");

			do {
				string = bufferedReader.readLine();
				if (string.equals("")) {
				} else
					writer.write(string);
			} while (!string.equals(""));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();

			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		

		try {
			reader = new FileReader("in.txt");
			
			int a;

			do {
				a = reader.read();
				if (a != -1) {
					string = string + (char) a;
				}
			} while (a != -1);

			System.out.println(string);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

		sentencies = Sentencies.returnSentencies(string);
		Sort.sortCentencies(sentencies);

		for (String sentence : sentencies) {
			if (sentence.equals("")) {

			} else
				System.out.println(sentence);
		}

	}

}
