package view;

import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		int vetor[] = new int[1000];
		int parametro;
		int dois = 2;
		
		for(int i = 0; i < vetor.length; i++ ) {
			vetor[i] = (int) (Math.random() * (100 - 1)) + 1;
		}
		
		ThreadVetor t = new ThreadVetor(parametro = 1, vetor);
		t.start();
		
		t = new ThreadVetor(parametro = 2, vetor);
		t.start();
		
	}
}
