package Project4;

import java.util.ArrayList;

public class MorseCode {

	private char character;
	private String code;
	
	public MorseCode() {
		character = 0;
		code = null;
	}
	
	public MorseCode(char character, String code) {
		this.character = character;
		this.code = code;
	}
	
	public MorseCode(MorseCode morseCode) {
		character = morseCode.character;
		code = morseCode.code;
	}
	
	public void setCharacter(char character) {
		this.character = character;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public char getCharacter() {
		return character;
	}
	
	public String getCode() {
		return code;
	}
}
