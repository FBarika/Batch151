package javaders.day18constructorsstatickeywordsüleymanhoca;

/*
     1)Constructor nasil olusturulur?
       Access Modifier+Class ismi+ () +{}
     2)Method ile Constructor arasindaki farklar nelerdir?
      i)"Method" larda return type olur,Constructor larda olmaz.
      ii)Methodlar yaptiklari ise göre isimlendirirler (örnegin toplama methodu deriz.)
      Constructor lar ise her zaman class ismi ile isimlendirilirler.
      iii)Methodlar bir aksiyon yapmak icin olusturulur.Constructor lar ise Object olusturmak icin olusturulur.
      iv)Method isimleri kücük harfle baslar Constructor isimleri class ismiyle ayni oldugu icin büyük harfle baslar.
     3) Parametreli Constructor lar olusturarak ayni class tan farkli özelliklere sahip objeler olusturabiliriz.

 */
public class Car {// biz class olusturdugumuzda mutlaka Java constructor koyar class arkasina biz göremeyiz.
        String make = "Honda";
        String model ="Accord";
        int year =2021;
        int price =18000;

    public Car (){

    }
    //Default Constructor
    //Default Constructor lar parametre kullanmazlar
    //Default Constructor larin body si bostur.
    //Java kiskanctir.Siz Default Constructor i elle yazdigimizda Java Object class icindeki Default Constructor i kullandirmaz.


        //Custom Constructor
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Custom Constructor

    //Custom Constructor
    public Car(String make, int price) {
        this.make=make;
        this.price = price;
    }

    public Car(String make) {
        this.make=make;
    }


// bir class in icinde birden cok constructor olabilir.








}//class
