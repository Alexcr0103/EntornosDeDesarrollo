package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Ejercicio05 calc= new Ejercicio05();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un valor ");
		num1=sc.nextInt();
		System.out.println("Introduzca un valor ");
		num2=sc.nextInt();
		System.out.println("Introduzca un valor ");
		num3=sc.nextInt();
		
		System.out.println("La resta es " + calc.resta(num1, num2));
		System.out.println("La suma es " + calc.suma(num1, num2));
		System.out.println("La multiplicación " + calc.multiplicacion(num1, num2));
		System.out.println("La división " + calc.division(num1, num2));
		System.out.println("La mitad del último dígito introducido es: " + calc.mitadSiPar(num3));
	}
	
	public static int suma (int num1, int num2) {
		return num1+num2;
	}
	
	public static int resta (int num1, int num2) {
		return num1-num2;
	}
	
	public static int multiplicacion (int num1, int num2) {
		return num1*num2;
	}
	
	public static float division (float num1, float num2) {
		if(num2<=0) {
			System.out.println("La división no se puede hacer");
			return 0;
		}
		return num1/num2;
	}
	
	public static int mitadSiPar(int num3) {
		if (esPar(num3)) {
			return num3/2;
		}
		else {
			System.out.println("El número no es par");
			return num3;
		}
	}
	
	public static boolean esPar (int num3) {
		if (num3 % 2 ==0) {
			return true;
		} 
		else {
			return false;
		}
	}

}
