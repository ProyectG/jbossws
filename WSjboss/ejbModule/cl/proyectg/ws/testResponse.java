package cl.proyectg.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class testResponse {

	@XmlElement(required = false, type = String.class, name="respuesta")
	private String respuesta;

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public testResponse()
	{
		super();
	}
	
	public testResponse(WStestParameters parametros)
	{
		if(Integer.parseInt(parametros.getEdad().toString()) > 30)
		{
			this.setRespuesta("Estas viejo");
		}
		else
		{
			this.setRespuesta("Estas llegando a ser viejo");
		}
		
	}
	
}
