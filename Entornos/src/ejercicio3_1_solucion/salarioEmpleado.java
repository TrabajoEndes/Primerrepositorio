package ejercicio3_1_solucion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class salarioEmpleado {

	public static void main(String[] args) throws IOException {
		String nombre;
		int mes;
		int anio;
		double salBrut;
		double salNet;
		double ventasMes;
		int horasExtra;
		String tipoEmpleado;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Intoduce el nombre");
		nombre = br.readLine();
        
		System.out.println("Intoduce el mes en forma de n?mero (del 1 al 12): ");
		mes = Integer.parseInt(br.readLine());
		
		System.out.println("Intoduce el a?o");
		anio = Integer.parseInt(br.readLine());
		
		System.out.println("Intoduce las ventas al mes");
		ventasMes = (double)Integer.parseInt(br.readLine());
		
		System.out.println("Intoduce las horas extra");
		horasExtra = Integer.parseInt(br.readLine());
		
		System.out.println("Intoduce el tipo de empleado: vendedor o encargado:");
		tipoEmpleado = br.readLine();
        
		salBrut = calculaSalarioBruto(tipoEmpleado, ventasMes, horasExtra);
		salNet = calculaSalarioNeto(salBrut);
		
		System.out.println("El salario bruto de Aitor es: "+ salBrut);
		//System.out.println("El salario neto de Aitor es: "+ salNet);
		
		
		
	}
	
	
	public static double calculaSalarioNeto (double salbr) {
		double salnet;
		
		if (salbr > 1500)
			salnet = salbr*0.82;
		else
			if (salbr >= 1000)
				salnet = salbr*0.84;
			else
				salnet = salbr;
		
		return salnet;
	}
	
	public static double calculaSalarioBruto (String tipo, double ventasMes, int horasExtr) {
		double salbr=0;					//1
		
		if (tipo.equals("vendedor"))	//2
				salbr += 1000;			//3
		else							//4
				salbr += 1500;			//5
		
		if (ventasMes >= 1500)			//6
				salbr += 200;			//7
		else							//8
			if (ventasMes > 1000)		//9
				salbr += 100;			//10
		salbr += horasExtr*20;			//11
		
		return salbr;					//12
	}
}