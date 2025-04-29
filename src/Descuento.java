public class Descuento {
    public static double calculateDiscount(int productCount, double totalPrice, boolean isPremiumMember) {
        double discount = 0;

        if (productCount >= 10) {
            discount += 0.15;
        } else if (productCount >= 5) {
            discount += 0.1;
        }

        if (totalPrice > 500) {
            discount += 0.1;
        } else if (totalPrice > 200) {
            discount += 0.05;
        }

        if (isPremiumMember) {
            discount += 0.05;
        }

        double finalDiscount = discount * totalPrice;
        return Math.min(finalDiscount, 0.3 * totalPrice);
    }
}
