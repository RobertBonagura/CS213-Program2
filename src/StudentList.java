public class StudentList {

   private static int INITIAL_CAPACITY = 10;
   private static int GROWTH_RATE = 2;
   private int capacity;
   private int size;
   private Student[] students;

   /**
    * Default constructor, sets StudentList to default capacity of 10.
    */
   public StudentList(){
      this.capacity = INITIAL_CAPACITY;
      this.size = 0;
      this.students = new Student[INITIAL_CAPACITY];
   }

   public void add(Student student){
      this.students[this.size] = student;
      this.size++;
      if (size == capacity){
         this.grow();
      }
      return;
   }

   private void grow() {
      int newCapacity = capacity * GROWTH_RATE;
      Student[] newStudents = new Student[newCapacity];
      for (int i = 0; i < this.size; i++){
         newStudents[i] = this.students[i];
      }
      this.students = newStudents;
      return;
   }

  private void remove(Student student){

  }

   public void show(){
      return;
   }
}
