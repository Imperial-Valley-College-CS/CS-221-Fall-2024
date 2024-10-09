public class Student{

   //data fields
   private String name, gender;
   private int age;
   private char[] grades;
   private double gpa;
   
   //constructors
   public Student(String n, String g, int a)
   {
      this.name = n;
      this.gender = g;
      this.age = a;
   }
   
   //setter methods
   public void setGrades(char[] g)
   {
      this.grades = g;
      calcGPA();
   }
   
   //getter methods
   public double getGPA()
   {
      return this.gpa;
   }
    
   //specialized methods  
   private void calcGPA()
   {
      
      if (grades==null){
         System.out.println("Grades are missing");
         this.gpa= 0.0;
      } else{
         double sum = 0;
         for (char x : this.grades)
         {
            switch(x)
            {
               case 'A', 'a': sum+= 4.0; break;
               case 'B', 'b': sum+= 3.0; break;
               case 'C', 'c': sum+= 2.0; break;
               case 'D', 'd': sum+= 1.0; break;
               default:
            }
         }
         this.gpa = sum/this.grades.length;
      }      
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + this.age + 
         "\nGPA: " + this.gpa;
   }
} 