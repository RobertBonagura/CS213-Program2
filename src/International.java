public class International extends Student {

   private boolean exchange;

   public International(String fname, String lname, int credit) {
      super(fname, lname, credit);
   }

   @Override
   public int tuitionDue() {
      return 0;
   }

}
