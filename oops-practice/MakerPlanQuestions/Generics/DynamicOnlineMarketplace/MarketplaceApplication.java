package GcrCodeBase.Generics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceApplication {

    public static void main(String[] args) {
        BookCategory bookCat = new BookCategory();
        ClothingCategory clothCat = new ClothingCategory();

        Product<BookCategory> book = new Product<>("Effective Java", 45.00, bookCat);
        Product<ClothingCategory> clothing = new Product<>("Denim Jacket", 85.50, clothCat);

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(clothing);

        System.out.println("--- Initial Marketplace Catalog ---");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }

        System.out.println("\n--- Triggering Campaign System ---");
        DiscountManager.applyDiscount(book, 10.0);
        DiscountManager.applyDiscount(clothing, 15.0);

        System.out.println("\n--- Final Marketplace Catalog ---");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }
}