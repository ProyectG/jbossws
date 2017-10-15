package cl.proyectg.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class WStestParameters {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@XmlElement(required = false, type = String.class, name="nombre")
	private String nombre;
	
	@XmlElement(required=false, type=String.class, name="apellido")
	private String apellido;
	
	@XmlElement(required=false, type=String.class, name="Edad")
	private String edad;
	
	public WStestParameters()
	{
		super();
	}

}
