# CSC 1060 Practice 06
The purpose of this practice is to build your skills with inheritance and polymorphism. You are designing a simple product inventory system that contains a general `Product` class as well as specific classes `Clothing` and `Electronic` that inherit the properties of a generic `Product`.

## Price Discounting
This product inventory offers discounts in a fun and crazy way: every time you request a discounted price, it will be different, depending on the item requested.

| Item type | Possible Discount % |
| :---      | :---                |
| `Product` | 0%, 5%, 10%         |
| `Clothing` | For small or medium items (0% or 5%). For large, xl, and xxl items (0%, 5%, 10%) |
| `Electronic` | 0%, 10%, 20% |

**Note**: Do not round. 

## Task
The table below shows the classes being used and the effect or return value. 

1. Create a UML diagram for each of the classes and show the inhereitance hierarchy. Use [UML inheritance template]( https://docs.google.com/drawings/d/1QgQlplDsZbgpl27zm9RZ-k4oppaLK8ZLDxMaXViPva8/edit?usp=sharing).

Remember that the subclasses point upward to the base class. Also notice how enumerations are handled (off to the side pointing to the class that uses them).


2. Implement the Java code for each of the classes. 

## Usage 
### `Product`
| Code Segment                                               |            Effect / Return Value       |
| :---                                                       |     :---                               |
| `Product p = new Product("Toilet Paper", 1.49, "1-roll of 2-ply toilet paper");` | Creates a new `Product` object with the values indicated.|
| `p.getName();` | Returns `"Toilet Paper"` |
| `p.getPrice();` | Returns `1.49` |
| `p.getDescription();` | Returns `"1-roll of 2-ply toilet paper"` |
| `p.getDiscountedPrice();` | Returns one of `1.49` (0%), `1.4155` (5%), or `1.341` (10%) |
| `p.setName("Paper Towel");` | Sets the name of the product to "Paper Towel" |
| `p.setPrice(1.5);` | Sets the price of the product to `1.5` |
| `p.setDescription("1-roll of 2-ply paper towel");` | Sets the description of the product to "1-roll of 2-ply paper towel"|

### `Clothing`
| Code Segment                                               |            Effect / Return Value       |
| :---                                                       |     :---                               |
| `Clothing.SIZE.SMALL, Clothing.SIZE.MEDIUM, Clothing.SIZE.LARGE, Clothing.SIZE.X-LARGE, Clothing.SIZE.XX-LARGE` | This code doesn't do anything. It just illustrates the size enumeration. | 
| `Clothing c = new Clothing("Fancy Pants", 78.99, "Comfortable bedazzled pants", Clothing.SIZE.MEDIUM, "Wool");` | Creates a new `Clothing` object with the values indicated.|
| `c.getName();` | Returns `"Fancy Pants"` |
| `c.getPrice();` | Returns `78.99` |
| `c.getDescription();` | Returns `"Comfortable bedazzled pants"` |
| `c.getDiscountedPrice();` | Returns one of `78.99` (0%) or `75.0405` (5%) |
| `c.getSize();` | Returns `"MEDIUM"` (a String) |
| `c.getMaterial();` | Returns `"Wool"` |

### `Electronic`
| Code Segment                                               |            Effect / Return Value       |
| :---                                                       |     :---                               |
| `Electronic e = new Electronic("Earbuds", 44.10, "Easy-to-lose earbuds", 1);` | Creates a new `Electronic` object with the values indicated.|
| `e.getName();` | Returns `"Earbuds"` |
| `e.getPrice();` | Returns `44.10` |
| `e.getDescription();` | Returns `"Easy-to-lose earbuds"` |
| `e.getDiscountedPrice();` | Returns one of `44.10` (0%) or `39.69` (10%) or `35.28` (20%)|
| `e.getWarrantyPeriod();` | Returns `1` |

### Polymorphism
Ensure that the following code works as well:
```java
Product [] inventory = new Product [] {p, c, e}; 
for (Product p : inventory) {
    System.out.println("Name: " + p.getName());
    System.out.println("Description: " + p.getDescription());
    System.out.println("Price: " + p.getPrice());
    System.out.println("Discounted Price 1: " + p.getDiscountedPrice());
    System.out.println("Discounted Price 2: " + p.getDiscountedPrice());
    System.out.println("Discounted Price 3: " + p.getDiscountedPrice());
}
```

## Unit Tests
Ensure that the unit tests pass by running the unit test files in `src/test/java/`.