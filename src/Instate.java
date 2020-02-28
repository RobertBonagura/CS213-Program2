public class Instate extends Student
{

   private int funding;
   public Instate(String fname, String lname, int credit, int funding)
   {
      super(fname, lname, credit);
      this.funding = funding;
   }
   public int tuitionDue(){

      final int COST_PER_CREDIT = 433;
           
      int creditsToBill;
      if(getCredit() > MAX_BILLABLE_CREDITS){
         creditsToBill = MAX_BILLABLE_CREDITS;
      } else {
         creditsToBill = getCredit();
      }
      
      int feeToPay;
      if(getCredit() >= FULL_TIME_CREDIT_MIN){
         feeToPay = FULL_TIME_FEE;
      } else {
         feeToPay = PART_TIME_FEE;
      }

      if (getCredit() < FULL_TIME_CREDIT_MIN) {
         this.funding = 0;
      }

      return (creditsToBill * COST_PER_CREDIT) + feeToPay - funding;
   }
}


