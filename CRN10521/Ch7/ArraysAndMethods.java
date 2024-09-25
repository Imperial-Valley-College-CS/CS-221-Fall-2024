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
      for( int i = 0; i < names.length; i++ )
      {
         if( names[i].charAt(0) == letter )
         {
            returnArray[i] = true;
         }else
         {
            returnArray[i] = false;
         }
      }//end for
      return returnArray;
   }//end startsWith
   
   public static double gpa( char[] g )
   {
      double sum = 0;
      for( char x : g )
      {
         switch(x)
         {
            case 'A': case 'a': sum += 4; break;
            case 'B': case 'b': sum += 3; break;
            case 'C': case 'c': sum += 2; break;
            case 'D': case 'd': sum += 1; break;
         }
      }
      return sum/g.length;
   }
}