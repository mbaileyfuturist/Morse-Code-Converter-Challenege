package Project4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentance = sc.next();
		
		MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
		
		StringBuilder morseCode = morseCodeConverter.convertToMorseCode(sentance);
		
		System.out.println(morseCode);
	}

}
