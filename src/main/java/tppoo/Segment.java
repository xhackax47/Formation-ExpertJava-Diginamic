package tppoo;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Segment extends Figure implements Serializable{
	
	private static final long serialVersionUID = 4936442336376118320L;
	private Point debut;
	private Point fin;
	
	public Segment(Point point, int longueur, boolean horizontal) {
		this(point, longueur, horizontal, Couleur.getCouleurDefault());
	}

	public Segment(Point point, int longueur, boolean horizontal, Couleur couleur) {
		super(couleur);
		int x = point.getX() + (horizontal ? longueur : 0);
		int y = point.getY() + (horizontal ? 0 : longueur);
		this.debut = point;
		this.fin = new Point(x, y);
	}

	@Override
	public String toString() {
		return getType() + debut + fin +  "]";
	}
	
	protected String getType() {
		return "[SEGMENT] ";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Segment) {
			Segment s = (Segment) obj;
			return debut.equals(s.debut) && fin.equals(s.fin)
					|| (debut.equals(s.fin) && fin.equals(s.debut));
		}
		return false;
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
	public boolean couvre(Point p) {
		boolean couvreX = (debut.getX()<=p.getX()) && (p.getX()<= fin.getX());
		boolean couvreY = (debut.getY()<=p.getY()) && (p.getY()<= fin.getY());
		return couvreX && couvreY;
	}

}
