package Decorator.Loyalty;

import Decorator.Order.Order;

public class Loyalty {
    private Double loyaltyStatusPercentage;
    private Double maxDiscountPercentage;

    public Loyalty(Double loyaltyStatusPercentage, Double maxDiscountPercentage){
        if(loyaltyStatusPercentage >= 0 && loyaltyStatusPercentage <= 1){
            this.loyaltyStatusPercentage = loyaltyStatusPercentage;
        } else{
            this.loyaltyStatusPercentage = 0.0;
        }
        this.maxDiscountPercentage = maxDiscountPercentage;
    }


    public Double getLoyaltyStatusPercentage() {
        return loyaltyStatusPercentage;
    }

    public void setLoyaltyStatusPercentage(Double loyaltyStatusPercentage) {
        if(loyaltyStatusPercentage >= 0 && loyaltyStatusPercentage <= 1){
            this.loyaltyStatusPercentage = loyaltyStatusPercentage;
        } else{
            this.loyaltyStatusPercentage = 0.0;
        }
    }

    public Double getMaxDiscountPercentage() {
        return maxDiscountPercentage;
    }

    public void setMaxDiscountPercentage(Double maxDiscountPercentage) {
        this.maxDiscountPercentage = maxDiscountPercentage;
    }


    public Double getDiscountedPrice(Order order){
        Double price = order.getTotalPrice() - ((this.maxDiscountPercentage * this.loyaltyStatusPercentage) * order.getTotalPrice());
        return Math.floor(price * 100)/100;
    }
}
