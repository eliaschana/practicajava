package punto2;

public class Punto {
  private double x;
  private double y;
  
  public Punto()
  {
	  x=y=0;
  }
  public Punto (double x, double y)
  {
	  this.x=x;
	  this.y=y;
  }
  
  public void imprimir()
  {
	  System.out.println("El punto:"+x+","+y);
  }
  
  public void desplazar(double dx, double dy)
  {
	  double x_=x,y_=y;
	 x=x+dx;
	 y=y+dy;
	 System.out.println("El punto:"+x_+","+y_+" con el desplazo se ubica en el punto:"+x+","+y);
  }
  
  public static double distancia (Punto p1,Punto p2)
  {
	  double distancia;
	        distancia=Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
	  return distancia;  
  }
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
  
  
}

