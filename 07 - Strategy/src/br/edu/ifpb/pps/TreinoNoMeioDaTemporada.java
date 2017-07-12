package br.edu.ifpb.pps;

public class TreinoNoMeioDaTemporada implements Treino{

	@Override
	public void preparoFisico() {
		System.out.println("Preparo Fisico Intenso.");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Reserva.");
	}
}
