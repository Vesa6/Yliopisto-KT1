import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Enter the information for the account
		System.out.println("Setup account number: ");
		String accnum = scanner.nextLine();
		System.out.println("Setup account owner: ");
		String owner = scanner.nextLine();
		System.out.println("Setup balance: ");
		Double balance = Double.valueOf(scanner.nextLine());

		// Create a reference to the class BankAccount
		BankAccount account;
		account = new BankAccount(accnum, owner, balance);

		int selection;

		// This is used as a loop
		while (true) {
			System.out.println("Select operation:");
			System.out.println("**********************");
			System.out.println("1. Show account information");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");

			selection = Integer.valueOf(scanner.nextLine());

			switch (selection) {

				case 1:
					System.out.println(account.toString());
					continue;

				case 2:
					System.out.println("Input deposit amount: ");
					account.deposit();
					continue;

				case 3:
					System.out.println("Input withdrawal amount: ");
					account.withdraw();
					continue;

				case 4:
					System.out.println("Thank you, bye!");
					System.exit(0);
					scanner.close();
			}
		}
	}

}