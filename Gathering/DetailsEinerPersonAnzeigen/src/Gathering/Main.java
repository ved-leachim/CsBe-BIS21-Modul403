package Gathering;

/*Klassen*/
import java.util.Scanner;
import java.text.MessageFormat;

public class Main {

    /*Mainmethode des Programms*/
    public static void main(String[] args) {
        Details();
    }

    /*Personen-Objekte*/
    public class Person {
        private String firstName;
        private String lastName;
        private int age;
        private boolean hasItsOwnHousehold;
        private String street;
        private String city;
        private int PLZ;

        //Getter Functions
        public String getFirstName() {return firstName;}
        public String getLastName() {return  lastName;}
        public int getAge() {return age;}
        public boolean getHasItsOwnHousehold() {return hasItsOwnHousehold;}
        public String getStreet() {return street;}
        public String getCity() {return city;}
        public int getPLZ() {return PLZ;}

        //Setter Methods
        public void setFirstName(String firstName) {this.firstName = firstName;}
        public void setLastName(String lastName) {this.lastName = lastName;}
        public void setAge(int age) {this.age = age;}
        public void setHasItsOwnHousehold(boolean hasItsOwnHousehold) {this.hasItsOwnHousehold = hasItsOwnHousehold;}
        public void setStreet(String street) {this.street = street;}
        public void setCity(String city) {this.city = city;}
        public void setPLZ(int PLZ) {this.PLZ = PLZ;}
    }

    /*Teilproblem Personendetails*/
    public static void Details() {
    Scanner scan = new Scanner(System.in);
    String wert = scan.nextLine();

        System.out.println("---------------------------");
        System.out.println("Detailansicht einer Person:");
        System.out.println(MessageFormat.format("...", wert));
        System.out.println("---------------------------");
    }
}
