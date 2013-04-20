//años bisiestos
/* un año bisiesto es aquel que es un múltiplo de 4, peno no de 100*/
class bisiesto{
	public static void main(String[] args){
	//ingresar dato
	int y=0;
	//comparar
	do{
		System.out.println("Ingrese un año a evaluar o -1 para salir");
		y=Integer.parseInt(System.console().readLine());
		if(y==-1){
			break;
			}else {
				if(y%4==0 && y%100!=0){
				System.out.println(y+" Es Bisiesto");
				}else{
				System.out.println(y+" No es Bisiesto");
				}
			}
		}while(y!=-1);
	}
}