package polymorphismeETheritage;

public class Animal implements Cloneable{

	public void cri() {
		System.out.println("Cri d'animal en général : ");
		System.out.println("Je crie");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("Déplacement d'animal en général : ");
		System.out.println("Je me déplace");
		System.out.println("");
	}
	
	public Animal clone() {
		return new Animal();	
	}

}
