package punto7;

import punto4.Fecha;
import punto4.Persona;

public class Principal {

	public static void main(String[] args) {
		int tam=4;
		Fecha fecha=new Fecha(20,3,2012);
		Fecha fecha2=new Fecha(15,5,1992);
		Fecha fecha3=new Fecha(2,1,2007);
		Fecha fecha4=new Fecha(9,9,2006);
		Fecha fecha5=new Fecha(9,9,2008);
		Persona p= new Persona("juan",fecha);
		Persona p2= new Persona("maria",fecha2);
		Persona p3= new Persona("pedro",fecha3);
		Persona p4= new Persona("ana",fecha4);
		Persona p5= new Persona("mar",fecha5);
		
		Agenda agendas =new Agenda(tam);
		
		agendas.guardar(p, "11122233");
		agendas.guardar(p2, "11122231");
		agendas.guardar(p3, "11122232");
		agendas.guardar(p4, "11122234");
		
		
		if(agendas.pertenece(p5))
			System.out.println(p5+" pertenece en la agenda ");
		else
			System.out.println(p5+" no pertenece en la agenda ");
		System.out.println(p2+" tiene el siguiente numero de telefono:"+agendas.dameTelefono(p2));
		agendas.eliminar(p);
	    agendas.imprimir();

	}

}
