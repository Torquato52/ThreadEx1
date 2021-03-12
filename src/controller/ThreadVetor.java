package controller;

public class ThreadVetor extends Thread {

	private int vetor[];
	private int parametro;

	public ThreadVetor(int parametro, int vetor[]) {
		this.parametro = parametro;
		this.vetor = vetor;
		
	}
	
	public void run() {
			part1();
	}

	public void part1() {
		double tempoinicial;
		double tempofinal;

		if (parametro == 1) {
			tempoinicial = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
				
			}
			tempofinal = System.nanoTime();
			tempofinal = tempofinal - tempoinicial;
			tempofinal = tempofinal / 1e+9;
			System.out.println("O tempo para percerer é de "+tempofinal+" Segundos");
		} else {
			tempoinicial = System.nanoTime();
			for(int i : vetor) {
				
			}
			tempofinal = System.nanoTime();
			tempofinal = tempofinal - tempoinicial;
			tempofinal = tempofinal / 1e+9;
			System.out.println("O tempo para percerer é de "+tempofinal+" Segundos");
		}

	}
}
