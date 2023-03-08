package view;

import java.util.Random;

import controller.Exercicio0_threads;

public class Principal {
	
	public static void main(String[] args) {
		
		int vet[] = new int[1000];
		Random gerador = new Random();
		
		for(int i = 0; i < 1000; i++) {
			vet[i] = (int) gerador.nextInt(60) + 1;
		}
		
		Thread v1 = new Exercicio0_threads(1, vet);
		Thread v2 = new Exercicio0_threads(2, vet);
		v1.start();
		v2.start();
	}

}
