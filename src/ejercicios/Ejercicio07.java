package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		boolean numIguales = false;
		int num, num2;
		
		do {
			System.out.println("Introduzca los números a comparar ");
			num =sc.nextInt();
			num2=sc.nextInt();
		}while(numIguales);
		System.out.println("Los números son iguales " + numIguales(num, num2) );
	}
		
		public static boolean numIguales (int num, int num2) {
			boolean numIguales = false;
			
			if (num ==num2) {
				numIguales =true;
			}
			else {
				numIguales = false;
			}
			return numIguales;

		}

}
