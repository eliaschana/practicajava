package pratico1;


public class Fraccion {
	
	   private int numerador;
	   private int denominador;
	   
	   
	   public Fraccion(int numerador, int denominador)
	    {
		   this.numerador=numerador;
		   this.denominador=denominador;
	    }
	   
	    public void imprimir()
	     {
		   System.out.println(numerador+"/"+denominador);
	     }
	    
	    public void invertirSigno()
	      {
	    	 numerador=numerador*-1;
	    	 denominador=denominador*-1;
	     }
	    
	    public void invertir()
	    {
	    	int temporal;
	    	temporal=numerador;
	    	numerador=denominador;
	    	denominador=temporal;
	    }
	    
	    
	    public double aDouble()
	    {
	    	double resul;
	    	
	    	resul=(double)numerador/denominador;
	    	
	    	return resul;
	    }
	    
	    public static Fraccion producto(Fraccion q1, Fraccion q2)
	    {
	    	Fraccion fra=new Fraccion(q1.numerador*q2.numerador,q1.denominador*q2.denominador);
	    	
	    	return fra;	
	    }
	   
	    public static Fraccion producto1(Fraccion q1, Fraccion q2)
	    {
	    	Fraccion fra=new Fraccion(q1.getNumerador()*q2.getNumerador(),q1.getDenominador()*q2.getDenominador());
	    	return fra; 	
	    }
	    static Fraccion suma1(Fraccion q1, Fraccion q2)
	    {
	    	Fraccion fra=new Fraccion(q1.getNumerador()+q2.getNumerador(),q1.getDenominador()+q2.getDenominador());
	    	return fra; 	
	    }
	    
	    static Fraccion suma(Fraccion q1, Fraccion q2)
	    {
	    	Fraccion fra=new Fraccion(q1.numerador*q2.denominador+q2.numerador*q1.denominador,q1.denominador*q2.denominador);
	    	return fra; 	
	    }
		public int getNumerador() {
			return numerador;
		}
		public void setNumerador(int numerador) {
			this.numerador = numerador;
		}
		public int getDenominador() {
			return denominador;
		}
		public void setDenominador(int denominador) {
			this.denominador = denominador;
		}
	    
	   public String toString()
	   {
		   return numerador+"/"+denominador;
	   }
}
