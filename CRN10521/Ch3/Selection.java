public class Selection
{
   public static void main(String[] args)
   {
      int age = 16;
      String nationality = "USA";
      
      //simple if-else statement
      if( age < 18 || !nationality.equals("USA") )
      {
         System.out.println( "You cannot vote!" );
         
      }else
      {
         System.out.println( "You can vote!" );
      }
      
      //if-else-if statement
      int grade = 82;
      
      if( grade >= 90 )
      {
         System.out.println( "Letter grade: A" );
      }else if ( grade >= 80 )
      {
         System.out.println( "Letter grade: B" );
      }else if ( grade >= 70 )
      {
         System.out.println( "Letter grade: C" );
      }else if ( grade >= 60 )
      {
         System.out.println( "Letter grade: D" );
      }else
      {
         System.out.println( "Letter grade: F" );
      }

      
      //switch statement
      char letter = 'a';
      
      switch( letter )
      {
         case 'a':
            System.out.println( "You have an A in the class" );
            break;
         case 'b':
            System.out.println( "You have a B in the class" );
            break;
         case 'c':
            System.out.println( "You have a C in the class" );
            break;
         case 'd':
            System.out.println( "You have a D in the class" );
            break;
         default:
            System.out.println( "You have an F in the class" );
      }
      
   }//end main
}//end class