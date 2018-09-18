package tppoo;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Rond extends Figure implements Surfacable, Serializable {

	private static final long serialVersionUID = -5982090214082367303L;
	private Point centre;
	private int rayon;
	
	public Rond(Point centre, int rayon) {
		this(centre, rayon, Couleur.getCouleurDefault());
	}
	
	public Rond(Point centre, int rayon, Couleur couleur) {
		super(couleur);
		this.centre = centre;
		this.rayon = rayon;
	}

	public Point getPoint() {
		return centre;
	}

	public void setPoint(Point point) {
		this.centre = point;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return getType() + "[Le point est égale à : " + centre + " et le rayon est égal à : " + rayon + "]";
	}
	
	protected String getType() {
		return "[ROND] ";
	}

	@Override
	protected Rond clone() {
		return new Rond(centre, rayon);
	}

	public boolean equals(Rond r) {
		if (r.centre == this.centre && r.rayon == this.rayon) {
			System.out.println("Les ronds sont égaux");
		} else {
			System.out.println("Les ronds ne sont pas égaux");
		}
		return true;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rond) {
			Rond r = (Rond) obj;
			return centre.equals(r.centre) && rayon == r.rayon ;
		}
		return false;
	}

	@Override
	public Point getCentre() {
		return this.centre.clone();
	}

	@Override
	public double surface() {
		return Math.PI * (rayon * rayon); // Pi X R²
	}

	@Override
	public Iterator<Point> getPoints() {
		Collection<Point> c = new HashSet<>();
		c.add(centre);
		return c.iterator();
	}
	
	@Override
	public boolean couvre(Point p) {
		int dx = p.getX() - centre.getX();
		int dy = p.getY() - centre.getY();
		int dx2 = dx * dx;
		int dy2 = dy * dy;
		double distance = Math.sqrt(dx2 + dy2);
		return distance <= rayon;
	}
	
}
