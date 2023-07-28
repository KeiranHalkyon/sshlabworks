class Bank_Account{
	String account_holder_name;
	long account_number;
	char account_type;
	char overdraft_facility;
	double balance;
	
	Bank_Account(String name, long accn, char acctype){
		account_holder_name = name;
		account_number = accn;
		account_type = acctype;
		balance = 0.0;
		overdraft_facility = 'Y';
		if(acctype == 'S'){
			balance = 1000;
			overdraft_facility = 'N';
		}
	}
	
	double check_balance(){
		return balance;
	}
	boolean withdraw_money(double val){
	if((val > balance && overdraft_facility!='Y') || val < 0)
			return false;
		balance-=val;
		return true;
	}
	void deposit_money(double val){
		balance+=val;
	}
}

class Bank_Test{
	public static void main(String args[]){
		Bank_Account b1 = new Bank_Account("Raja Sammadar", 238562394659l, 'S');
		System.out.println("Acc name, number, type : "+b1.account_holder_name+", "+b1.account_number+", "+b1.account_type);
		System.out.println("Check balance : "+b1.check_balance());
		b1.deposit_money(500);
		System.out.println("Check balance after deposit : "+b1.check_balance());
		System.out.println("Trying to withdraw 2000 : "+b1.withdraw_money(2000));
		System.out.println("Check balance after withdraw : "+b1.check_balance());
	}
}