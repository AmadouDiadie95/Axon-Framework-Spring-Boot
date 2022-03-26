package coulibaly.amadou.commonAPI.commands;

public class CreditAccountCommand extends BaseCommand<String> { // Id definis ici le numero de compte, d'ou le type string 
	
	private double amount ;	// Designe le montant du credit
	private String currency ;	// designe la Devise (euro, dollar)

	public CreditAccountCommand(String id, double amount , String currency) { 
		super(id);
		// TODO Auto-generated constructor stub
		this.amount =  amount ;
		this.currency = currency ;
	}
	

}
