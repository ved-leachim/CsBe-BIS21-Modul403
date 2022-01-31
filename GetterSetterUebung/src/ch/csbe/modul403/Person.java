package ch.csbe.modul403;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean hasItsOwnHousehold;
    private String street;
    private String city;
    private int PLZ;

    public void verbinden() {
        System.out.println("Sie sind verbunden");
    }

 //Getter
 public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return  lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean getHasItsOwnHousehold() {
        return hasItsOwnHousehold;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public int getPLZ() {
        return PLZ;
    }


//Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void  setBanane(){
        System.out.println("A");
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHasItsOwnHousehold(boolean hasItsOwnHousehold) {
        this.hasItsOwnHousehold = hasItsOwnHousehold;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

}
