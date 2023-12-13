import java.util.Scanner;
public class Ej3 {
	//Hacer un programa que pida dos números por el teclado N y M, y si M > N muestre todos los valores comprendidos entre estos dos números.
	public static void main(String[] args) {

		int N;
		int M;

		Scanner read= new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		N=read.nextInt();
		M= read.nextInt();

		if (M>N) {
			for (int contador = N; contador <= M; contador++) {
				System.out.println(contador);
			}
		}
		else if (N>M) {
			for (int contador = N; contador >= M; contador--) {
				System.out.println(contador);
			}
		}
		read.close();
	}
}


