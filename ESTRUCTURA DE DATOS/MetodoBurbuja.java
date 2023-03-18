import java.util.Scanner;
import java.util.Random;

public class Main
{


  public static void main (String[]args)
  {


    System.out.println ("Digite el tamaño del vector");
    Scanner teclado = new Scanner (System.in);
    //tamaño
    int n = teclado.nextInt ();
    //Creo el vector a partir del tamaño
    int vector[] = new int[n];
    //Generador de numeros aleatorios
    Random numero = new Random ();
    for (int i = 0; i < vector.length; i++)
      {
	vector[i] = numero.nextInt (100);

      }
    int minimo = vector[0];

    for (int i = 0; i < vector.length; i++)
      {
	System.out.print (vector[i] + "\t");


      }

    //Metodo burbuja
    for (int i = 0; i < vector.length - 1; i++)
      {

	for (int j = 0; j < vector.length - 1; j++)
	  {
	    if (vector[j] > vector[j + 1])
	      {

		int aux = vector[j];
		vector[j] = vector[j + 1];
		vector[j + 1] = aux;
		vector[j+1] = aux;
	      }
	  }
      }

    //Mostrar el vector ordenado
    System.out.println ("\n El vector ordenado es:" + "\t");
    for (int i = 0; i < vector.length; i++)
      {
	System.out.print (vector[i] + " / ");
      }
    System.out.print ("");

  }
}
