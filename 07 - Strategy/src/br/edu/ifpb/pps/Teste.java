package br.edu.ifpb.pps;

public class Teste {
	public static void main(String[] args){
		System.out.println("Treino Leve:");
		CliTreino c1 = new CliTreino(new TreinoNoInicioDaTemporada());
		c1.treinoDiario();
		
		System.out.println("\nTreino Intenso:");
		CliTreino c2 = new CliTreino(new TreinoNoMeioDaTemporada());
		c2.treinoDiario();
	}
}
