package polymorphismeETheritage;

public class Chien extends Animal{
	
	public void cri() {
		System.out.println("Cri de CHIEN : ");
		System.out.println("J'abois");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("Déplacement CHIEN : ");
		System.out.println("Je gambade");
		System.out.println("");
	}
	
	public Chien clone() {
		return new Chien();
	}
	
}
