package br.edu.ifpb.pps;

public class TreinoNoInicioDaTemporada implements Treino{

	@Override
	public void preparoFisico() {
		System.out.println("Preparo Fisico Leve");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior.");
	}
}
