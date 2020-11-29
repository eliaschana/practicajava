package punto7;

import punto4.Persona;

/*
 * 

a) Escribir el constuctor Agenda(int tamanio) que inicializa contactos y telefonos con
d) Escribir el metodo de instancia boolean pertenece(Persona contacto) que devuelve
true si el contacto esta en la Agenda o false en caso contrario.
e) Escribir el metodo de instancia String dameTelefono(Persona contacto). Usar el
metodo mismaPersona del ejercicio 4. (REQUIERE: pertenece(contacto)==true)
 */
public class Agenda {
	
	Persona[] contactos;
	String[] telefonos;
	
	public Agenda(int tamanio)
	{
		contactos=new Persona[tamanio];
		telefonos=new String[tamanio];
	}
	
	 public void guardar(Persona contacto,String telefono)
	 {
		 boolean cargo=true;
		 for(int i=0;i<contactos.length&&cargo;i++)
		 {
			 if(contactos[i]==null)
			 {
				 contactos[i]=contacto;
				 telefonos[i]=telefono;
				 cargo=false;
			 }
				 
		 }
	 }
	 
	public void eliminar(Persona contacto)
	{
		boolean elimino=true;
		for(int i=0;i<contactos.length&&elimino;i++)
		{
			if(contactos[i].mismaPersona(contacto))
			{
				contactos[i]=null;
				telefonos[i]=null;
				elimino=false;
			}
		}
	}

	public  boolean pertenece(Persona contacto)
	 {
		for(int i=0; i<contactos.length;i++)
		{
			if(contactos[i].mismaPersona(contacto))
				return true;
		}
		 return false;
	 }
	
	public String dameTelefono(Persona contacto)
	{
		String dameTel=null;
		for(int i=0; i<contactos.length;i++)
		{
			if(contactos[i].mismaPersona(contacto))
				
				return dameTel=telefonos[i];
		}
		 return dameTel;
	
	}
	
	public void imprimir()
	{
		for(int i=0;i< contactos.length;i++)
		{
			System.out.println("contacto:"+contactos[i]+" numero de telefono:"+telefonos[i]);
		}
	}
	
	
}
