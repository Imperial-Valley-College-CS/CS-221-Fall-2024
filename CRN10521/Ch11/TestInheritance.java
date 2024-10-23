public class TestInheritance
{
   public static void main(String[] args)
   {
      Person p = new Person("Lucia Gomez");
      p.setDOB("10-24-1999");
      System.out.println( p.getAge() );
      Student s = new Student("Joe Lopez", "G00918215");
      s.setDOB("2-15-2001");
      System.out.println( s.getAge() );
   }
}