/**
 * Solution for the Clothing subclacss
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-02
 */

 public class Clothing extends Product {
   public enum SIZE {SMALL, MEDIUM, LARGE, X_LARGE, XX_LARGE};
      /** The clothing size */
   private SIZE size;
      /** The clothing material */
   private String material;

    /**
     * Constructor
     * @param n Name of the clothing
     * @param p Price
     * @param d Description of t
     * @param s Size of the clothign
     * @param m Material
     */
   public Clothing(String n, double p, String d, SIZE s, String m) {
         super(n, p, d);
         size = s;
         material = m;
    }

    /**
     * @return Size as a string
     */
   public String getSize() {
      return size.toString();
   }

   public String getMaterial() {
      return material;
   }

   public void setSize(SIZE s) {
      size = s;
   }
   
   public void setMaterial(String m) {
      material = m;
   } 

   // @Override
   public double getDiscountedPrice() {
      double [] discounts;

      switch (size) {
         case SMALL:
         case MEDIUM:
            discounts = new double[]{0.0, 0.05};
            break;
         case LARGE:
         case X_LARGE:
         case XX_LARGE:
         default:
            discounts = new double[]{0.0, 0.05, 0.1};

      }
      int i = (int)(Math.random() * discounts.length);
      return (1.0 - discounts[i]) * getPrice();
   }
 }