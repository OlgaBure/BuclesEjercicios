import java.util.Scanner;
//Hacer un programa que pida un número, y después muestre su tabla de multiplicar.
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=1;
		int suma;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Inrtoduce un numero");
		int numero = read.nextInt();
		
			for ( int i=1; i<=10; i++) {
			suma=numero*i;
			contador++;
				System.out.println(suma);
			}
			read.close();
		}
	}

