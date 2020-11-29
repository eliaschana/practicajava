package punto3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese coordenada X:");
		int x=entrada.nextInt();
		System.out.println("Ingrese coordenada Y:");
		int y=entrada.nextInt();
		System.out.println("Ingrese radio:");
		int r=entrada.nextInt();
		
		Circulo c1= new Circulo(x,y,r);
        Circulo c2=new Circulo(3,1,6);
		Circulo c3= new Circulo(6,3,2);
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		System.out.println("El perimetro del circulo 1 es:"+c1.perimetro());
		System.out.println("La superficie del circulo 1 es:"+c1.superficie());
		System.out.println("El perimetro del circulo 2 es:"+c2.perimetro());
		System.out.println("La superficie del circulo 2 es:"+c2.superficie());
		System.out.println("El perimetro del circulo 3 es:"+c3.perimetro());
		System.out.println("La superficie del circulo 3 es:"+c3.superficie());
		
		
		 double distancia=Circulo.distancia(c1, c2);
		  if(distancia>0)
				System.out.println("La distancia minima entre los circulo es "+distancia);
			else
				System.out.println("No existe distancia minima porque se tocan");
			
		if(Circulo.seTocan(c1, c2))
			System.out.println("Los circulos se tocan");
		else
			System.out.println("Los circulos no se tocan");
		
	  if(c1.loContiene(c2))
		  System.out.println("El "+c1+" contiene al "+c2);
	  else 
		  System.out.println("El "+c1+" no contiene al "+c2);
	  
	  double distancia1=Circulo.distancia(c2, c3);
	  if(distancia1>0)
			System.out.println("La distancia minima entre los circulo es "+distancia1);
		else
			System.out.println("No existe distancia minima porque se tocan");
		
		if(Circulo.seTocan(c2, c3))
			System.out.println("Los circulos se tocan");
		else
			System.out.println("Los circulos no se tocan");
		
	  if(c2.loContiene(c3))
		  System.out.println("El "+c2+" contiene al "+c3);
	  else 
		  System.out.println("El "+c2+" no contiene al "+c3);
	  
	  c2.desplazar(2, 1);
	  c2.imprimir();
	  
	  entrada.close();
	}

}
