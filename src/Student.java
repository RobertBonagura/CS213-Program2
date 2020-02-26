public abstract class Student implements Comparable {

   private String fname;
   private String lname;
   protected int credit;

   public Student(String fname, String lname, int credit){

   }

   public int compareTo(Object obj){
      return 1;
   }

   public String toString() {
      String result = null;
      return result;
   }

   public abstract int tuitionDue();

}
