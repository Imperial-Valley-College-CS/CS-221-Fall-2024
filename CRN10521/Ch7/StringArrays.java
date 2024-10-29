public class StringArrays
{
   public static void main(String[] args)
   {
      String[] arr = {"ha ppy hall oween", "tic tac toe", "hoc us po cus"};
      int[] ans = countSpaces( arr );
      System.out.println( ans[0] + " " + ans[1] + " " + ans[2] );
   }
   
   public static int[] countSpaces( String[] strings )
   {
      int[] spaceArr = new int[strings.length];
      int j = 0;
      for( String x : strings )
      {
         int spaces = 0;
         for( int i = 0; i < x.length(); i++ )
         {
            if( x.charAt(i) == 32 )
               spaces++;
         }
         spaceArr[j] = spaces;
         j++;
      }
      return spaceArr;
   }
}