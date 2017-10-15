package cl.proyectg.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WsTest")
public class WStestResponse implements Serializable{

		
		@XmlElement(required = true, type = testResponse.class, name="test")
		private testResponse testResponse;
		
		

		public testResponse getTestResponse() {
			return testResponse;
		}



		public void setTestResponse(testResponse testResponse) {
			this.testResponse = testResponse;
		}

	}
