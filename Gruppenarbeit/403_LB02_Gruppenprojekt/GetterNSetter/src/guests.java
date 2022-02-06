
import java.util.Scanner;

    public class guests {

        private String farbe;
        private int alter;


        public static void main(String[] args) {
            guests max = new guests("weiss", 23);
            System.out.println("farbe: " + guests.getFarbe());


        }

        guests(String farbe, int alter) {
            this.farbe = farbe;
            this.alter = alter;
        }

        public void setFarbe(String farbe) {
            this.farbe = farbe;
        }
        public String getFarbe(){
            return farbe;
        }

    }

