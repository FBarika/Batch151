package introduction.day03scanner;

public class Student {

    public String name = " Tom Hanks"; // public yazmak zorunda degiliz. hic yazmazsak default olur

    public byte grade = 8;
    public String address = "Ankara";


    public void study() {
        System.out.println("Gunu gunune ders calisir...");
    }

    public void feed() {
        System.out.println(" Saglikli beslenir...");


        // burasi da studunt class i runner dan buradaki variable ve methodlari
        //cagiriyoruz.
    }
}
