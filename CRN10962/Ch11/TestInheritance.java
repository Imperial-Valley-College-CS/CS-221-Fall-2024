public class TestInheritance
{
   public static void main(String[] args)
   {
      Student s = new Student("Lucia Gomez", "G00451369");
      s.setDOB("10-22-1999");
      boolean ans = s.bornOnLeapYear();
      System.out.println( "Born on Leap Year: " + ans );
      int age = s.getAge();
      System.out.println( age );
   }
}