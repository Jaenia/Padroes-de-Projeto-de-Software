package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	private List<String> frutasAL;
	private String[][] frutasM;
	
	public Listas(){
		this.frutasAL = new ArrayList<String>();
		this.frutasM = new String[2][2];
		
		frutasAL.add("maça");
		frutasAL.add("laranja");
		frutasAL.add("banana");
		
		frutasM[0][0] = "abacaxi";
		frutasM[0][1] = "mamao";
		frutasM[1][0] = "abacate";
		frutasM[1][1] = "uva";
	}

	public List<String> getFrutasAL() {
		return frutasAL;
	}

	public void setFrutasAL(List<String> frutasAL) {
		this.frutasAL = frutasAL;
	}

	public String[][] getFrutasM() {
		return frutasM;
	}

	public void setFrutasM(String[][] frutasM) {
		this.frutasM = frutasM;
	}
}
