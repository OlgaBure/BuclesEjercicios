import java.util.Scanner;
// Hacer un programa que pida N números por teclado, los sume y en calcule la media.
public class Ej7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creacion de datos
		int N;
		int cantidad;

		Scanner read = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres introducir");
		cantidad = read.nextInt();
		System.out.println("Introduce los numeros");
		N = read.nextInt();

		for (int i = 0; i < N; i++) {
			//System.out.println(N + " ");
			int suma = 0;
			suma = N * cantidad;
			System.out.println(" La media es : " + suma/cantidad);
		}
	}
}
