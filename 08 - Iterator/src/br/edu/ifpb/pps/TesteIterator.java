package br.edu.ifpb.pps;

import java.util.Iterator;
import java.util.List;

public class TesteIterator {
	public static void main(String[] args){
		CriacaoIterator canaisEsporte = new CanaisEsporte();
		IteratorCanais it1 = canaisEsporte.criaIterador();
		
		CriacaoIterator canaisFilme = new CanaisFilme();
		IteratorCanais it2 = canaisFilme.criaIterador();
		
		System.out.println("Canais de esporte");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		System.out.println("Canais de filme");
		while(it1.hasNext()){
			System.out.println(it2.next());
		}
	}
}
