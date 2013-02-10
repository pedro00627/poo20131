//Pedro Andrés Rodríguez Leon 625234

import java.io.*;

class pago
{

//metodo ingresar precio
public static int capprecio(String c)
{
	int p = Integer.parseInt(c);
	return p;
	}
	
//metodo ingresar horas
public static int caphoras(String d){
	int h = Integer.parseInt(d);
	return h;
	}
	
//metodo main
public static void main(String[] args){
	//inicializacion de variables
	int precio=0;
	int horas=70;
	
	//ciclo para repetir los metodos en caso de introducir mal los valores
	while(precio<8||horas>60){
		System.out.println("Ingrese el precio de la hora: ");
		
		//ingresar valor del metodo capprecio
		precio=capprecio(System.console().readLine());
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
			
		//ingresar valor del metodo caphoras
		horas=caphoras(System.console().readLine());
			
		//condicion para precio y cantidad de horas
		if (precio<8||horas>60){
			System.out.println("El precio minimo debe ser $8 y la cantidad maxima de horas es de 60");
			continue;
			}
		
		//condicion para el calculo de horas
		if (horas>=40){
			//menos de 40 horas
			double total=(40*precio+((horas-40)*1.5));
			System.out.println("el precio total es: $"+total);
			}
			else
			{
				//mas de 40 horas
				int total=horas*precio;
				System.out.println("el precio total es: $"+total);
				}
				
			}
				
		}
