import java.io.ObjectInputStream.GetField;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import excessoes.Tratamento;

public class Program {

	public static void main(String[] args) throws Tratamento {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	try {	System.out.println("Enter Account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.next();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);

		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println("New balance: " + account);
	}
	catch (Tratamento e) {
		System.out.println("Withdraw error: " + e.getMessage());
			
		}
	
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		
		}
		
		
		
		sc.close();
	}

}
