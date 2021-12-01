package ejercicios;

public class Ejercicio04 {
	public static int media(int a, int b) {
		
		int media = 0;
		if (a<0) {
			return 0;
		}else if(b<0) {
			return 0;
		}else {
			media = (a+b)/2;
			return media;
		}
	}
}
