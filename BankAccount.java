import java.util.Scanner;

public class BankAccount {

	private String accnum; // accnum isn't used for calculations, so it can be a string
	private String owner; // same for owner
	private Double balance; // balance is used for calculations, so it will be a double.

	BankAccount(String accnum, String owner, Double balance) {
		setOwner(owner);
		setBalance(balance);
		setAccnum(accnum);
	}

	Scanner scanner = new Scanner(System.in);

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	// Display the information of the account
	@Override
	public String toString() {
		return "BankAccount [accnum=" + this.accnum + ", balance=" + this.balance + ", owner=" + this.owner + "]";
	}

	// Withdraw from the account
	public void withdraw() {
		double withdrawAmount;

		while (true) {
			withdrawAmount = Double.valueOf(scanner.nextLine());

			if (withdrawAmount <= 0) {
				System.out.println("Please enter a valid amount");
				continue;
			}

			if (getBalance() >= withdrawAmount) {
				this.balance = this.balance - withdrawAmount;
				System.out.println("New balance: " + getBalance());
				break;
			} else {
				System.out.println("Error! The withdrawal amount is higher than account balance.");
				break;
			}
		}
	}

	// Deposit to the account
	public void deposit() {
		double depositAmount;

		while (true) {
			depositAmount = Double.valueOf(scanner.nextLine());

			if (depositAmount <= 0) {
				System.out.println("Please enter a valid amount");
				continue;
			} else {
				this.balance = this.balance + depositAmount;
				break;
			}

		}
	}
}