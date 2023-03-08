package controller;

public class Exercicio0_threads  extends Thread{
	
	private int n;
	private int vet[];
	
	public Exercicio0_threads(int n, int vet[]) {
		this.n=n;
		this.vet=vet;
	}
	
	public void run() {
		if(n%2 == 0) {
			threadpar();
		}else {
			threadimpar();
		}
		super.run();
		}
	
	private void threadpar() {
		double Tinicial = System.nanoTime();
		   long sm = 0;
		   
		   for(int i = 0; i < vet.length; i++) {
			   sm = sm + 1;
		   }
		   
		   double Tfinal = System.nanoTime();
		   double Ttotal = Tfinal = Tinicial;
		   Ttotal /= Math.pow(10, 9);
		   System.out.println("Tempo de percurso do vetor na thread par: " + Ttotal +"s");
		
	}
	

   private void threadimpar() {
	   double Tinicial = System.nanoTime();
	   long soma = 0;
	   
	   for(int i : vet) {
		   soma = soma + 1;
	   }
	   
	   double Tfinal = System.nanoTime();
	   double Ttotal = Tfinal = Tinicial;
	   Ttotal /= Math.pow(10, 9);
	   System.out.println("Tempo de percurso do vetor na thread impar: " + Ttotal +"s");
	
	

}
}
