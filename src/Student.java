abstract class Student implements Comparable {

   protected final int FULL_TIME_CREDIT_MIN = 12;
   protected final int MAX_BILLABLE_CREDITS = 15;
   protected final int PART_TIME_FEE = 846;
   protected final int FULL_TIME_FEE = 1441;

   private String fname;
   private String lname;
   private int credit;
   
   public Student(String fname, String lname, int credit) {
      this.fname = fname;
      this.lname = lname;
      this.credit = credit;
   }

   public int compareTo(Object obj){
      if(obj instanceof Student){
         Student comparedStudent = (Student)(obj);
         if(fname.compareTo(comparedStudent.getFName()) != 0)
            return fname.compareTo(comparedStudent.getFName());   
         else{
            return lname.compareTo(comparedStudent.getLName());   
         }
      }
      return 1;//Only called if obj isn't a student
   }

   public String toString() {
      return ("Name: " + fname + " " + lname + "\nCredits: " + credit + "\n");
   }
   
   public String getFName(){
      return fname;
   }

   public String getLName(){
      return lname;
   }


   public int getCredit() {
      return credit;
   }

   public abstract int tuitionDue();
}
