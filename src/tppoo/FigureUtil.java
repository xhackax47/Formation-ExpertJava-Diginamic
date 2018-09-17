package tppoo;

public class FigureUtil {

	private static int MIN_X = 0;
	private static int MAX_X = 100;
	private static int MIN_Y = 0;
	private static int MAX_Y = 100;
	private static int MAX_TAILLE = 20;

	private FigureUtil() {

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
		return new Rond(centre, rayon);
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
		return new Rectangle(p, hauteur, largeur);
	}

//	public static int getRandomInt(int min, int max) {
//		return min + (int) (Math.random() * ((max - min) + 1));
//	}

	public static int getRandomInteger(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

	public static Point[] getPoints(Figure[] figures) {
		int nb = 0;

		Point[][] pointsDeFigures = new Point[figures.length][];
		int i = 0;

		for (Figure figure : figures) {
			pointsDeFigures[i] = figure.getPoints();
			i++;
		}

		for (int j = 0; j < pointsDeFigures.length; j++) {
			nb += pointsDeFigures[j].length;
		}

		Point[] points = new Point[nb];
		int index = 0;

		for (int j = 0; j < pointsDeFigures.length; j++) {
			for(Point p : pointsDeFigures[j]) {
				points[index] = p;
				index++;
			}
		}
		return points;
	}
}