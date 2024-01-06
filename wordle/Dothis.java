package wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dothis {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("src/wordle/words.dat"));
		String adah = "{";
		for (int x = 0; x < 5757; x++) {
			adah += ("\"" + in.nextLine() + "\"" + ", ");
		}
		adah += "}";
		
		FileWriter me = new FileWriter("src/wordle/out.dat");
		me.write(adah);
		me.close();
	}
	
}
