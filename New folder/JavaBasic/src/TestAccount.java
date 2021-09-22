
public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac= new Account(12000,10,2);
		ac.int_amount();
		ac.getInterestAmount();
		ac.display();
		ac.setAccount(2000,10,2);
		ac.int_amount();
		ac.getInterestAmount();
		ac.display();
		ac.setbal(10000);
		ac.int_amount();
		ac.getInterestAmount();
		ac.display();
	

	}

}
