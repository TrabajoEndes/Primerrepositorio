package calculadora;

import java.util.Scanner;

public class Calculadora {
	static double op1, op2, res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oper;
		Scanner sc = new Scanner(System.in);		

		
		do {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("				CALCULADORA");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("1.		  SUMA");
			System.out.println("2.		  RESTA");
			System.out.println("3.		  MULTIPLICACION");
			System.out.println("4.		  DIVISION");
			System.out.println("5.		  SALIR");
			System.out.println();
			System.out.println();
			
			System.out.println("Introduce una operacion realizar: ");
			oper = sc.nextInt();
			
			if ((oper < 5) && (oper>0)) {
				
				System.out.println("Introduce el primer operando: ");
				setOp1(sc.nextInt());
				System.out.println("Introduce el segundo operando: ");
				setOp2(sc.nextInt());
				
				switch (oper) {
						case 1:{
							setRes (suma(getOp1(), getOp2()));
							System.out.println("El resultado de la suma es: " + getRes());
							break;
						}
						case 2:{
							setRes (resta(getOp1(), getOp2()));
							System.out.println("El resultado de la resta es: " + getRes());
							break;
						}
						case 3:{
							setRes (multiplicacion(getOp1(), getOp2()));
							System.out.println("El resultado de la multiplicacion es: " + getRes());
							break;
						}
						case 4:{
							setRes (division(getOp1(), getOp2()));
							System.out.println("El resultado de la division es: " + getRes());
							break;
						}
						default: break;
				}			
			} else 
				if (oper == 5)
					System.out.println("��� Hasta la vista !!!");
				else
					System.out.println("No has introducido una opci�n v�lida");
				
		} while (oper != 5);
		sc.close();
	}
	
	static double suma (double n1, double n2) {
		return n1+n2;
	}
	static double resta (double n1, double n2) {
		return n1-n2;
	}
	static double multiplicacion (double n1, double n2) {
		return n1*n2;
	}
	static double division (double n1, double n2) {
		return n1/n2;
	}
	
	static void setOp1 (double op) {
		op1 = op;
	}
	
	static void setOp2 (double op) {
		op2 = op;
	}

	static void setRes (double r) {
		res = r;
	}
	
	static double getOp1 () {
		return op1;
	}
	
	static double getOp2 () {
		return op2;
	}
	
	static double getRes () {
		return res;
	}
}
