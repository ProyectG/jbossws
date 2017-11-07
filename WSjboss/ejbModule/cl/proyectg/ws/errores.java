package cl.proyectg.ws;

import javax.xml.bind.annotation.XmlElement;

public class errores {
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlElement(required=false, type=String.class, name="codigo")
	private String codigo;
	
	@XmlElement(required=false, type=String.class, name="descripcion")
	private String descripcion;
	
	
	public errores()
	{
		super();
	}
	
	public errores(WStestParameters param)
	{
		utilitarios util = new utilitarios();
		if(!util.validaNumero(param.getEdad()))
		{
			this.setCodigo("1");
			this.setDescripcion("Error, la edad debe ser numerica");
		}
		
		if(!param.getApellido().matches("") || !param.getApellido().matches(""))
		{

			this.setCodigo("2");
			this.setDescripcion("Error, El nombre o apellido no son alfanumericos");
		}
		
	}
}
