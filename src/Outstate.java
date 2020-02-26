public class Outstate extends Student {

   private boolean tristate;

   public Outstate(String fname, String lname, int credit) {
      super(fname, lname, credit);
   }

   @Override
   public int tuitionDue() {
      return 1;
   }
}
