import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ElectronicTest {
    private final double DELTA = 1e-6;

    @Test
    void testElectronicName() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        assertEquals("Earbuds", e.getName());
    }

    @Test
    void testElectronicPrice() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        assertEquals(44.10, e.getPrice(), DELTA); 
    }

    @Test
    void testElectronicDescription() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        assertEquals("Easy-to-lose earbuds", e.getDescription());
    }

    @Test
    void testElectronicWarrantyPeriod() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        assertEquals(1, e.getWarrantyPeriod());
    }

    @Test
    void testElectronicDiscountedPrice() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        double discountedPrice = e.getDiscountedPrice();

        // Check if the discounted price is one of 0%, 10%, or 20% off the original price
        assertTrue(Math.abs(discountedPrice - 44.10) <= DELTA || 
                   Math.abs(discountedPrice - (44.10 * 0.90)) <= DELTA || 
                    Math.abs(discountedPrice - (44.10 * 0.80)) <= DELTA, 
                   "Discounted price should be one of 44.10, 39.69 (10%), or 35.28 (20%)");
    }

    // Setter tests
    @Test
    void testSetElectronicName() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        e.setName("Headphones");
        assertEquals("Headphones", e.getName());
    }

    @Test
    void testSetElectronicPrice() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        e.setPrice(49.99);
        assertEquals(49.99, e.getPrice(), DELTA); 
    }

    @Test
    void testSetElectronicDescription() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        e.setDescription("High-quality noise-canceling earbuds");
        assertEquals("High-quality noise-canceling earbuds", e.getDescription());
    }

    @Test
    void testSetElectronicWarrantyPeriod() {
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        e.setWarrantyPeriod(2);
        assertEquals(2, e.getWarrantyPeriod());
    }
}
