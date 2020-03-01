import java.util.Scanner;
public class TuitionManager
{
   public void run(){
      Scanner sc = new Scanner(System.in);
      StudentList studentList = new StudentList();

      boolean exit = false;
      while(!exit){
         char command = sc.next().charAt(0);
         switch(command){
            case 'I' :
               {
                  Instate studentToAdd = createInstateFromInput(sc);
                  if(!studentToAdd.isValid()){
                     System.out.println("Error: invalid student entry");
                     break;
                  }
                  if(studentList.contains(studentToAdd)){
                     System.out.println("Error: list already contains this student");
                     break;
                  }
                  studentList.add(studentToAdd);
                  break;
               }
            case 'O' :
               {
                  Outstate studentToAdd = createOutstateFromInput(sc);
                  if(!studentToAdd.isValid()){
                     System.out.println("Error: invalid student entry");
                     break;
                  }
                  if(studentList.contains(studentToAdd)){
                     System.out.println("Error: list already contains this student");
                     break;
                  }
                  studentList.add(studentToAdd);
                  break;
               }
            case 'N' :
               {
                  International studentToAdd = createInternationalFromInput(sc);
                  if(!studentToAdd.isValid()){
                     System.out.println("Error: invalid student entry");
                     break;
                  }
                  if(studentList.contains(studentToAdd)){
                     System.out.println("Error: list already contains this student");
                     break;
                  }
                  studentList.add(studentToAdd);
                  break;
               }
            case 'R' :
               {
                  String fName = sc.next();
                  String lName = sc.next();
                  int NULL = 0;
                  Student studentToRemove = new Instate(fName, lName, NULL, NULL);
                  if(studentList.contains(studentToRemove)){
                     studentList.remove(studentToRemove);
                  } else {
                     System.out.println("Error: list does not contain this student");
                  }
                  break;
               }
            case 'P' :
               {
                  studentList.show();
                  break;
               }
            case 'Q' :
               {
                  exit = true;
                  break;
               }
            default:
               {
                  System.out.println("Error, did not recognize input command");
                  exit = true;
                  break;
               }
         }
      }
      System.out.println("Program Terminated");
   }
   private Instate createInstateFromInput(Scanner sc){
      String fName = sc.next();
      String lName = sc.next();
      int credit = sc.nextInt();
      int funding = sc.nextInt();
      return new Instate(fName, lName, credit, funding);
   }
   private Outstate createOutstateFromInput(Scanner sc){
      String fName = sc.next();
      String lName = sc.next();
      int credit = sc.nextInt();
      int tristateChar = sc.nextInt();
      boolean isTristate;
      if(tristateChar == 'T'){
         isTristate = true;
      }else{
         isTristate = false;
      }
      return new Outstate(fName, lName, credit, isTristate);
   }
   private International createInternationalFromInput(Scanner sc){
      String fName = sc.next();
      String lName = sc.next();
      int credit = sc.nextInt();
      int exchangeChar = sc.nextInt();
      boolean isExchange;
      if(exchangeChar == 'T'){
         isExchange = true;
      } else{
         isExchange = false;
      }
      return new International(fName, lName, credit, isExchange);
   }

}


