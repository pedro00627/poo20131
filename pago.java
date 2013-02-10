//Pedro Andrés Rodríguez Leon 625234

import java.io.*;

class pago
{

	public static int capprecio(String c){
	int p = Integer.parseInt(c);
	return p;
	}
		
	public static int caphoras(String d){
	int h = Integer.parseInt(d);
	return h;
	}
	public static void main(String[] args)
	{
		int precio=0;
		int horas=70;
		while(precio<8||horas>60){
			System.out.println("Ingrese el precio de la hora: ");
			precio=capprecio(System.console().readLine());
			System.out.println("Ingrese la cantidad de horas trabajadas: ");
			horas=caphoras(System.console().readLine());
			if (precio<8||horas>60){
				System.out.println("El precio minimo debe ser $8 y la cantidad maxima de horas es de 60");
				continue;
				}
			
			if (horas>=40){
				double total=(40*precio+((horas-40)*1.5));
				System.out.println("el precio total es: $"+total);
				}
				else{
				int total=horas*precio;
				System.out.println("el precio total es: $"+total);
				}
				
			
		}
		
	}
}