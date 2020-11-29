package punto4;
/*
 */

public class Persona {
	
	private String nombre;
	private Fecha fecha_nac;
	
	public Persona(String nombre, Fecha f_nac)
	{
		this.nombre=nombre;
		fecha_nac=f_nac;
	}
	
	public  boolean masJovenQue(Persona otro)
	{
		
		 if((this.getFecha_nac().getAnio()<otro.getFecha_nac().getAnio()))
		      return true;
		  else if((this.getFecha_nac().getAnio()==otro.getFecha_nac().getAnio()))
			     if(this.getFecha_nac().getMes()<otro.getFecha_nac().getMes())
				      return true;
			       else if(this.getFecha_nac().getMes()==otro.getFecha_nac().getMes())
		                 if(this.getFecha_nac().getDia()<otro.getFecha_nac().getDia())
			                return true;
		               else 
		        	       return false;
			 return false;
			       	  	   

	 }
	
	
	public boolean tocayo(Persona otro)
	{  
		
		if(nombre.equalsIgnoreCase(getNombre())) //puede ser equals pero no diferencia mayu y min
		  return true;
		else
		  return false;
	}
	
	public boolean mismaPersona(Persona otro)
	{
		if(this.tocayo(otro))
			if(this.getFecha_nac()==otro.getFecha_nac())
				return true;
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Fecha fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public String toString()
	{
		return nombre+" con fecha de nacimiento "+fecha_nac.getDia()+"/"+fecha_nac.getMes()+"/"+fecha_nac.getAnio();
	}
	
	public static Persona masJoven(Persona[] grupo)
	{
		Persona persJoven;
		persJoven=grupo[0];
		for(int i=1;i<grupo.length;i++)
		{
			if(grupo[i].masJovenQue(persJoven))
			{
				persJoven=grupo[i];

			}	
		}
		return persJoven;
	}
	
	static Persona buscar(Persona[] grupo, String nombre)
	{
		Persona persona=null;
		for(int i=0;i<grupo.length;i++)
		{
			if(grupo[i].getNombre().equalsIgnoreCase(nombre))
				return grupo[i];
		}
		return persona;
	}
}
