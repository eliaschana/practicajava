package punto4;

public class Principal {

	public static void main(String[] args) {
		String nombrePar="maria";
		Fecha fech= new Fecha(1,2,1990);
		Persona p=new Persona("juan",fech);
		
		Fecha fech1= new Fecha(1,2,1991);
		Persona p1=new Persona("Juan",fech1);
		
		Fecha fech2= new Fecha(1,7,1989);
		Persona p2=new Persona("pedro",fech2);
		
		Fecha fech3= new Fecha(1,4,2000);
		Persona p3=new Persona("maria",fech3);
		
		Persona arrPersona[]= new Persona[]{p,p1,p2,p3};
		
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p3.masJovenQue(p2));
		if(p3.masJovenQue(p2))
			System.out.println(p3.getNombre()+" es mas joven que "+p2.getNombre());
		else
			System.out.println(p2.getNombre()+" es mas joven que "+p3.getNombre());
		
		if(p.tocayo(p1))
			System.out.println("Son tocayos y tiene por nombre:"+p.getNombre());
		else
		    System.out.println("No son tocayos uno se llama "+p.getNombre()+" y el otro "+p1.getNombre());
			
		if(p.mismaPersona(p))
			System.out.println("Es la misma persona");
		else
			System.out.println("son personas distintas");
		
		System.out.println("La persona mas joven del grupo de persona es "+Persona.masJoven(arrPersona));
		
		if(Persona.buscar(arrPersona,nombrePar)!=null)
		{
			System.out.println("La persona fue encontrada y es "+Persona.buscar(arrPersona,nombrePar));
		}
	}
}
