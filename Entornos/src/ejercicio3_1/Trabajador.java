package ejercicio3_1;

import java.util.Scanner;

public class Trabajador {
	
	private String nombre;
	private int mes;
	private int año;
	private double salariobruto;
	private double salarioneto;
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAño() {
		return año;
	}



	public void setAño(int año) {
		this.año = año;
	}



	public double getSalariobruto() {
		return salariobruto;
	}



	public void setSalariobruto(double salariobruto) {
		this.salariobruto = salariobruto;
	}



	public double getSalarioneto() {
		return salarioneto;
	}



	public void setSalarioneto(double salarioneto) {
		this.salarioneto = salarioneto;
	}



	public void set_x() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre");
		this.nombre = sc.next();
		
		System.out.println("Mes (*En numero*)");
		this.mes=sc.nextInt();
		
		System.out.println("Año");
		this.año=sc.nextInt();
		
		sc.close();
	}

	

	public Trabajador() {
		this.nombre = "";
		this.mes = 0;
		this.año = 0;
		this.salariobruto = 0;
		this.salarioneto = 0;
	}
	
	public double calculaSalarioBruto(String TipoEmpleado, double ventasMes, int horasExtra) {
		
		double salarioTemp=0;
		
		if(TipoEmpleado.equalsIgnoreCase("vendedor")) {
			salarioTemp+=100;
		}else
			salarioTemp+=1500;
		
		if(ventasMes>=1500) {
			salarioTemp+=200;
		}else
			if(ventasMes>1000)
					salarioTemp+=100;
		
		salarioTemp+=horasExtra*20;
		
		salariobruto+=salarioTemp;
		
		return salariobruto;
	}
	
	public double calculaSalarioNeto(){
		
		double retencion;
		
			if(this.salariobruto<1000)
				this.salariobruto=this.salarioneto;
			if(this.salariobruto>1000 && this.salariobruto <1500) {
				retencion=1.6;
				this.salarioneto=this.salariobruto*retencion;
			}else {
				retencion=1.8;
				this.salarioneto=this.salariobruto*retencion;
			}
		return this.salarioneto;
	}



	@Override
	public String toString() {
		return "Trabajador: " + nombre + " En el mes " + mes + " del año " + año + " ha ganado " + salariobruto
				+ " que serían " + salarioneto;
	}

	
}
