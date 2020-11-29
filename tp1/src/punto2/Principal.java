package punto2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("ingrese la cordenada x:");
		int x=entrada.nextInt();
		System.out.print("ingrese la cordenada y:");
		int y=entrada.nextInt();
		
		Punto p= new Punto();
		Punto q= new Punto(x,y);
		
		p.imprimir();
		q.imprimir();
		p.setX(3);
		p.setY(2);
		p.imprimir();
		p.desplazar(1, 2);
		System.out.println(Punto.distancia(p,q));
		
		entrada.close();
		
	}

}
