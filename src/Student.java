abstract class Student implements Comparable {

   protected final int FULL_TIME_CREDIT_MIN = 12;
   protected final int MAX_BILLABLE_CREDITS = 15;
   protected final int PART_TIME_FEE = 846;
   protected final int FULL_TIME_FEE = 1441;

   private String fName;
   private String lName;
   private int credit;
   
   public Student(String fName, String lName, int credit) {
      this.fName = fName;
      this.lName = lName;
      this.credit = credit;
   }

   public int compareTo(Object obj){
      if(obj instanceof Student){
         Student comparedStudent = (Student)(obj);
         if(fName.compareTo(comparedStudent.getFName()) != 0)
            return fName.compareTo(comparedStudent.getFName());
         else{
            return lName.compareTo(comparedStudent.getLName());
         }
      }
      return 1;//Only called if obj isn't a student
   }

   public String toString() {
      return ("Name: " + fName + " " + lName + "\nCredits: " + credit + "\n");
   }
   
   public String getFName(){
      return fName;
   }

   public String getLName(){
      return lName;
   }


   public int getCredit() {
      return credit;
   }

   public abstract int tuitionDue();
}
