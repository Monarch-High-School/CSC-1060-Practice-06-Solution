/**
 * Solution code for the Product class
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-02
 */

 public class Product {
        /** The product's name */
    private String name;
        /** The base price */
    private double price;
        /** A longer description */
    private String description;


    /**
     * Constructor
     * @param n product name
     * @param p base price
     * @param d product description
     */
    public Product(String n, double p, String d) {
        name = n;
        price = p;
        description = d;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    
    public void setName(String n) {
        name = n;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setDescription(String d) {
        description = d;
    }

    /**
     * Returns a discounted price of either 0%, 5% or 10% based on base price.
     * @return A discounted price
     */
    public double getDiscountedPrice() {
        double [] discounts = new double[] {0, .05, .1};
        int i = (int)(Math.random() * discounts.length);
        return (1.0 - discounts[i]) * price;
    }

 }