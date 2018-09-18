package tppoo;

public enum Couleur {
	
	ROUGE('R'),VERT('V'),BLEU('B'),JAUNE('J'),NOIR('N');
	
	private char code;
	
	public String getCode() {
		return String.valueOf(code);
	}

	public void setCode(char code) {
		this.code = code;
	}

	private Couleur(char c) {
		code = c;
	}
	
	public static Couleur getCouleurDefault() {
		return Couleur.NOIR;

	}

}
