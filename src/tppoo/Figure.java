package tppoo;

public abstract class Figure {
	
	public void affiche() {
		System.out.println(this.toString());
//		System.out.println(toString());
	}

	public abstract Point getCentre();
	public abstract Point[] getPoints();
}
