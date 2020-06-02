package Generalization;

public class SavingAccount implements account {

	public void newFeatureFromSavingAcc() {
		System.out.println("Running newFeatureFromSavingAcc From saving Accout");
	}
	
	public void openaccount() {
		System.out.println("Running Open Account From saving Account");

	}

	public void moneytransfer() {
		System.out.println("Running Money Transfer From saving Account");
	}

	public void moneywithdraw() {
		System.out.println("Running Money Withdrawal From saving Account");

	}

	public void moneydeposit() {
		System.out.println("Running Money Deposits From saving Account");

	}

	public void ministatement() {
		System.out.println("Running Ministatement From saving Account");

	}

	public void closeaccount() {
		System.out.println("Running Close Account From saving Account");

	}
}
