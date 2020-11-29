package punto5;

public class Principal {

	public static void main(String[] args) {
		
		int prueba[]= new int [5];
		int pruSinR[];
		int arreglo []= {1,2,3,4,5,6,2,3,4,9};
		//int arreglo1[]= {12,24,45,12,5,6,9,21,26,90}; 
		int arrFinal[]; 
		int arrSinRep[];
		
		int elemento=51;
		
		for(int i=0;i<prueba.length;i++)
		{
			prueba[i]=2*1;
		}
		
		if(Arreglo.esSinRepetidos(arreglo))
			System.out.println("el arreglo no tiene elementos repetidos");
		else
			System.out.println("el arreglo tiene elementos repetidos");
		
		System.out.println("Un arreglo formados por dos diferentes");
		//int []arreglo2=Arreglo.pegar(arreglo,arreglo1);
		
		System.out.println("\n Arreglo con insercion de elemento al final");
		arrFinal=Arreglo.agregarAlFinal(arreglo,elemento);
		Arreglo.imprimir(arrFinal);
		System.out.println("\n Arreglo original");
		Arreglo.imprimir(arreglo);
		System.out.println("\n Arreglo sin elementos repetidos");
		arrSinRep=Arreglo.sinRepetidos(arreglo);
		Arreglo.imprimir(arrSinRep);
		System.out.println("\n Arreglo invertido");
		Arreglo.invertir(arreglo);
		Arreglo.imprimir(arreglo);
		System.out.println("\n Arreglo original");
		Arreglo.imprimir(prueba);
		System.out.println("\n Arreglo sin elemento repetidos");
		pruSinR=Arreglo.sinRepetidos(prueba);
		Arreglo.imprimir(pruSinR);

	}

}
