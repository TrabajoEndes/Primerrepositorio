package ejercicio3_1_solucion;

//import java.io.*;

public class Empleado {

	String nombre;
	int mes;
	int anio;
	double salBrut;
	double salNeto;
	
	
	
	/**
	 * @param nombre
	 * @param mes
	 * @param anio
	 * @param salBrut
	 * @param salNeto
	 */
	public Empleado(String nombre, int mes, int anio, double salBrut, double salNeto) {
		this.nombre = nombre;
		this.mes = mes;
		this.anio = anio;
		this.salBrut = salBrut;
		this.salNeto = salNeto;
	}
	
	public Empleado() {
		this.nombre = "";
		this.mes = 0;
		this.anio = 0;
		this.salBrut = 0;
		this.salNeto = 0;
	}
	
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
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getSalBrut() {
		return salBrut;
	}
	public void setSalBrut(double salBrut) {
		this.salBrut = salBrut;
	}
	public double getSalNeto() {
		return salNeto;
	}
	public void setSalNeto(double salNeto) {
		this.salNeto = salNeto;
	}
			

	
}
