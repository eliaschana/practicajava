package punto3;

import punto2.Punto;

public class Circulo {
	double radio;
	Punto centro;
	
	public Circulo(double cen_x, double cen_y, double radio)
	{
	    centro=new Punto (cen_x,cen_y);
		this.radio=radio;
			
	}
     
	public void imprimir()
	{
		System.out.println("El centro del circulo es ("+centro.getX()+","+centro.getY()+") con radio "+this.radio);
	}

   public double perimetro()
   {
	   double perimetro;
	   perimetro=2*Math.PI*radio;
	   return perimetro;
   }
   
   public double superficie()
   {
	   double superficie;
	   superficie=Math.PI*Math.pow(radio,2);
	   return superficie;
   }
   
   public void escalar(double factor)
   {
	   radio=radio+factor;
   }
   
   
   void desplazar(double desp_x, double desp_y)
   {
	   centro.setX(centro.getX()+desp_x);
	   centro.setY(centro.getY()+desp_y);
   }
   
   static double distancia(Circulo c1, Circulo c2)
   {
	   double dispunto=Punto.distancia(c1.getCentro(), c2.getCentro());
	  
		   return dispunto-(c1.getRadio()+c2.getRadio());
   }
   
   static boolean seTocan(Circulo c1, Circulo c2)
   {
	   double dispunto=distancia(c1,c2);
	   if(dispunto<(c1.getRadio()+c2.getRadio()))
			   return true;
	      else
		       return false;
	   
   }
   
   public boolean loContiene(Circulo otro)
   {
	   double dispunto=distancia(this,otro);
	   if(this.radio >=(dispunto+otro.getRadio()))
			    return true;
		   else 
			   return false;
	   
   }
   
   public String toString()
   {
   return "circulo con centro ("+centro.getX()+","+centro.getY()+") y radio "+radio;
   }

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

public Punto getCentro() {
	return centro;
}

public void setCentro(Punto centro) {
	this.centro = centro;
}
}
