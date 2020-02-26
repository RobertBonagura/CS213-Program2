public class Instate extends Student {
   private int funds;

   public Instate(String fname, String lname, int credit) {
      super(fname, lname, credit);
   }

   @Override
   public int tuitionDue() {
      return 0;
   }

}
