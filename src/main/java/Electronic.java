/**
 * Describe the class here
 * @author
 * @version 1.0
 * @since 2025-02
 */

 public class Electronic extends Product {
        /** The warranty period */
    private int warrantyPeriod;

    public Electronic(String n, double p, String d, int wp) {
        super(n, p, d);
        warrantyPeriod = wp;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int wp) {
        warrantyPeriod = wp;
    }
    //@Override
    public double getDiscountedPrice() {
        double [] discounts = new double[] {0.0, 0.1, 0.2};
        int i = (int)(Math.random() * discounts.length);
        return (1.0 - discounts[i]) * getPrice();
    }
 }