//histograma
class histograma{


	//vectorizar aleatorio
	
	public static void main(String [] args){
		//ingresar cantidad de numeros aleatorios
		System.out.println("ingrese cuantos numeros aleatorios desea generar, la cantidad debe ser mayor o igual que 10");
		int n= Integer.parseInt(System.console().readLine());
		//ejecutar el metodo validacion
		
		if (n<10){
			do {
				System.out.println("la cantidad de numeros debe ser mayor o igual que 10");
				n= Integer.parseInt(System.console().readLine());
			}while(n<10);
		}
		
		int[] al= new int[n];
		for(int i=0;i<n;i++){
			int r=(int)(Math.random()*100);
			al[i]=r;
			System.out.println(al[i]);
		}
		

	}
	
	

}