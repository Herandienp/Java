package Generalization;

public class generalization {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount();
		sa.openaccount();
		sa.ministatement();
		sa.moneydeposit();
		sa.moneytransfer();
		sa.moneywithdraw();
		sa.closeaccount();
		sa.newFeatureFromSavingAcc();

	}
}
