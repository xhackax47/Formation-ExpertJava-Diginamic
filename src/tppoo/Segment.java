package tppoo;

public class Segment extends Figure {
	
	private Point debut;
	private Point fin;
	
	public Segment(Point point, int longueur, boolean horizontal) {
		super();
		int x = point.getX() + (horizontal ? longueur : 0);
		int y = point.getY() + (horizontal ? 0 : longueur);
		this.debut = point;
		this.fin = new Point(x, y);
	}
	
	@Override
	public String toString() {
		return "[SEGMENT]" + debut + fin + "]";
	}

	@Override
	public Point getCentre() {
		int x = (debut.getX() + fin.getX()) / 2;
		int y = (debut.getY() + fin.getY()) / 2;
		return new Point(x,y);
	}

	@Override
	public Point[] getPoints() {
		return new Point[] {debut, fin};
	}

}
