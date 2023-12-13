import java.util.Scanner;

// Hacer un programa que pida N números. El programa ha de decir cuantos hay de pares, y cuantos de impares.
public class Ej10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce cuantos numeros quieres introducir");
        int cantidad = read.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("Introduce numeros");
            int N = read.nextInt();
             if (N % 2 == 0) {
                System.out.println("Son pares");
            } else {
                System.out.println("Son impares");
            }
        }
    }
}


