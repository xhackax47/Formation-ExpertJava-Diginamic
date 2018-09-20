package polymorphismeETheritage;

public class Oiseau extends Animal{
	
	public void cri() {
		System.out.println("Cri OISEAU : ");
		System.out.println("Je siffle et chante");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("Déplacement OISEAU : ");
		System.out.println("Je vole");
		System.out.println("");
	}
	
	public Oiseau clone() {
		return new Oiseau();
	}
	
}
