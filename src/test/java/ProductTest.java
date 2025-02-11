import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductTest {
    private final double DELTA = 1e-6; // delta


    @Test
    void testProductName() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        assertEquals("Toilet Paper", p.getName());
    }

    @Test
    void testProductPrice() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        assertEquals(1.49, p.getPrice(), DELTA); 
    }

    @Test
    void testProductDescription() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        assertEquals("1-roll of 2-ply toilet paper", p.getDescription());
    }

    @Test
    void testProductDiscountedPrice() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        double discountedPrice = p.getDiscountedPrice();

        // Check if the discounted price is one of 0%, 5%, or 10% off the original price
        assertTrue(Math.abs(discountedPrice - 1.49) <= DELTA || 
                   Math.abs(discountedPrice - 1.49 * .95) <= DELTA || 
                   Math.abs(discountedPrice - 1.49 * .9) <= DELTA, 
                   "Discounted price should be one of 1.49, 1.4155 (5%), or 1.341 (10%)");
    }

    @Test
    void testSetProductName() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        p.setName("Paper Towel");
        assertEquals("Paper Towel", p.getName());
    }

    @Test
    void testSetProductPrice() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        p.setPrice(1.50);
        assertEquals(1.50, p.getPrice(), 0.001);  // Use delta for floating point comparison
    }

    @Test
    void testSetProductDescription() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        p.setDescription("1-roll of 2-ply paper towel");
        assertEquals("1-roll of 2-ply paper towel", p.getDescription());
    }   

}
