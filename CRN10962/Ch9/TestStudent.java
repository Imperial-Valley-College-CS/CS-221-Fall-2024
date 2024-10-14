public class TestStudent
{
   public static void main(String[] args)
   {
      System.out.println( (int)(17*Math.random()) );
      Student s1 = new Student("Donald Duck", 90);
      Student s2 = new Student("Dippy Duck");
      char[] grades = {'A', 'a', 'B', 'b'};
      s1.setGrades( grades );
   }
}