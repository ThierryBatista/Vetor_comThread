package view;
import controller.ThreadVetorController;

public class ThreadVetor 
{
  public static void main(String[] args) 
  {
	int a = 1;
	int b = 2;
	int[]vet = new int[1000];
	
	for (int i = 0; i < 100; i++)
	{
	vet[i] = (int) ((Math.random() * 100) + 1);
	}
	Thread t = new ThreadVetorController(a, vet);
	Thread y = new ThreadVetorController(b, vet);
	t.start();
	y.start();	  
  } 
}
