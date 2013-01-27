import java.lang.Math;

class distancia 
	{ 
	public static void main(String[] args) { 
		double xi = 0.0; 
		double a = 9.8; 
		double t = 10.0; 
		double vi = 2.0; 
		double x = 0.5*a*(Math.pow(t, 2))+vi*t+xi;
		System.out.println ("la distacia recorrida es: "+x);
		

	} 
}
