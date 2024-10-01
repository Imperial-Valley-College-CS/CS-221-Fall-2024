import java.util.Arrays;

public class StringArrays
{
   public static void main(String[] args)
   {
      String[] emails = {"a.lira@gmail.com", "j.lopez@yahoo.com"};
      String domain = "@gmail.com";
      boolean[] ans = checkDomains(emails, domain);
      System.out.println( Arrays.toString(ans) );
   }
   
   public static boolean[] checkDomains(String[] arr, String dom)
   {
      boolean[] newArr = new boolean[arr.length];
      
      int i = 0;
      for( String x : arr )
      {
         newArr[i] = x.endsWith(dom);
         i++;
      }
      return newArr;
   }
}