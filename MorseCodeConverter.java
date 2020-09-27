package Project4;

import java.util.ArrayList;

public class MorseCodeConverter {

	private String sentance;
	private ArrayList<MorseCode> morseCode = new ArrayList<MorseCode>();
	
	public MorseCodeConverter() {
		this.sentance = "";
		this.morseCode = populateArrayList();
	}
	
	public MorseCodeConverter(String sentance) {
		this.sentance = sentance;
		this.morseCode = populateArrayList();
	}
	
	public MorseCodeConverter(MorseCodeConverter morseCodeConverter) {
		this.sentance = morseCodeConverter.sentance;
		this.morseCode = morseCodeConverter.morseCode;
	}

	private ArrayList<MorseCode> populateArrayList() {
		
		//Create morse code object for each character.
		MorseCode space = new MorseCode(' ', "space");
		MorseCode comma = new MorseCode(',', "--..--");
		MorseCode period = new MorseCode('.', ".-.-.-");
		MorseCode questionMark = new MorseCode('?', "..--..");
		MorseCode zero = new MorseCode('0', "-----");
		MorseCode one = new MorseCode('1', ".----");
		MorseCode two = new MorseCode('2', "..---");
		MorseCode three = new MorseCode('3', "...--");
		MorseCode four = new MorseCode('4', "....-");
		MorseCode five = new MorseCode('5', ".....");
		MorseCode six = new MorseCode('6', "-....");
		MorseCode seven = new MorseCode('7', "--...");
		MorseCode eight = new MorseCode('8', "---..");
		MorseCode nine = new MorseCode('9', "----.");
		MorseCode A = new MorseCode('A', ".-");
		MorseCode B = new MorseCode('B', "-...");
		MorseCode C = new MorseCode('C', "-.-.");
		MorseCode D = new MorseCode('D', "-..");
		MorseCode E = new MorseCode('E', ".");
		MorseCode F = new MorseCode('F', "..-.");
		MorseCode G = new MorseCode('G', "--.");
		MorseCode H = new MorseCode('H', "....");
		MorseCode I = new MorseCode('I', "..");
		MorseCode J = new MorseCode('J', ".---");
		MorseCode K = new MorseCode('K', "-.-");
		MorseCode L = new MorseCode('L', ".-..");
		MorseCode M = new MorseCode('M', "--");
		MorseCode N = new MorseCode('N', "-.");
		MorseCode O = new MorseCode('O', "---");
		MorseCode P = new MorseCode('P', ".--.");
		MorseCode Q = new MorseCode('Q', "--.-");
		MorseCode R = new MorseCode('R', ".-.");
		MorseCode S = new MorseCode('S', "...");
		MorseCode T = new MorseCode('T', "-");
		MorseCode U = new MorseCode('U', "..-");
		MorseCode V = new MorseCode('V', "...-");
		MorseCode W = new MorseCode('W', ".--");
		MorseCode X = new MorseCode('X', "-..-");
		MorseCode Y = new MorseCode('Y', "-.--");
		MorseCode Z = new MorseCode('Z', "--..");

		//Initialize arraylist.
		ArrayList<MorseCode> List = new ArrayList<MorseCode>();
		
		//Populate the arraylist with morse code objects.
		List.add(space);
		List.add(comma);
		List.add(period);
		List.add(questionMark);
		List.add(zero);
		List.add(one);
		List.add(two);
		List.add(three);
		List.add(four);
		List.add(five);
		List.add(six);
		List.add(seven);
		List.add(eight);
		List.add(nine);
		List.add(A);
		List.add(B);
		List.add(C);
		List.add(D);
		List.add(E);
		List.add(F);
		List.add(G);
		List.add(H);
		List.add(I);
		List.add(J);
		List.add(K);
		List.add(L);
		List.add(M);
		List.add(N);
		List.add(O);
		List.add(P);
		List.add(Q);
		List.add(R);
		List.add(S);
		List.add(T);
		List.add(U);
		List.add(V);
		List.add(W);
		List.add(X);
		List.add(Y);
		List.add(Z);

		return List;
	}
	
	public StringBuilder convertToMorseCode(String sentance) {
		
		StringBuilder morseCode = new StringBuilder("");
		
		for(char ch: sentance.toCharArray()) {
			
			//Convert all characters in sentence to uppercase.
			char newChar = Character.toUpperCase(ch);
			
			//Compare that character to the characters within the Arraylist.
			for(MorseCode obj: this.morseCode) {
				if(newChar == obj.getCharacter()) {
					morseCode.append(obj.getCode());
				}
			}			
			
		}
		
		return morseCode;
	}
}
