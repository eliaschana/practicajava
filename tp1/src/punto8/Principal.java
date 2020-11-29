package punto8;

public class Principal {

	public static void main(String[] args) {
		
		Conjunto elemntos=new Conjunto();
		Conjunto elemntos2=new Conjunto();
		Conjunto elemntos3;
		Conjunto elemntos4;
		Conjunto elemntos5;
		
	
		
		
		elemntos.agregar(5);
		elemntos.agregar(4);
		elemntos.agregar(3);
		elemntos.agregar(2);
		elemntos.agregar(9);
		elemntos.agregar(10);
		elemntos2.agregar(10);
		elemntos2.agregar(12);
		elemntos2.agregar(13);
		elemntos2.agregar(23);
		elemntos2.agregar(16);
		System.out.println("conjunto 1");
		elemntos.imprimir();
		System.out.println();
		System.out.println("conjunto 2");
		elemntos2.imprimir();
		System.out.println();
		System.out.println("conjunto union elen y elen2 ");
		elemntos3=Conjunto.union(elemntos, elemntos2);
		elemntos3.quitar(10);
		elemntos3.imprimir();
		System.out.println();
		System.out.println("conjunto interseccion eln2 y eln3");
		elemntos4=Conjunto.interseccion(elemntos2, elemntos3);
		elemntos4.imprimir();
		System.out.println();
		System.out.println("conjunto resta");
		elemntos5=Conjunto.resta(elemntos3, elemntos4);
		elemntos5.imprimir();
		System.out.println();
		System.out.println("conjunto resta this");
		elemntos2.restar(elemntos);
		elemntos.imprimir();
		elemntos.quitar(4);
		System.out.println();
		elemntos.imprimir();
	}

}
