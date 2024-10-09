import java.util.GregorianCalendar;

public class Videogame
{
   //data fields (instance variables or static variables)
   public String title, genre;
   private int sales;
   private GregorianCalendar releaseDate;
   
   //constructors
   public Videogame(String t)
   {
      this.title = t;
   }
   
   public Videogame(String t, int s)
   {
      this.title = t;
      this.sales = s;
   }
   
   public Videogame(String t, int s, String g, String r)
   {
      this.title = t;
      this.sales = s;
      this.genre = g;
      setReleaseDate(r);
   }
   
   //setter methods
   public void setSales(int s){ this.sales = s; }
   
   public void setReleaseDate( String date )
   {
      int year, month, day;
      String[] tokens = date.split(" ");
      year = Integer.parseInt(tokens[2]);
      day = Integer.parseInt(tokens[1].replace(',', ' ').trim());
      
      switch( tokens[0].toLowerCase() )
      {
         case "january": month = 0; break;
         case "february": month = 1; break;
         case "march": month = 2; break;
         case "april": month = 3; break;
         case "may": month = 4; break;
         case "june": month = 5; break;
         case "july": month = 6; break;
         case "august": month = 7; break;
         case "september": month = 8; break;
         case "october": month = 9; break;
         case "november": month = 10; break;
         case "december": month = 11; break;
         default: month = 0;
      }
      this.releaseDate = new GregorianCalendar(year, month, day);
   }
   
   //getter methods
   public String getTitle(){ return this.title; }
}