public class Student
{
   //data fields (instance variables or static variables)
   private String name;
   private int age; 
   private char[] grades;
   private double gpa;
      
   //constructors
   public Student(String m)
   {
      this.name = m;
   }
   
   public Student(String m, int a)
   {
      this.name = m;
      this.age = a;
   }
   
   //setter methods
   public void setGrades(char[] timmy)
   {
      this.grades = timmy;
      calcGPA();              //invoke calcGPA()
   }
   
   private void calcGPA()
   {
      double sum = 0;
      for(char x: grades)
      {
         switch (x)
         {
            case 'A','a': sum+= 4; break;
            case 'B','b': sum+= 3; break;
            case 'C','c': sum+= 2; break;
            case 'D','d': sum+= 1; break;            
         }
      }
      this.gpa = sum/grades.length;
   }
}