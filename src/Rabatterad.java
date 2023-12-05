//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Rabatterad extends Merchandise {
    private double discountInPercent;

    public Rabatterad(String name, double pris, int stock, double discountInPercent) {
        super(name, pris, stock);
        this.setDiscountInPercent(discountInPercent);
    }

    public double getDiscountInPercent() {
        return this.discountInPercent;
    }

    public void setDiscountInPercent(double discount) {
        this.discountInPercent = discount;
    }

    public double discount() {
        if (this.getPris() >= 50.0) {
            this.setPris(this.getPris() * this.getDiscountInPercent());
        }

        return this.getPris();
    }
}