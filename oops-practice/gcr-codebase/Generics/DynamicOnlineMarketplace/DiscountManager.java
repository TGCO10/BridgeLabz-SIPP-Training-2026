package GcrCodeBase.Generics.DynamicOnlineMarketplace;


public class DiscountManager {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double originalPrice = product.getPrice();
        double discountAmount = originalPrice * (percentage / 100);
        double newPrice = originalPrice - discountAmount;
        product.setPrice(newPrice);
        System.out.println("DISCOUNT: " + percentage + "% applied to " + product.getName());
    }
}