package controller;

public class ThreadVetorController extends Thread
{
 private int x;
 private int[] vet;
 
	public ThreadVetorController(int x, int[]vet) 
	{
	this.x = x;
	this.vet = vet;
	}

	public void run()
	{
	percorre();	
	}

	private void percorre() 
	{
	 if (x % 2 == 0)
	 {
		long inicio = System.nanoTime();
		for (int i = 0; i < vet.length; i++) 
		{}
		long fim = System.nanoTime();
		System.out.println(" A duração da operação com a operação For é de " + (fim - inicio) / Math.pow(10,9) + " segundos");		
	 } else
	  {
        long inicio = System.nanoTime();
		for (int i : vet) 
		{}
		long fim = System.nanoTime();
		System.out.println(" A duração da operação com a operação ForEach é de " + (fim - inicio) / Math.pow(10,9) + " segundos");	
	  }	
	}
}
