//histograma
class histograma{

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
		int min=101;
		int max=0;
		
		
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
		double ran=(double)(max-min)/10;
		System.out.println("el numero minimo es: "+min+", el numero maximo es:"+max+", el rango es: "+ran);

		//buscar por intervalos
		
		for(int i=0;i<=9;i++){
			
			//busca
			for(double j=min;j<=max;j=(j+ran))
			{
				//vector resultado
				//System.out.println("j es: "+j+"  "+al[i]);
				if (al[i]>j && al[i]<=ran){
					cont[i]=cont[i]+1;
					//System.out.println("cuenta"+i+j);
				}
			System.out.println("cuenta "+i+" Total: "+al[i]);
			}
		}
		for(int i=0;i<=9;i++){
			System.out.println(cont[i]);
		}
		
	}
}