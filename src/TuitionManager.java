import java.util.Scanner;
public class TuitionManager
{
   public void run(){
      Scanner sc = new Scanner(System.in);
      StudentList studentList = new StudentList();

      boolean exit = false;
      while(!exit){
         char command = sc.nextInt();
         switch(command){
            case 'I' :
               Instate studentToAdd = createInstateFromInput(sc);
               if(addRequestIsValid(studentToAdd, studentList)){
                  studentList.add(studentToAdd);
               }
               break;
            case 'O' :
               Outstate studentToAdd = createOutstateFromInput(sc);
               if(addRequestIsValid(studentToAdd, studentList)){
                  studentList.add(studentToAdd);
               }
               break;
            case 'N' :
               International studentToAdd = createInternationalFromInput(sc);
               if(addRequestIsValid(studentToAdd, studentList)){
                  studentList.add(studentToAdd);
               }
               break;
            case 'R' :
					String fname = sc.next();
					String lname = sc.next();
					if(studentList.contains(fname, lname)){
							  studentList.remove(fname, lname));
					}
               break;
            case 'P' :
					studentList.print();
               break;
            case 'Q' :
               exit = true;
               break;
            default:
               System.out.println("Error, did not recognize input command");
               exit = true;
               break;
         }
      }
      System.out.println("Program Terminated");
   }
   private boolean addRequestIsValid(Student student, StudentList studentList){
      if(student.getCredit() < 1){
         return false;
      } else if( (student instanceof International) && student.getCredit() < 9 ) {
         return false;
      } else if (studentList.contains(student)){
         return false;
      }
      return true;
   }
   private Instate createInstateFromInput(Scanner sc){
      String fname = sc.next();
      String lname = sc.next();
      int credit = sc.nextInt();
      int funding = sc.nextInt();
      return new Instate(fname, lname, credit, funding);
   }
   private Outstate createOutstateFromInput(Scanner sc){
      String fname = sc.next();
      String lname = sc.next();
      int credit = sc.nextInt();
      int tristateChar = sc.nextInt();
      boolean isTristate;
      if(tristateChar == 'T'){
         isTristate = true;
      }else{
         isTristate = false;
      }
      return new Outstate(fname, lname, credit, isTristate);
   }
   private International CreateInternationalFromInput(Scanner sc){
      String fname = sc.next();
      String lname = sc.next();
      int credit = sc.nextInt();
      int exchangeChar = sc.nextInt();
      boolean isExchange;
      if(exchangeChar == 'T'){
         isExchange = true;
      } else{
         isExchange = false;
      }
      return new International(fname, lname, credit, isExchange);
   }

}


