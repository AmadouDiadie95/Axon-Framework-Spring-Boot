package coulibaly.amadou.commonAPI.commands;

public class CreateAccountCommand extends BaseCommand<String> { // Id definis ici le numero de compte, d'ou le type string 
	
	private double initialBalance ;	// Designe le montant initial du cmpte
	private String currency ;	// designe la Devise (euro, dollar)

	public CreateAccountCommand(String id, double initialBalance , String currency) { 
		super(id);
		// TODO Auto-generated constructor stub
		this.initialBalance =  initialBalance ;
		this.currency = currency ;
	}
	

}
