package javaders.day18constructorsstatickeywordsüleymanhoca;

public class CarRunner {
    public static void main(String[] args) {
        //Java tekrari sevmez main i defaalrca yazmak yerine biz Runner class i olusturuyoruz hepsi icin kullaniyoruz.

        Car c1 = new Car();//bu kaliptan cikmak icin parametreli girerek istedigimiz verileri girebiliyoruz.
        System.out.println(c1.make);
        Car c2 = new Car("Mercedes","C300",2023,30000);
        System.out.println(c2.make);
        Car c3 = new Car("Audi","R8",2023,50000);
        Car c4 = new Car("BMW");// burda price girmeyince car class in icinde verilen data kullaniyor.
        Car c5 = new Car("BMW",50000);
        System.out.println(c5.year);
        System.out.println(c5.make);


    }//main
}//class
