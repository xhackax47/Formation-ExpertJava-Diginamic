package tppoo;

public class Rond extends Figure implements Surfacable {

	private Point point;
	private int rayon;

	public Rond(Point point, int rayon) {
		super();
		this.point = point;
		this.rayon = rayon;
	}

	public Rond() {

	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return getType() + "[Le point est égale à : " + point + " et le rayon est égal à : " + rayon + "]";
	}
	
	protected String getType() {
		return "ROND";
	}

	@Override
	protected Rond clone() {
		return new Rond();
	}

	public boolean equals(Rond r) {
		if (r.point == this.point && r.rayon == this.rayon) {
			System.out.println("Les ronds ne sont pas égaux");
		} else {
			System.out.println("Les ronds ne sont pas égaux");
		}
		return true;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rond) {
			Rond r = (Rond) obj;
			return ((this.point == r.point) && (this.rayon == r.rayon));
		}
		return false;
	}

	@Override
	public Point getCentre() {
		return this.point.clone();
	}

	@Override
	public double surface() {
		return Math.PI * (rayon * rayon); // Pi X R²
	}
	
}
