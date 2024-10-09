public class TestStudent
{
   public static void main(String[] args)
   {
      Student s = new Student("Lucia Gomez", "female", 20);
      char[] grades = {'A', 'b', 'B', 'a', 'C'};
      s.setGrades( grades );
      System.out.println( "GPA: " + s.getGPA() );      
      System.out.println( s );
   }
}