package mx.com.mercadolibre.xmen.ws.rest.resource.restfull;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.com.mercadolibre.xmen.ws.rest.resource.dto.DNASequence;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "mutant")
public class Mutant {

	@XmlElement(name = "dnaSequence")
	private DNASequence dnaSequence;

	@XmlElement(name = "isMutant")
	private boolean isMutant;

}
