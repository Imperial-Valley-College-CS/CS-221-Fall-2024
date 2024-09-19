public class StringMethods
{
   public static void main(String[] args)
   {
      int ans1 = countSpaces("I love cake.");
      int ans2 = countSpaces("Happy Halloween is coming.");
      String ans3 = reverse("lake");
      System.out.println( ans1 );
      System.out.println( ans2 );
      System.out.println( ans3 );
   }//end main
   
   public static String reverse(String phrase)
   {
      String empty = "";
      for( int i = phrase.length()-1; i >= 0; i--)
      {
         empty += phrase.charAt(i);
      }
      return empty;
   }//end reverse
   
   public static int countSpaces(String phrase)
   {
      int spaces = 0;
      for( int i = 0; i < phrase.length(); i++ )
      {
         if( phrase.charAt(i) == 32 )
         {
            spaces++;
         }
      }
      return spaces;
   }//end countSpaces
   
}