package atmbank;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImple impl = new AtmOperationImple();
		Scanner sc = new Scanner(System.in);
		int atmnumber = 123456;
		int atmpin = 123;
		System.out.println("Welcome to ATM Machine");
		System.out.println("Enter the ATM number");
		int atmnum2 = sc.nextInt();
		System.out.println("Enter the ATM Pin");
		int atmpin2 = sc.nextInt();
		if(atmnumber == atmnum2 && atmpin == atmpin2) {
			while(true) {

				System.out.println("1.viewAvailable\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMinistatement\n 5.exit");
				int ch =sc.nextInt();
				if(ch==1) {
					impl.viewBaalance();
					
				}else if(ch==2) {
					System.out.println("Enter the amount to withdraw");
					double withdrawamount = sc.nextDouble();
					impl.withdrawAmount(withdrawamount);
					
				}else if(ch==3) {
					System.out.println("Enter the amount to deposit");
					double depositAmount=sc.nextDouble();
					impl.depositAmount(depositAmount);
				}else if(ch==4) {
					impl.viewMiniStatement();
				}else if(ch==5) {
					System.out.println("Collect your ATM Card Thank you");
					System.exit(status);
				}
				
			else {
				System.out.println("Incorrect ATM NUMBER OR PIN");
			}
			}
		}
		
		
	}
	

}
