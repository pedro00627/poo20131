

//histograma
class histograma{
	//metodo validacion
	static int validacion(int n){
		if (n<10){
			do {
				System.out.println("la cantidad de numeros debe ser mayor o igual que 10");
				n= Integer.parseInt(System.console().readLine());
			}while(n<10);
		}
		return n;
	}
	
	//metodo aleatorio
	static double aleatorio(){
		double r=(int)(Math.random()*100);
		return r;
	}
	
	//vectorizar aleatorio
	
	
	public static void main(String [] args){
		//ingresar cantidad de numeros aleatorios
		System.out.println("ingrese cuantos numeros aleatorios desea generar, la cantidad debe ser mayor o igual que 10");
		int n= Integer.parseInt(System.console().readLine());
		//ejecutar el metodo validacion
		validacion(n);
		double q = aleatorio();
		System.out.println(q);
		
	}
}