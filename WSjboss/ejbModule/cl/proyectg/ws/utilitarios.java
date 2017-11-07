package cl.proyectg.ws;

public class utilitarios {

	/* valida numero */
	public boolean validaNumero(String str)
	{
		boolean respuesta = false;
		try {
			Double numero = Double.parseDouble(str);
			respuesta = true;
		}catch(Exception e)
		{
			respuesta = false;
		}
		return respuesta;
	}
	
	
	
}
