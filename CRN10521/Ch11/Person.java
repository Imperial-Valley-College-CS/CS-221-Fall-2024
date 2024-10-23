import java.util.GregorianCalendar;

public class Person
{
   //data fields
   protected String name;
   protected GregorianCalendar dob;
   protected int age;
   
   //constructor
   public Person( String n )
   {
      this.name = n;
   }
   
   //setter methods
   public void setDOB( String date )      //expected date format: month-day-year
   {
      String[] tokens = date.split("-");
      int month = Integer.parseInt(tokens[0])-1;
      int day = Integer.parseInt(tokens[1]);
      int year = Integer.parseInt(tokens[2]);
      
      this.dob = new GregorianCalendar(year, month, day);
   }
   
   //getter methods
   public int getAge()
   {
      //create GregCalendar with today's date
      GregorianCalendar today = new GregorianCalendar();
      //find elpased time (in milliseconds) between today and this.dob
      long timeDifferenceMillis = today.getTimeInMillis() - this.dob.getTimeInMillis();
      //convert elapsed time to elapsed days
      long timeDifferenceDays = timeDifferenceMillis/(1000*24*60*60);
      //divide days by 365 to get elapsed years (typecast to int)
      this.age = (int)(timeDifferenceDays/365.25);
      return this.age;
   }
}