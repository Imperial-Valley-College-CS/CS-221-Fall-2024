public class StringOperations
{
   public static void main(String[] args)
   {
      int spaces = countSpaces("I love cake.");
      System.out.println( spaces );
      
      String ans = reverse("lake");
      System.out.println( ans );
      
   }//end main
   
   public static int countSpaces( String phrase )
   {
      int spaces = 0;
      for( int i = 0; i < phrase.length(); i++ )
      {
         if( phrase.charAt(i) == ' ' )
            spaces++;
      }
      return spaces;
   }//end countSpaces
   
   public static String reverse( String word )
   {      
      String empty = "";
      for( int i = word.length()-1; i >= 0; i-- )
      {
         empty += word.charAt(i);
      }
      return empty;
   }//end reverse
   
}//end of class