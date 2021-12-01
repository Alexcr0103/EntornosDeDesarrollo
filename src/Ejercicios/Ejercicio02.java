package Ejercicios;

public class Ejercicio02 {

	public static int Mayor (int a, int b, int c) {
		int ret = 0;
		if  (a>b && a>c) {
			ret = a;
		}
		else if (c>b) {
			ret=c;
		}
		else {
			ret=b;
		}
		return ret;

	}

}
