public class Student extends Person
{
   //data fields (instance variables and static variables)
   public String gnumber;
   public double gpa;
   public char[] grades;
   
   public Student( String name, String gNum)
   {
      super(name);    //invoking superclass constructor
      this.gnumber = gNum;
   }
   
   @Override
   public String toString()
   {
      return super.toString() + "\nG-Number: " + this.gnumber;
   }
   
}