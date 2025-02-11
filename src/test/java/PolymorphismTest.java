import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PolymorphismTest {

    @Test
    void testPolymorphism() {
        Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");
        Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");
        Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);
        
        Product[] inventory = new Product[] {p, c, e}; 

        // Iterate through the inventory array to check that every object is a product
        for (Product product : inventory) {
            assertNotNull(product.getName());
            assertNotNull(product.getDescription());
            assertNotNull(product.getPrice());
            assertNotNull(product.getDiscountedPrice());
        }
    }
}
