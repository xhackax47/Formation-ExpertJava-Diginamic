package tppoo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dessin implements Serializable{

	private static final long serialVersionUID = 4770385045088931015L;

	public Dessin() {
		super();
	}

	private Collection<Figure> figures = new ArrayList<Figure>();

	public Dessin(Collection<Figure> figures) {
		super();
		this.figures = figures;
	}
	
	public boolean add(Figure figure) {
		return figures.add(figure);
	}
	
	public boolean addAll(Collection<Figure> figures) {
		return this.figures.addAll(figures);
	}
	
	public Iterator<Figure> getFigures(){
		return figures.iterator();
	}

}
