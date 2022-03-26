package coulibaly.amadou.commonAPI.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Getter;

// On cree une classe abstraite generic
public abstract class BaseCommand<T> {
	
	@TargetAggregateIdentifier	// indique l'identifiant de l'aggregat sur laquelle faire la commande
	@Getter private T id ; // Juste getter car l'object est immuable (non changeable apres), valable pour tous les att des commandes

	public BaseCommand(T id) {
		this.id = id ;
	} 

	
}
