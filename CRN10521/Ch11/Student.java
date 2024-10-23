public class Student extends Person
{
   //data fields
   private String name, gnumber;
   private double gpa;
   
   //constructor
   public Student( String n, String gNum )
   {
      super(n);               //invokes constructor of superclass (Person)
      this.gnumber = gNum;
   }

}