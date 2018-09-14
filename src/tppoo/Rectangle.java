package tppoo;

public class Rectangle implements Cloneable {

	Point pointBasGauche;
	int x;
	int y;

	public Rectangle(Point pointBasGauche, int x, int y) {
		super();
		this.pointBasGauche = pointBasGauche;
		this.x = x;
		this.y = y;
	}

	public Rectangle() {

	}

	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public void setPointBasGauche(Point pointBasGauche) {
		this.pointBasGauche = pointBasGauche;
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

	public Point getPointBasDroit() {
		Point result = new Point(pointBasGauche.getX(), pointBasGauche.getX() + y);
		return result;

	}

	public Point getPointHautDroit() {
		Point result = new Point(pointBasGauche.getX() + x, pointBasGauche.getX());
		return result;
	}

	public Point getPointHautGauche() {
		Point result = new Point(pointBasGauche.getX() + x, pointBasGauche.getX() + y);
		return result;
	}

	@Override
	public String toString() {
		return  getType() + "[Le pointBasGauche est égal à : " + pointBasGauche + ", x=" + x + ", y=" + y
				+ ", getPointBasGauche()=" + getPointBasGauche() + ", getPointBasDroit()=" + getPointBasDroit()
				+ ", getPointHautDroit()=" + getPointHautDroit() + ", getPointHautGauche()=" + getPointHautGauche()
				+ "]";
	}

	public void affiche() {
		System.out.println(this.toString());
	}
	
	protected String getType() {
		return "RECT";
	}

	@Override
	protected Rectangle clone() throws CloneNotSupportedException {
		return (Rectangle) super.clone();
	}

	public boolean equals(Rectangle rg) {
		if ((rg.x == this.x) && (rg.y == this.y) && (rg.pointBasGauche == this.pointBasGauche)) {
			System.out.println("Les rectangles sont égaux");
		} else {
			System.out.println("Les rectangles ne sont pas égaux");
		}
		return true;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle rg = (Rectangle) obj;
			return ((rg.x == this.x) && (rg.y == this.y) && (rg.pointBasGauche == this.pointBasGauche));
		}
		return false;
	}

}
