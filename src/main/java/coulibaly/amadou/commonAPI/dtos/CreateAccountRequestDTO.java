package coulibaly.amadou.commonAPI.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CreateAccountRequestDTO {		// Les DTO Sont les Object qui vont persister dans la DB 

	private double initialBalance ;	// Designe le montant initial du cmpte
	private String currency ;	// designe la Devise (euro, dollar)
	
}
