// Hacer un programa que muestre los números del 1 al 200 que sean divisibles por 2 y 3.
public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int div2,div3=0;
		for (int i = 1; i <= 200; i++) {
			div2=i%2;
			div3=i%3;
			if(div2==0 && div3==0)
				System.out.println(i);}*/

		for (int i = 1; i <= 200; i++) {
			if (200 % 2 == 0 && 200 % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}


