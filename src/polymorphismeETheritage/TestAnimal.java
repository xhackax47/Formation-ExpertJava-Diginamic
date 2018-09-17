package polymorphismeETheritage;

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal chien = new Chien();
		Animal oiseau = new Oiseau();
		Animal pigeon = new Pigeon();
		
		Animal a2 = animal.clone();
		Animal c2 = chien.clone();
		Animal o2 = oiseau.clone();
		Animal p2 = pigeon.clone();
		
		System.out.println("CRIS D'ANIMAUX");
		System.out.println("");
		
		animal.cri();
		chien.cri();
		oiseau.cri();
		pigeon.cri();
		
		System.out.println("DEPLACEMENT D'ANIMAUX");
		System.out.println("");
		
		a2.seDeplace();
		c2.seDeplace();
		o2.seDeplace();
		p2.seDeplace();
	}

}
