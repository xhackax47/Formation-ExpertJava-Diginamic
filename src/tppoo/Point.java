package tppoo;

public class Point implements Cloneable {
	
	private int x;
	private int y;
	private final int INIT_X = 10;
	private final int INIT_Y = 10;
	
	public Point(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public Point() {
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [L'abscisse est égale à : " + x + " et l'ordonnée est égale à : " + y + "]" ;
		
	}
	
	@Override
	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}


	public boolean equals(Point p) {
		if(p.x == this.x && p.y == this.y) {
			System.out.println("Les points sont égaux");
		}
		else {
			System.out.println("Les points ne sont pas égaux");
		}
		return true;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point) obj;
			return ((this.x == p.x) && (this.y == p.y));
		}
		return true;
	}
	
	
	public void affiche() {
		System.out.println(this.toString());
	}

}
