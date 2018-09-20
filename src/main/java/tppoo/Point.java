package tppoo;

import java.io.Serializable;

public class Point implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 6421619239136105397L;
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
		return getType() + "[L'abscisse est égale à : " + x + " et l'ordonnée est égale à : " + y + "]" ;
		
	}
	
	@Override
	protected Point clone() {
		return new Point(x,y);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point) obj;
			return ((this.x == p.x) && (this.y == p.y));
		}
		return false;
	}
	
	protected String getType() {
		return "POINT";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}

	public double distance(Point p) {
		int dx = p.getX() - this.getX();
		int dy = p.getY() - this.getY();
		int dx2 = dx * dx;
		int dy2 = dy * dy;
		return Math.sqrt(dx2 + dy2);
	}

}
