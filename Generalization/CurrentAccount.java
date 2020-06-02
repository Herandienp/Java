package Generalization;

public class CurrentAccount implements account {

	public void newFeatureFromCurrentAcc() {
		System.out.println("Running newFeatureFromCurrentAcc From Current Accout");
	}
	
	public void openaccount() {
		System.out.println("Running Open Account From Current Accout");

	}

	public void moneytransfer() {
		System.out.println("Running Money Transfer From Current Account");
	}

	public void moneywithdraw() {
		System.out.println("Running Money Withdrawal From Current Account");

	}

	public void moneydeposit() {
		System.out.println("Running Money Deposits From Current Account");

	}

	public void ministatement() {
		System.out.println("Running Ministatement From Current Account");

	}

	public void closeaccount() {
		System.out.println("Running Close Account From Current Account");

	}

}
