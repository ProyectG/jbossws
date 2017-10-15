package cl.proyectg.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(serviceName = "servicioTest", name = "servicioType", targetNamespace = "http://proyectg.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ws_service {
	
	public ws_service() {
		super();
	}
	
	@WebMethod
	@WebResult(name="testWS")
    public WStestResponse test(
    		@WebParam (name="test") WStestParameters parameters){
		
		WStestResponse salida = new WStestResponse();
		testResponse estructura = new testResponse(parameters);
		
		salida.setTestResponse(estructura);
		return salida;
		
	}

}
