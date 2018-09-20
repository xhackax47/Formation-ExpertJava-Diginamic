package polymorphismeETheritage;

public class Pigeon extends Oiseau{
	
	public void cri() {
		System.out.println("Cri de PIGEON : ");
		System.out.println("Je siffle et chante....et en en plus je chie sur les passants");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("Déplacement de pigeon");
		System.out.println("Je vole et trottine");
		System.out.println("");
	}
	
	public Pigeon clone() {
		return new Pigeon();
	}

}
