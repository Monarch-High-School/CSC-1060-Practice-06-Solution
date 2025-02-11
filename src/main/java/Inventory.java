/**
 * Describe the class here
 * @author
 * @version 1.0
 * @since 2025-02
 */


 // use this class as the place to test all of your code
 public class Inventory {
    public static void main(String [] args) {
      Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
      System.out.println("Name: " + p.getName());
      System.out.println("Price: " + p.getPrice());
      System.out.println("Description: " + p.getDescription());
      System.out.println("Discounted Price: " + p.getDiscountedPrice());
      System.out.println("Setting price to 1.5");
      p.setPrice(1.5);
      System.out.println("Price: " + p.getPrice());
      System.out.println("Setting description to paper towel");
      p.setDescription("1-roll of 2-ply paper towel");
      System.out.println("New description: " + p.getDescription());


      System.out.println();
      Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
      System.out.println("Name: " + c.getName());
      System.out.println("Price: " + c.getPrice());
      System.out.println("Description: " + c.getDescription());
      System.out.println("Discounted Price: " + c.getDiscountedPrice());
      System.out.println("Size: " + c.getSize());
      System.out.println("Material: " + c.getMaterial());
      System.out.println("Changing size to X_LARGE");
      c.setSize(Clothing.SIZE.X_LARGE);
      System.out.println("New Size: " + c.getSize());
      System.out.println("New Discounted Price: " + c.getDiscountedPrice());

      System.out.println();
      Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
      System.out.println("Name: " + e.getName());
      System.out.println("Price: " + e.getPrice());
      System.out.println("Description: " + e.getDescription());
      System.out.println("Discounted Price: " + e.getDiscountedPrice());
      System.out.println("Warranty Period: " + e.getWarrantyPeriod());
      System.out.println("Changing Warranty Period to 2");
      e.setWarrantyPeriod(2);
      System.out.println("New Warranty Period: " + e.getWarrantyPeriod());

      System.out.println();
      System.out.println("Testing polymorphism");
      Product [] inventory = new Product [] {p, c, e}; 
      for (Product prod : inventory) {
         System.out.println("Name: " + prod.getName());
         System.out.println("Description: " + prod.getDescription());
         System.out.println("Price: " + prod.getPrice());
         System.out.println("Discounted Price 1: " + prod.getDiscountedPrice());
         System.out.println("Discounted Price 2: " + prod.getDiscountedPrice());
         System.out.println("Discounted Price 3: " + prod.getDiscountedPrice());
         System.out.println();
      }
    }
 }