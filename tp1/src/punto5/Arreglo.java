package punto5;


public class Arreglo {
	
    
	public static boolean esSinRepetidos(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
				return false;
			} 
		}
		  return  true ;
	
	}
	public static int [] pegar(int[] arr,int [] arr2)
	{    
		 int arrePega[]=new int[arr.length+arr2.length];
		 int i;
		 for(i=0;i<arr.length;i++)
		 {
			 arrePega[i]=arr[i];
		 }
		 
		 for(int j=0;j<arr2.length;j++)
		 {
			 arrePega[i]=arr[j];
			 i++;
		 }
		
		return arrePega;
	}
	public static int [] agregarAlFinal(int[] arr, int elem)
	{
		   int arreglo[]= new int[arr.length+1];
		   int i;
		   for(i=0;i<arr.length;i++)
		   {
			   arreglo[i]=arr[i];
		   }
		   arreglo[i]=elem;
		   
            return arreglo;		   
		 
	}
	
	public static int [] sinRepetidos(int[] arr)
	{
		int arreglo[]=new int[arr.length];
		int arrSinRe[];
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			 if(agregarArr(arreglo,arr[i])==false)
			 {
				 arreglo[k]=arr[i];
				 k++;
			 }
		}
		arrSinRe=new int[k];
		for(int i=0;i<arrSinRe.length;i++)
		{
			  arrSinRe[i]=arreglo[i];
		}
		return arrSinRe;
	}
	
	public static boolean agregarArr(int[]arr,int elemento)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==elemento)
				return true;
		}
		return false;
	}
	
	public static void invertir(int[] arr)
	{
		int aux;
		
		for(int i=0;i<arr.length/2;i++)
		{
			aux=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=aux;
		}
			
	}
	
	public static void imprimir(int[] arr)
	{
		
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("["+arr[i]+"]");
	}
	}
}
