package br.edu.ifpb.pps;

import java.util.ArrayList;

public class IteradorCanaisEsporte implements IteratorCanais{
	private ArrayList<String> lista;
	private int contador;
	
	public IteradorCanaisEsporte(ArrayList<String> lista) {
		super();
		this.lista = lista;
		this.contador = 0;
	}

	@Override
	public Object next() {
		String menuItem = lista.get(contador);
		contador++;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (contador >= lista.size() || lista.get(contador) == null) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
