import java.util.*;

public class Person
{
   //data fields (instance variables and static variables)
   protected String name, eyeColor, gender, personality, bloodType;
   protected int age;
   protected GregorianCalendar dob;
   
   //constructor
   public Person( String name )
   {
      this.name = name;
   }
   
   //setter methods
   public void setDOB( String dob )
   {
      int year, month, day;
      String[] tokens = dob.split("-");
      month = Integer.parseInt(tokens[0]) - 1;
      day = Integer.parseInt(tokens[1]);
      year = Integer.parseInt(tokens[2]);
      this.dob = new GregorianCalendar(year, month, day);
   }
   
   //getter methods
   public boolean bornOnLeapYear()
   {
      int year = this.dob.get(Calendar.YEAR);
      return this.dob.isLeapYear( year );
   }
   
   public int getAge()
   {
      GregorianCalendar today = new GregorianCalendar();
      long t2 = today.getTimeInMillis();
      long t1 = this.dob.getTimeInMillis();
      long deltaT = t2-t1;
      int diffInDays = (int)(deltaT/(1000.0*60*60*24));
      this.age = (int)(diffInDays/365.2422);
      return this.age;
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + getAge();
   }
}