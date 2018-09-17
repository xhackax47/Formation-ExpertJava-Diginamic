package tppoo;

public class Rond extends Figure implements Surfacable {

	private Point centre;
	private int rayon;

	public Rond(Point point, int rayon) {
		super();
		this.centre = point;
		this.rayon = rayon;
	}

	public Rond() {

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
		return "ROND";
	}

	@Override
	protected Rond clone() {
		return new Rond();
	}

	public boolean equals(Rond r) {
		if (r.centre == this.centre && r.rayon == this.rayon) {
			System.out.println("Les ronds ne sont pas égaux");
		} else {
			System.out.println("Les ronds ne sont pas égaux");
		}
		return true;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rond) {
			Rond r = (Rond) obj;
			return ((this.centre == r.centre) && (this.rayon == r.rayon));
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
	public Point[] getPoints() {
		return new Point[] {centre};
	}
	
}
