package atmbank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImple implements AtmOperationInterf{
	Atm atm=new Atm(); 
	Map<Double,String> miniset = new HashMap<>();

	@Override
	public void viewBaalance() {
		System.out.println("AvaliableBalance:"+atm.getBalance());
		
		
		
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount %500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("Collect the cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				miniset.put(withdrawAmount,"Amount withdrawn");
				viewBaalance();
				
				
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}else {
			System.out.println("Enter the amount in terms of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("depositAmount is :"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		miniset.put(depositAmount, "Deposited Amount Succesfully");
		viewBaalance();
		
	}

	@Override
	public void viewMiniStatement() {
		
		Set<Double> set =miniset.keySet();
		for(Double d:set) {
			System.out.println(d+"="+miniset);
		}
		
		
	}

}
