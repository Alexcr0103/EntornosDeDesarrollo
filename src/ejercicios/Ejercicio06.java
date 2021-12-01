package ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] =new int[100];
		int suma=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
			suma = suma + array[i];
		}
		System.out.println("Suma de valores " + suma);
	}

}
