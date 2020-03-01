public class International extends Student {

   private boolean exchange;
   private final int CREDIT_MIN = 9;

   public International(String fName, String lName, int credit,
                        boolean exchange) {
      super(fName, lName, credit);
      this.exchange = exchange;
   }

   public boolean isValid(){
      if(super.credit >= CREDIT_MIN ) {
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int tuitionDue() {
      final int COST_PER_CREDIT = 945;
      final int INTERNATIONAL_STUDENT_FEE = 350;

      if (this.exchange){
         return FULL_TIME_FEE + INTERNATIONAL_STUDENT_FEE;
      }

      int creditsToBill;
      if(this.credit > MAX_BILLABLE_CREDITS){
         creditsToBill = MAX_BILLABLE_CREDITS;
      } else {
         creditsToBill = this.credit;
      }

      int feeToPay;
      if(this.credit >= FULL_TIME_CREDIT_MIN) {
         feeToPay = FULL_TIME_FEE + INTERNATIONAL_STUDENT_FEE;
      } else {
         feeToPay = PART_TIME_FEE + INTERNATIONAL_STUDENT_FEE;
      }

      return (creditsToBill * COST_PER_CREDIT) + feeToPay;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder(super.toString());
      String exchangeStr = "Is exchange student: " + exchange + "\n";
      String tuitionStr = "Tuition Due: " + tuitionDue();
      sb.append(exchangeStr);
      sb.append(tuitionStr);
      return sb.toString();
   }

}
