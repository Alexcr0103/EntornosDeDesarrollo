package ejercicios;

public class Ejercicio03 {
	public static int letra (String cadena, char letra) {
		int contador=0, n=0, lon;
		lon = cadena.length();
		
		if (lon>0) {
			do {
				if (cadena.charAt(contador)==letra) {
					n++;
				}
			}while (lon>0);
		}
		return n;
	}
}
