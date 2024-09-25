public class MethodsHome
{
   public int countSpaces( String phrase )
   {
      int spaces = 0;
      for( int i = 0; i < phrase.length(); i++ )
      {
         if( phrase.charAt(i) == ' ' )
            spaces++;
      }
      return spaces;
   }//end countSpaces
}