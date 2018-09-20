package polymorphismeETheritage;

public class Oiseau extends Animal{
	
	public void cri() {
		System.out.println("Cri d'OISEAU : ");
		System.out.println("Je siffle et chante");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("Déplacement d'oiseau : ");
		System.out.println("Je vole");
		System.out.println("");
	}
	
	public Oiseau clone() {
		return new Oiseau();
	}
	
}
