package br.edu.ifpb.pps;

import java.util.ArrayList;

public class CanaisEsporte implements CriacaoIterator{
	private ArrayList<String> canais = new ArrayList<String>();
	
	public CanaisEsporte(){
		canais.add("Canal de esporte 1");
		canais.add("Canal de esporte 2");
		canais.add("Canal de esporte 3");
	}

	public ArrayList<String> getCanais() {
		return canais;
	}

	public void setCanais(ArrayList<String> canais) {
		this.canais = canais;
	}

	@Override
	public IteratorCanais criaIterador() {
		return new IteradorCanaisEsporte(canais);
		
	}

	
	
}
