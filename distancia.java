//hecho por Pedro Andrés Rodríguez León 625234

import java.io.*;
import java.lang.Math;

class distancia 
	{ 
	public static void main(String[] args) { 
	
		//inicialización de variables y asignacion de valores
		System.out.println("ingrese el valor de la distancia inicial");
		String s=System.console().readLine();
		double xi = Double.parseDouble(s); //inicialización de la variable distancia inicial
		System.out.println("ingrese el valor de la aceleracion");
		s=System.console().readLine();
		double a = Double.parseDouble(s); //aceleración
		System.out.println("ingrese el valor del tiempo");
		s=System.console().readLine();
		double t = Double.parseDouble(s);//variable tiempo
		System.out.println("ingrese el valor de la velocidad inicial");
		s=System.console().readLine();
		double vi = Double.parseDouble(s); //velocidad inicial
		
		// operaciones 
				
		double x = 0.5*a*(Math.pow(t, 2))+vi*t+xi; //fórmula de distacia con respecto al tiempo
		
		//impresion del resultado
		
		System.out.println ("la distacia recorrida es: "+x); //muestra el resultado de la función


	} 
}