package coulibaly.amadou.commands.controllers;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coulibaly.amadou.commonAPI.commands.CreateAccountCommand;
import coulibaly.amadou.commonAPI.dtos.CreateAccountRequestDTO;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/commands/account")
@AllArgsConstructor // permet d'injecter auto a chaque fois qu'il trve une interface a la place de @Autowired sur chaque attribut 
public class AccountCommandController {
	
	private CommandGateway commandGateway ; // Normalement ici on fait @Autowired mais @AllArgsContructors en haut permet d'injecter auto a chaque fois qu'il trve une interface
	
	@PostMapping(path = "/create")
	public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequestDTO request) {	// La methode va donc retournez la commande meme en entier 
		CompletableFuture<String> commandResponse = commandGateway.send(new CreateAccountCommand( // commandResponse recoie le ID du compte de type string
				UUID.randomUUID().toString() ,		// Genere un string aleatoire comme ID du compte 
				request.getInitialBalance(), 
				request.getCurrency()
				)) ;
		return commandResponse ;
	}
}
