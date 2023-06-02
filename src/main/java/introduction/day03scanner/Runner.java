package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur?
        //Class ismi+ Object ismi+ Atama Operatoru + "new" + Constructor
              Car       myCar          =             new        Car();

        //"new" keyword u sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor Java da nesneleri olusturmak icin kullanilan ozel bir methoddur.
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        // buraya kadar variable cagirma yaptik simdi aktif ozellik cagirma yapacagiz.

        myCar.hareket();
        // tekrardan sout un icine yazilmaz hata verir zaten diger class ta soutun icinde
        myCar.dur();

        Student   tomHanks    =    new      Student();
        System.out.println("name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.study();
        tomHanks.feed();


        // buraza kadar dırek zaydırma seklınde oldu sepete kozup zaydırma da zapabılırıy

        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade); // seklinde




    }
}
