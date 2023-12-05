//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Kund {
    private int amountOfThingsBought = 0;
    private double finalPrice = 0.0;

    Kund() {
    }

    public int getAmountOfThingsBought() {
        return this.amountOfThingsBought;
    }

    public double getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(double discount) {
        this.finalPrice = discount;
    }

    void purchase(double priCe) {
        ++this.amountOfThingsBought;
        this.finalPrice += priCe;
    }
}
