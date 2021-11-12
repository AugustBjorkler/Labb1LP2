// Each Location object represents a position in a World
// new Location(0,0) is the upper left (northwest) corner
public class Location {
   private double x;
   private double y;

   public Location(double x, double y) {
      this.x = x;
      this.y = y;
   }

   // Extracts the row-number (0 for top row) of a location
   public double getX() {
      return x;
   }

   // Extracts the column-number (0 for leftmost column) of a location
   public double getY() {
      return y;
   }

}