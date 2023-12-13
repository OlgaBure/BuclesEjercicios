import java.util.Scanner;
//Hacer un programa que pida tres números N, M y Y. Mostrar todos los valores comprendidos entre N y M con un intervalo Y.
/*Si M < N, antes se habrán de intercambiar los valores.*/
public class Ej5 {

	public static void main(String[] args) {
		int N;
		int M;
		int Y;

		Scanner read = new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		N = read.nextInt();
		M = read.nextInt();
		Y = read.nextInt();
		if (M < N) {
			int aux = M;
			M = N;
			N = aux;
		}
		for (int contador = N; contador <= M; contador= contador+Y) {
				System.out.println(contador);
			}
	}
}


