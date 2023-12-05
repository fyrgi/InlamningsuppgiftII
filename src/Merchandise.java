import java.io.PrintStream;

public class Merchandise {



        private String name;
        private double pris;
        private int stock;

        public Merchandise(String name, double pris, int stock) {
            this.name = name;
            this.pris = pris;
            this.stock = stock;
        }

        public String getName() {
            return this.name;
        }

        public double getPris() {
            return this.pris;
        }

        public int getStock() {
            return this.stock;
        }

        public void setPris(double price) {
            this.pris = price;
        }

        void stats() {
            PrintStream var10000 = System.out;
            String var10001 = this.getName();
            var10000.println(var10001 + ", " + this.getPris() + " SEK, " + this.getStock() + " left");
        }

        void inventoryMinusOne() {
            if (this.stock > 0) {
                --this.stock;
            } else {
                System.out.println("Sorry, " + this.name + " is out of stock.");
            }

        }
    }
