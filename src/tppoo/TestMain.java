package tppoo;

import java.io.File;
import java.io.IOException;

public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dessin d = new Dessin();
		try {
			FigureUtil.imprime(d);
			FigureUtil.sauvegarde(d, File.createTempFile("save", ".txt"));
		} catch (ImpressionHorsLimiteException ex) {
			System.out.println("Impression hors limite" + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Erreur à l'écriture du fichier de sauvegarde" + ex.getMessage());
		}

	}

}
