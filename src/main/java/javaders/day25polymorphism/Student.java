package javaders.day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";

    public int age = 23;


    //Encapsulation: (kapsullemek demek) Data saklamaktir==>(Data hiding)
    //Data yi nasil saklarsin? Access modifier ini "private" yaparak

   private String stdId = "AC2023102T";

   private double gpa=3.87;

   private boolean successful=false;
   /*Encapsulation yaptigimiz data yi istersek diger class lardan okuyabiliriz.
    Nasil okuruz?"get method" olusturarak Encapsulate edilmis data nin degerini okuyabiliriz.
    i)get methodlari hep "public"olur
    ii)get method un return type i okudugu variable in return type ile ayni olur
    iii)get method bir boolean variable icin olustrulduysa ismi "is" ile baslar

    */

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isSuccessful() {
        return successful;
    }
    //Encapsulation yaptigimiz data yi istersek diger class lardan degistirebiliriz.
    //Nasil degistirebiliriz?"set method" olusturarak Encapsulation edilen datayi degistirebiliriz.
    /*
    i)set methodlar hep public olur
    ii)set method un return type hep void olur.
    iii)set method parametre kullanir,parametrenin data tipi variable ile ayni olur.
    iv)set method kullanarak varolan object üzerinden degisiklikler yaparak o object i sanki yeni bir object mis gibi kullanabiliriz.
    //Note:get methodlarin diger adi "getter"; set methodlarin diger adi "setter" dir.

     */


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
