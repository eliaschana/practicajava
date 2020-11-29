package punto8;
/*
h) Escribir el metodo de clase static Conjunto resta(Conjunto c1, Conjunto c2) que
calcula c1 􀀀 c2.
i) Escribir el metodo de instancia void restar(Conjunto c) que quita del conjunto todos
los elementos que esten en el conjunto parametro.
 */

public class Conjunto {
	private int[] elementos;
	private int cantidad;
	private int tamanio=2;
	public Conjunto()
	{
		elementos=new int[tamanio];
		cantidad=0;
	}
	
	public void agregar(int n)
	{  
		
		if(!pertenece(n))
		{
		 if(conjlleno())
		 {
			redimension();
		    elementos[cantidad++]=n;
		 }
		 else
			 elementos[cantidad++]=n;
		}
	}
	
	public void redimension() 
	{
		 int[]nuElem=new int [elementos.length*tamanio];
		
		 for(int i=0;i<cantidad;i++)
		 {
			 nuElem[i]=elementos[i];
		 }
		 elementos=nuElem;
	}
	
	public void quitar(int n) 
	{
		int i=0;
		int j=0;
		if(pertenece(n))
		{
		  if(cantidad==1)
			  elementos[--cantidad]=0;
		  else
		  {
			 do 
			 {
				if(elementos[i]==n)
				   i++;
				 else {
					   elementos[j++]=elementos[i];
					   i++;
					 }
				}while(i<cantidad);
					 elementos[--cantidad]=0;
				}
		 }
	}
	
   static Conjunto union(Conjunto c1, Conjunto c2)
	{
	   Conjunto union= new Conjunto();
	  
	   for(int i=0;i<c1.cantidad;i++)
	   {
		   union.agregar(c1.elementos[i]);
	   }
	   for(int i=0;i<c2.cantidad;i++)
	   {
		   union.agregar(c2.elementos[i]);
	   }
	   return union;
	}
   
   static Conjunto interseccion(Conjunto c1, Conjunto c2)
   {
	   Conjunto inter=new Conjunto();
	   
		   for(int i=0;i<c1.cantidad;i++)
		   {
			  for(int j=0;j<c2.cantidad;j++)
			  {
			   if(c1.elementos[i]==c2.elementos[j])
				   inter.agregar(c1.elementos[i]);
			  }
		   }
	
	   return inter;
   }
   
   static Conjunto resta(Conjunto c1, Conjunto c2)
   {
	   Conjunto resta=new Conjunto();
	   
	   for(int i=0;i<c1.cantidad;i++)
	   {
		   if(!c2.pertenece(c1.elementos[i]))
		   {
			   resta.agregar(c1.elementos[i]);
		   }
			   
	   }
	   return resta;
	    
   }
   
    
	
   public void restar(Conjunto c)
   {
	   for(int i=0;i<c.cantidad;i++)
	   {
		   if(this.pertenece(c.elementos[i]))
		      this.quitar(c.elementos[i]);
	   }
   }
   
	public boolean conjlleno()
	{

		if (this.cantidad==elementos.length)
		{
			return true;
		}
		else
			return false;
			
	}
	public boolean pertenece(int n)
	{
		for(int i=0;i<this.cantidad;i++)
		{
			if(this.elementos[i]==n)
				return true;
		}
		return false;
	}
	
	public void imprimir()
	{       
		for(int i=0;i<this.cantidad;i++)
			System.out.print(this.elementos[i]+" ");
		
	}
	
}

	