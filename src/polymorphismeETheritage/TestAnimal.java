package polymorphismeETheritage;

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal chien = new Chien();
		Animal oiseau = new Oiseau();
		Animal pigeon = new Pigeon();
		
		animal.cri();
		chien.cri();
		oiseau.cri();
		pigeon.cri();
	}

}
