package tppoo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import java.util.function.Predicate;
//import java.util.TreeSet;

public class FigureUtil {

	private static int MIN_X = 0;
	private static int MAX_X = 100;
	private static int MIN_Y = 0;
	private static int MAX_Y = 100;
	private static int MAX_TAILLE = 20;
	private static final Map<String, Figure> figuresMap = new HashMap<String, Figure>();

	private FigureUtil() {

	}

//	public static int getRandomInt(int min, int max) {
//	return min + (int) (Math.random() * ((max - min) + 1));
//}

	public static int getRandomInteger(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

	public static Point getRandomPoint(int MIN_X, int MAX_X, int MIN_Y, int MAX_Y) {
		int x = getRandomInteger(MIN_X, MAX_X);
		int y = getRandomInteger(MIN_Y, MAX_Y);
		return new Point(x, y);
	}

//	public static Rond getRandomRond() {
//		Point p = new Point(getRandomInt(0, 50), getRandomInt(0, 50));
//		Rond r = new Rond(p, getRandomInt(0, 50));
//		return r;
//	}

	public static Rond getRandomRond() {
		int rayon = getRandomInteger(1, MAX_TAILLE / 2);
		Point centre = getRandomPoint(MIN_X + MAX_TAILLE / 2, MAX_X + MAX_TAILLE / 2, MIN_Y + MAX_TAILLE / 2,
				MAX_Y + MAX_TAILLE / 2);
//		return new Rond(centre, rayon);
		Rond r = new Rond(centre, rayon);
		figuresMap.put(r.getKey(), r);
		return r;
	}

	public static Carre getRandomCarre() {
		int cote = getRandomInteger(1, MAX_TAILLE);
		Point p = getRandomPoint(MIN_X, MAX_X - cote, MIN_Y, MAX_Y - cote);
		Carre c = new Carre(p, cote);
		figuresMap.put(c.getKey(), c);
		return c;
	}

	public static Segment getRandomSegment() {
		int longueur = getRandomInteger(1, MAX_TAILLE);
		boolean horizontal = Math.random() < 0.5;
		Point p = getRandomPoint(MIN_X, MAX_X - (horizontal ? longueur : 0), MIN_Y,
				MAX_Y - (horizontal ? 0 : longueur));
		Segment s = new Segment(p, longueur, horizontal);
		figuresMap.put(s.getKey(), s);
		return s;
	}

//	public static Rectangle getRandomRectangle() {
//		Point p = new Point(getRandomInt(0, 50), getRandomInt(0, 100));
//		Rectangle rg = new Rectangle(p, getRandomInt(0, 100), getRandomInt(0, 100));
//		return rg;
//	}

	public static Rectangle getRandomRectangle() {
		int largeur = getRandomInteger(1, MAX_TAILLE);
		int hauteur = getRandomInteger(1, MAX_TAILLE);
		Point p = getRandomPoint(MIN_X, MAX_X - largeur, MIN_Y, MAX_Y - hauteur);
		Rectangle r = new Rectangle(p, hauteur, largeur);
		figuresMap.put(r.getKey(), r);
		return r;
	}

	public static Figure getRandomFigure() {
		byte choix = (byte) (Math.random() * 4);
		switch (choix) {

		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		case 2:
			return getRandomCarre();
		case 3:
			return getRandomSegment();
		default:
			return getRandomSegment();
		}
	}

//	public static Point[] getPoints(Figure... figures) {
//		int nb = 0;
//
//		Point[][] pointsDeFigures = new Point[figures.length][];
//		int i = 0;
//
//		for (Figure figure : figures) {
//			pointsDeFigures[i] = figure.getPoints();
//			i++;
//		}
//
//		for (int j = 0; j < pointsDeFigures.length; j++) {
//			nb += pointsDeFigures[j].length;
//		}
//
//		Point[] points = new Point[nb];
//		int index = 0;
//
//		for (int j = 0; j < pointsDeFigures.length; j++) {
//			for (Point p : pointsDeFigures[j]) {
//				points[index] = p;
//				index++;
//			}
//		}
//		return points;
//	}

	public static Iterator<Point> getPoints(Figure... figures) {
		Collection<Point> c = new HashSet<>();
		for (Figure f : figures) {
			Iterator<Point> it = f.getPoints();
			while (it.hasNext()) {
				c.add(it.next());
			}
		}
		return c.iterator();
	}
	public static Figure getFigureEn(Point p, Dessin d) {
		Iterator<Figure> it = d.getFigures();
		while (it.hasNext()) {
			Figure f = it.next();
			if (f.couvre(p)) {
				return f;
			}
		}
		return null;
	}

	public static Collection<Figure> genere(int n) {
		Collection<Figure> collection = new HashSet<Figure>();
		for(int i= 0; i<n; i++) {
			collection.add(getRandomFigure());
		}
		collection.iterator();
//		while (collection.size() < nombreDeFigures) {
//			collection.add(getRandomFigure());
//		}
		return collection;
	}

	public static Figure procheZero(Dessin d) {
		Iterator<Figure> it = d.getFigures();
		Collection<Figure> figures = new ArrayList<Figure>();
//		TreeSet<Figure> figures = new TreeSet<Figure>();
		while (it.hasNext()) {
			figures.add(it.next());
		}
		figures.stream().min((p1,p2) -> {return 0;});
		return Collections.min(figures);
//		return figures.first();
	}

	public static Collection<Figure> trieDominant(Dessin d) {
		List<Figure> figures = new ArrayList<Figure>();
		Iterator<Figure> it = d.getFigures();
		while (it.hasNext()) {
			figures.add(it.next());
		}
		Collections.sort(figures, new Comparator<Figure>() {

			@Override
			public int compare(Figure f1, Figure f2) {
				int s1 = 0;
				int s2 = 0;

				if (f1 instanceof Surfacable) {
					s1 = (int) ((Surfacable) f1).surface();
				}
				if (f2 instanceof Surfacable) {
					s2 = (int) ((Surfacable) f2).surface();
				}

				return s2 - s1;
			}
		});
		return figures;
	}

	public static Figure getId(String id) {
		Figure f = figuresMap.get(id);
		if (f == null) {
			f = getRandomFigure();
		}
		return f;
	}

	@SuppressWarnings("resource")
	public static void imprime(Dessin d) throws IOException, ImpressionHorsLimiteException, InterruptedException {
		File file = File.createTempFile("DessinVaultTec", ".txt");
		PrintWriter sortie = new PrintWriter(new FileOutputStream(file));
		Iterator<Figure> it = d.getFigures();

		while (it.hasNext()) {
			Figure f = it.next();
			sortie.println(f);
			Iterator<Point> itp = f.getPoints();

			while (itp.hasNext()) {
				Point p = itp.next();
				if (p.getX() < MIN_X || p.getX() > MAX_X || p.getY() < MIN_Y || p.getY() > MAX_Y) {
					throw new ImpressionHorsLimiteException();
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			sortie.print("=");
		}
		sortie.println();

		for (int y = MAX_Y; y > MIN_Y; y--) {
			for (int x = MIN_X; x < MAX_X; x++) {
				Figure f = getFigureEn(new Point(x, y), d);
				if (f == null) {
					sortie.print(" ");
				} else {
					sortie.print(f.getCouleur().getCode());
				}
			}
			sortie.println();
		}
		sortie.close();
		System.out.println("Impression du dessin dans le fichier");
		System.out.println("");
		Thread.sleep(1*1000);
		System.out.print(".");
		Thread.sleep(1*1000);
		System.out.print(".");
		Thread.sleep(1*1000);
		System.out.print(".");
		System.out.println(file.getAbsolutePath());
		System.out.println("");
	}

	public static void sauvegarde(Dessin d, File f) throws IOException, InterruptedException {
		ObjectOutputStream sortie = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		sortie.writeObject(d);
		System.out.println("Dessins sauvegardés dans le fichier : ");
		System.out.println("");
		Thread.sleep(1*1000);
		System.out.print(".");
		Thread.sleep(1*1000);
		System.out.print(".");
		Thread.sleep(1*1000);
		System.out.print(".");
		System.out.println(f.getAbsolutePath());
		System.out.println("");
		sortie.close();
	}

	public static Dessin charge(File f) throws IOException, ClassNotFoundException {
		Dessin d;
		try {
			ObjectInputStream entree = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
			d = (Dessin) entree.readObject();
			entree.close();
		} catch (FileNotFoundException ex) {
			System.out.println("EXCEPTION JAVA : Fichier non trouvé !!!" + ex.getMessage() + "'");
			d = new Dessin();
		}

		return d;
	}
}