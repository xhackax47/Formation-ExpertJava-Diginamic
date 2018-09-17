package tppoo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Segment extends Figure implements Surfacable {
	
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
	public Iterator<Point> getPoints() {
		Collection<Point> c = new HashSet<>();
		c.add(debut);
		c.add(fin);
		return c.iterator();
	}

	@Override
	public double surface() {
		return 0;
	}

}
