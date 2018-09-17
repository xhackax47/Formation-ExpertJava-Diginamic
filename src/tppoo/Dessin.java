package tppoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dessin {
	
	private Collection<Figure> figures = new ArrayList<Figure>();

	public Dessin(Collection<Figure> figures) {
		super();
		this.figures = figures;
	}
	
	public boolean add(Figure figure) {
		return figures.add(figure);
	}
	
	public Iterator<Figure> getFigures(){
		return figures.iterator();
	}

}
