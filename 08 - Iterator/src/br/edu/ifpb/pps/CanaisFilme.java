package br.edu.ifpb.pps;

public class CanaisFilme implements CriacaoIterator{
	private String[][] canais = new String[2][2];
	
	public CanaisFilme(){
		canais[0][0] = "Canal de filme 1";
		canais[0][1] = "Canal de filme 2";
		canais[1][0] = "Canal de filme 3";
		canais[1][1] = "Canal de filme 4";
	}

	@Override
	public IteratorCanais criaIterador() {
		return new IteradorCanaisFilme(canais);
	}
}
