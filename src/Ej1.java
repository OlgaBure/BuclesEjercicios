/*Hacer un programa que muestre los números del 1 al 100.*/
public class Ej1 {
	public static void main(String[] args) {
		int N=1;
		int contador=0;
		
		for ( contador = 0, N=1; N <= 100; contador++, N++) {
			System.out.println(N);
		}
		System.out.println("_________________________________");
		
		do {
			System.out.println(N);
			contador++;
			N++;
		} while (contador<=100);
		System.out.println("_________________________________");
		
		while (contador<=100) {
			System.out.println(N);
			contador++;
			N++;
		}
	}
}



