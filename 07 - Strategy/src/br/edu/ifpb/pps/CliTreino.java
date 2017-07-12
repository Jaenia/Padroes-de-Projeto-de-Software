package br.edu.ifpb.pps;

public class CliTreino {
	private Treino treino;
	
	public CliTreino (Treino treino){
		this.treino = treino;
	}
	
	public void treinoDiario(){
		treino.preparoFisico();
		treino.jogoTreino();
		treinoTatico();
	}
	
	public void treinoTatico(){
		System.out.println("Treino Tatico");
	}
}
