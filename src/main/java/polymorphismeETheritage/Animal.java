package polymorphismeETheritage;

public class Animal implements Cloneable{

	public void cri() {
		System.out.println("Cri d'animal en g�n�ral : ");
		System.out.println("Je crie");
		System.out.println("");
	}
	
	public void seDeplace() {
		System.out.println("D�placement d'animal en g�n�ral : ");
		System.out.println("Je me d�place");
		System.out.println("");
	}
	
	public Animal clone() {
		return new Animal();	
	}

}
