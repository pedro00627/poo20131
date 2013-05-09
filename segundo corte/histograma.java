//histograma
class histograma{
	public static double Redondear(double numero){
			return Math.rint(numero*10)/10;
	}
	public static void main(String [] args){
		
		//ingresar cantidad de numeros aleatorios
		System.out.println("ingrese cuantos numeros aleatorios entre 0 y 100 desea generar, la cantidad debe ser mayor o igual que 10");
		int n= Integer.parseInt(System.console().readLine());
		
		//ejecutar el metodo validacion
		if (n<10){
			do {
				System.out.println("la cantidad de numeros debe ser mayor o igual que 10");
				n= Integer.parseInt(System.console().readLine());
			}while(n<10);
		}
		
		//generar numeros aleatorios
		int[] al= new int[n];
		for(int i=0;i<n;i++){
			int r=(int)(Math.random()*100);
			al[i]=r;
			System.out.println("->  "+al[i]);
		}
		
		//mayor y menor
		double min=101.0;
		double max=0.0;
		int [] cont=new int[10];
		for(int i=0;i<n;i++)
		{
			if (al[i]<=min){
				min=al[i];
				//System.out.println("minimo "+min);
				}
			if (al[i]>=max){
				max=al[i];
				//System.out.println("max "+max);
			}
		}
		
		//establecer intervalos
		double ran=Redondear((max-min)/10);
		System.out.println("el numero minimo es: "+min+", el numero maximo es: "+max+", el rango es: "+ran);
		//vector rangos
		double[] rang= new double[n+1];
		for(int i=0;i<=10;i++){
			rang[i]=Redondear(min+i*ran);
			//System.out.println(rang[i]);
			}
				
		//contador
		for(int i=0;i<n;i++){
			if(al[i]==rang[0]){
				cont[0]++;
				}
				for(int j=0;j<=10;j++){
					if(al[i]>rang[j]&&al[i]<=rang[j+1]){
					cont[j]++;
					}
				}
		}
		
		for(int i=0;i<10;i++){
			System.out.println("La cantidad de datos en el rango ("+rang[i]+","+rang[i+1]+") es: "+cont[i]);
		}
		
	}
}