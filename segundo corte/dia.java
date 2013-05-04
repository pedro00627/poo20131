/*Escriba un programa que dada una hora(0-23), minutos (0-59), segundos (0-59), diga que porcentaje del 
 ha transcurrido. Para salir ingrese -1 en alguno de los campos*/

class dia{
	public static void main(String [] args){
		//definir valores
		int h=0;
		int m=0;
		int s=0;
		int st=0;
		double p=0.0;

		while (h!=-1||m!=-1||s!=-1){
			System.out.println("Ingrese el valor para la hora");
			h= Integer.parseInt(System.console().readLine());
			System.out.println("Ingrese el valor para los minutos");
			m= Integer.parseInt(System.console().readLine());
			System.out.println("Ingrese el valor para los segundos");
			s= Integer.parseInt(System.console().readLine());
			if(h!=-1||m!=-1||s!=-1){
				st=h*3600+m*60+s;
				p=st*100/86400;
			
			System.out.println("El porcentaje del dia es: "+p+"%");
			}
		}
	}
}