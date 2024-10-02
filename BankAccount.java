package static_1;

public class BankAccount {
	private int accNo;
	private double balance;
	private static int idNum = 1;

	public BankAccount() {
		accNo = idNum++;
		balance = 0;
	}

	public BankAccount(double balance) {
		this.accNo = idNum++;
		this.balance = balance;
	}

	public static int getIdNum() {
		return idNum;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {

//		System.out.println(getIdNum());
//		System.out.println(BankAccount.getIdNum());
//		
		BankAccount bankaccount1 = new BankAccount();
		System.out.println(bankaccount1.getIdNum());

		BankAccount bankaccount2 = new BankAccount();
		System.out.println(bankaccount2);

		BankAccount bankaccount3 = new BankAccount();
		System.out.println(bankaccount3);

	}

}
