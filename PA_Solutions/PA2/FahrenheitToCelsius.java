package PA2_Variables.src.main.java;

public class FahrenheitToCelsius
{
   public static void main(String[] args)
   {
      float tempF = 109.5f;
      
      float tempC = (5.0f/9.0f)*(tempF-32.0f);
      
      System.out.printf("%.1f degF is %.1f degC.%n", tempF, tempC);
   }
}