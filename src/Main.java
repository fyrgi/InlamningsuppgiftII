import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Kund kund = new Kund();
        Merchandise(kund);
    }

    static void Merchandise(Kund kund) {
        Rabatterad mask = new Rabatterad("Mask", 235.5, 14, 0.5);
        Merchandise plasticKnife = new Merchandise("Plastic Knife", 45.5, 3);
        Merchandise fakeBlood = new Merchandise("Fake Blood", 89.1, 44);
        ArrayList<Merchandise> list = new ArrayList();
        list.add(mask);
        list.add(plasticKnife);
        list.add(fakeBlood);
        mask.discount();

        int chose;
        do {
            int i = 1;

            for(Iterator var7 = list.iterator(); var7.hasNext(); ++i) {
                Merchandise item = (Merchandise)var7.next();
                System.out.print("" + i + ". ");
                item.stats();
            }

            System.out.println("4. Quit");
            System.out.print("Chose your option: ");
            Scanner scan = new Scanner(System.in);
            chose = scan.nextInt();
            if (chose == 1 && mask.getStock() > 0) {
                mask.inventoryMinusOne();
                kund.purchase(mask.getPris());
            }

            if (chose == 2 && plasticKnife.getStock() > 0) {
                plasticKnife.inventoryMinusOne();
                kund.purchase(plasticKnife.getPris());
            }

            if (chose == 3 && fakeBlood.getStock() > 0) {
                fakeBlood.inventoryMinusOne();
                kund.purchase(fakeBlood.getPris());
            }
        } while(chose != 4);

        PrintStream var10000 = System.out;
        int var10001 = kund.getAmountOfThingsBought();
        var10000.println("You have bought " + var10001 + " merchandise, total cost " + kund.getFinalPrice() + " SEK.");
    }
}