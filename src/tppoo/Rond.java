package tppoo;

public class Rond implements Cloneable {

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

	public void affiche() {
		System.out.println(this.toString());
	}
	
	protected String getType() {
		return "ROND";
	}

	@Override
	protected Rond clone() throws CloneNotSupportedException {
		return (Rond) super.clone();
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

}
