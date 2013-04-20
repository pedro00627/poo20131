//Cuenta de ahorros

/* Sofía tiene una cuenta de ahorros en la cual es consignada mensualmente su salario (S). Después de 
descontar sus gastos (G), y una cuota de manejo (C), a la cuenta le es abonado un interés mensual del 10%.
Asumiendo que la cuenta comienza vacía, escribir un programa que pida al usuario S, G, C y N; 
y calcule el saldo en el mes N. */


//definición de variables

class Ahorros
{
	public static void main(String[] args){
	
		double S=0.0;
		double G=0.0;
		double C=0.0;
		double I=0.0;
		double saldo=0;
		int n=0;

	//lectura de datos

		System.out.println("Ingrese el valor del salario");
		S= Double.parseDouble(System.console().readLine());
		System.out.println("Ingrese el valor del gasto");
		G= Double.parseDouble(System.console().readLine());
		System.out.println("Ingrese el valor de la cuota de manejo");
		C= Double.parseDouble(System.console().readLine());
		System.out.println("Ingrese el número de meses");
		n= Integer.parseInt(System.console().readLine());

	//proceso

		if(n!=0){
		
				for(int j=1; j<=n; j++){
			
					saldo=(saldo+S-G-C)*1.1;
			
				}
		
			System.out.println("El saldo en el mes "+n+" es: "+saldo);
		
		}else{
		
			System.out.println("El saldo es cero");
		
		}
	}
}