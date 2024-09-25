public class Methods
{
   public static void main(String[] args)
   {
      System.out.println( args[2] );
      
      int x = indexOf("Cheese and pasta.", 'z');
      System.out.println(x);
      
   }//end main
   
   public static int indexOf( String phrase, char letter )
   {
      for( int i = 0; i < phrase.length(); i++ )
      {
         if( phrase.charAt(i) == letter )
         {
            return i;
         }
      }
      return -1;

   }//end indexOf
   
}//end class