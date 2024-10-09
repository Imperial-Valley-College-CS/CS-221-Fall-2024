public class TestVideogame
{
   public static void main(String[] args)
   {
      Videogame v1 = new Videogame("Street Fighter");
      v1.setSales(50000000);
      Videogame v2 = new Videogame("Minecraft", 300000000);
      String v2Title =  v2.getTitle();
      System.out.println(v2Title);
      Videogame v3 = new Videogame("Super Mario Bros", 58000000,"platformer","September 13, 1985");
      System.out.println( v1.title );
   }
}