package br.edu.ifpb.pps;

import java.util.ArrayList;

public class IteradorCanaisFilme implements IteratorCanais{
	private String[][] lista;
	private int cont1;
	private int cont2;
	
	public IteradorCanaisFilme(String[][] lista) {
		super();
		this.lista = lista;
		this.cont1 = 0;
		this.cont2 = 0;
	}

	@Override
	public Object next() {
		String menuItem = lista[cont1][cont2];
		for(int i = 0; i < cont1; i++){
			cont1++;
			for(int j = 0; j < cont2; j++){
				cont2++;
			}
		}
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (cont1 >= lista.length || lista[cont1][cont2] == null) {
			return false;
		} else {
			return true;
		}
	}
}
