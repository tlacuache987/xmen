package mx.com.mercadolibre.xmen.ws.rest.resource.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "dnaSequence")
public class DNASequence {

	@XmlElement(name = "sequences")
	private List<String> sequences;

}
