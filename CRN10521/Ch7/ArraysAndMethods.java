import java.util.Arrays;

public class ArraysAndMethods
{
   public static void main(String[] args)
   {
      testStartsWith();
      //testGPA();
   }
   
   public static void testGPA()
   {
      char[] grades = {'A', 'A', 'B', 'b'};
      double ans = gpa(grades);
      System.out.println( ans );
   }
   
   public static void testStartsWith()
   {
      String[] n = {"jaime", "juan", "lilah", "jorge"};
      char l = 'j';
      boolean[] answer = startsWith( n, l );
      System.out.println( Arrays.toString(answer) );
   }
   
   public static boolean[] startsWith( String[] names, char letter )
   {
      boolean[] returnArray = new boolean[names.length];
      for( int