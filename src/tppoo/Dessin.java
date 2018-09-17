package tppoo;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
	
	private Collection<Figure> figures = new ArrayList<Figure>();

	public Dessin(Collection<Figure> figures) {
		super();
		this.figures = figures;
	}
	
	public boolean add(Figure figure) {
		return figures.add(figure);
	}
	
	public Collection<Figure> getFigures(){
		return figures;
	}

}
