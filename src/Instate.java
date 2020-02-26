public class Instate extends Student
{
	private final int COST_PER_CREDIT = 433;
	private int funding;
   public Instate(String fname, String lname, int credit, int funding)
   {
      super(fname, lname, credit);
		this.funding = funding;
   }
	public int tuitionDue(){
			  
		int creditsToBill;
		if(credits > MAX_BILLABLE_CREDITS){
				  creditsToBill = MAX_BILLABLE_CREDITS;
		} else {
				  creditsToBill = credits;
		}
		
		int feeToPayÎ;
		if(credits >= FULL_TIME_CREDIT_MIN){
				  feeToPay = FULL_TIME_FEE;
		} else {
				  feeToPay = PART_TIME_FEE;
		}

		return (creditsToBill * COST_PER_CREDIT) + feeToPay - funding;
	}
}


