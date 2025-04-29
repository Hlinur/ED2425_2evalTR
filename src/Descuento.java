public class Descuento {
    public static double calculateDiscount(int productCount, double totalPrice, boolean isPremiumMember) {
        double discount = 0;

        if (productCount >= 5 && productCount < 10) {
            discount += 0.1;
        } else if (productCount >= 10) {
            discount += 0.15;
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

        if (finalDiscount > 0.3 * totalPrice) {
            return 0.3 * totalPrice;
        } else {
            return finalDiscount;
        }
    }
}
