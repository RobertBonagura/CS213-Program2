public class Instate extends Student
{

   private int funding;
   public Instate(String fName, String lName, int credit, int funding)
   {
      super(fName, lName, credit);
      this.funding = funding;
   }
   public boolean isValid(){
      if(super.credit > 0)
         return true;
      else
         return false;
   }
   public int tuitionDue(){

      final int COST_PER_CREDIT = 433;
           
      int creditsToBill;
      if(this.credit > MAX_BILLABLE_CREDITS){
         creditsToBill = MAX_BILLABLE_CREDITS;
      } else {
         creditsToBill = this.credit;
      }
      
      int feeToPay;
      if(this.credit >= FULL_TIME_CREDIT_MIN){
         feeToPay = FULL_TIME_FEE;
      } else {
         feeToPay = PART_TIME_FEE;
      }

      if (this.credit < FULL_TIME_CREDIT_MIN) {
         this.funding = 0;
      }

      return (creditsToBill * COST_PER_CREDIT) + feeToPay - funding;
   }

   @Override
   public String toString(){
      return (super.toString() + "\nFunding: " + funding);
   }

   public static void main(String[] args){
      int testCounter = 1;
      //Constructor Tests
      Instate instate1 = new Instate("Ezra", "Haleva", 15, 100);
      if(instate1.credit == 15){
         System.out.println("Passed test #" + testCounter);
      } else {
         System.out.println("failed test #" + testCounter);
      }
      testCounter++;
      if(instate1.funding == 100){
         System.out.println("Passed test #" + testCounter);
      } else {
         System.out.println("failed test #" + testCounter);
      }
      testCounter++;
      
      //isValid() tests
      Instate validInstate = new Instate("Ezra", "Haleva", 15, 100);
      Instate invalidInstate = new Instate("Ezra", "Haleva", 0, 100);
      if(validInstate.isValid()){
         System.out.println("Passed test #" + testCounter);
      } else {
         System.out.println("failed test #" + testCounter);
      }
      testCounter++;
      if(!invalidInstate.isValid()) {
         System.out.println("Passed test #" + testCounter);
      } else {
         System.out.println("failed test #" + testCounter);
      }
      testCounter++;

   



   }

}



