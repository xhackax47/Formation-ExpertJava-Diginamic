package tppoo;

import java.util.Iterator;

public abstract class Figure {
	
	public void affiche() {
		System.out.println(this.toString());
//		System.out.println(toString());
	}

	public abstract Point getCentre();
	public abstract Iterator<Point> getPoints();
	public abstract boolean couvre(Point p);
}
