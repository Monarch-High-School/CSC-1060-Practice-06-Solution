import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClothingTest {

    private final double DELTA = 1e-6;
    @Test
    void testClothingName() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        assertEquals("Fancy Pants", c.getName());
    }

    @Test
    void testClothingPrice() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        assertEquals(78.99, c.getPrice(), DELTA); 
    }

    @Test
    void testClothingDescription() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        assertEquals("Comfortable bedazzled pants", c.getDescription());
    }

    @Test
    void testClothingSize() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        assertEquals("MEDIUM", c.getSize());
    }

    @Test
    void testClothingMaterial() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        assertEquals("Wool", c.getMaterial());
    }

    @Test
    void testClothingDiscountedPriceForSmallOrMedium() {
        Clothing cSmall = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.SMALL, "Wool");
        Clothing cMedium = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        
        // Small or Medium size should have 0% or 5% discount
        double discountedPriceSmall = cSmall.getDiscountedPrice();
        double discountedPriceMedium = cMedium.getDiscountedPrice();

        assertTrue(Math.abs(discountedPriceSmall - 78.99) <= DELTA || 
                    Math.abs(discountedPriceSmall - (78.99 * 0.95)) <= DELTA, 
                   "Small size should have 0% or 5% discount");
        assertTrue(Math.abs(discountedPriceMedium - 78.99) <= DELTA || 
                    Math.abs(discountedPriceMedium - (78.99 * 0.95)) <= DELTA, 
                   "Medium size should have 0% or 5% discount");
    }

    @Test
    void testClothingDiscountedPriceForLargeOrLarger() {
        Clothing cLarge = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.LARGE, "Wool");
        Clothing cXLarge = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.X_LARGE, "Wool");
        Clothing cXXLarge = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.XX_LARGE, "Wool");

        // Large, X-Large, or XX-Large should have 0%, 5%, or 10% discount
        double discountedPriceLarge = cLarge.getDiscountedPrice();
        double discountedPriceXLarge = cXLarge.getDiscountedPrice();
        double discountedPriceXXLarge = cXXLarge.getDiscountedPrice();

        assertTrue(Math.abs(discountedPriceLarge - 78.99) <= DELTA || 
                    Math.abs(discountedPriceLarge - (78.99 * 0.95)) <= DELTA || 
                    Math.abs(discountedPriceLarge - (78.99 * 0.90)) <= DELTA,
                   "Large size should have 0%, 5%, or 10% discount");

        assertTrue(Math.abs(discountedPriceXLarge - 78.99) <= DELTA || 
                    Math.abs(discountedPriceXLarge - (78.99 * 0.95)) <= DELTA || 
                    Math.abs(discountedPriceXLarge - (78.99 * 0.90)) <= DELTA,
                   "X-Large size should have 0%, 5%, or 10% discount");

        assertTrue(Math.abs(discountedPriceXXLarge - 78.99) <= DELTA || 
                    Math.abs(discountedPriceXXLarge - (78.99 * 0.95)) <= DELTA || 
                    Math.abs(discountedPriceXXLarge - (78.99 * 0.90)) <= DELTA,
                   "XX-Large size should have 0%, 5%, or 10% discount");
                   
    }

    // Setter tests
    @Test
    void testSetClothingName() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        c.setName("Trendy Pants");
        assertEquals("Trendy Pants", c.getName());
    }

    @Test
    void testSetClothingPrice() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        c.setPrice(79.99);
        assertEquals(79.99, c.getPrice(), DELTA);
    }

    @Test
    void testSetClothingDescription() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        c.setDescription("Comfortable cotton pants");
        assertEquals("Comfortable cotton pants", c.getDescription());
    }

    @Test
    void testSetClothingSize() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        c.setSize(Clothing.SIZE.LARGE);
        assertEquals("LARGE", c.getSize());
    }

    @Test
    void testSetClothingMaterial() {
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        c.setMaterial("Cotton");
        assertEquals("Cotton", c.getMaterial());
    }
}
