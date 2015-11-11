package mx.com.mercadolibre.xmen.ws.rest.resource.restless;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "dnaSequenceResponse")
public class DNASequenceResponse {

	@XmlElement(name = "isMutant")
	private boolean isMutant;

}
