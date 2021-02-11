package OperacionesArray;

public class operacionesArray {
	static int v1[]= {1,2,3,4,5,6,7,8,9,0};
	
	public static void main(String[] args) {
		System.out.println("La media es :" +media(v1));
		System.out.println("El maximo es :" +max(v1));
		System.out.println("El minimo es :" +min(v1));
		mostrar(v1);
		inverso(v1);
		System.out.println();
		mostrar(v1);
	}
	
	static double media(int array[]) {
		double aux=0;								
		for (int i=0; i<array.length; i++) {		
			aux+=array[i];							
		}
		
		return (aux/array.length);
	}
	static double max(int array[]) {
		double aux=0;
		for (int i=0; i<array.length; i++) {
			if(array[i]>aux)
				aux=array[i];
		}
		
		return aux;
	}
	
	static double min(int array[]) {
		double aux=0;
		for (int i=0; i<array.length; i++) {
			aux=array[0];
			if(array[i]<aux)
				aux=array[i];
		}
		
		return aux;
	}
	
	static void mostrar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]+" -");
		}
	}
	
	static void inverso(int array[]) {
		int aux;
		for (int i = 0; i < array.length/2; i++) {
			aux=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=aux;
		}
	}
	
	
}
