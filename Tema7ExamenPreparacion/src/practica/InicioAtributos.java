package practica;

public class InicioAtributos {
	//public es para las clases externas
	public String nombre="";
	
	/*si el atributo o metodo no tiene nada,
	se considera package y se puede usar en clases de un mismo paquete*/
	int edad=0;
	
	/*si es private, el atributo solo se puede usar en la clase donde está*/
	private int id=0;
	
	//los final tienen un valor que no se puede modificar
	final String DNI="abcdefg";
	
}
