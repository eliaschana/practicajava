package pratico1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner entrada= new Scanner(System.in);
	     System.out.println("Ingrese denominador");
		    int numerador=entrada.nextInt();
		 System.out.println("Ingrese denominador");
		    int denominador=entrada.nextInt();
		

		Fraccion frac =new Fraccion(numerador,denominador);
		Fraccion frac2 =new Fraccion(3,5);
		Fraccion frac3=new Fraccion(-2,5);
		frac.imprimir();
		frac2.imprimir();
		frac3.imprimir();
		frac3.invertirSigno();
		frac3.invertir();
	    System.out.println("El valor dobles es:"+frac.aDouble());
	    System.out.println("el producto es: "+Fraccion.producto(frac,frac2));
	    System.out.println("la suma es: "+Fraccion.suma(frac2, frac));
	    System.out.println("el producto es: "+Fraccion.producto1(frac,frac2));
	    System.out.println("la suma es: "+Fraccion.suma1(frac2, frac));
       entrada.close();
	}

}
