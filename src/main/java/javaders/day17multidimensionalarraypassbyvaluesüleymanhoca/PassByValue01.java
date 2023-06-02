package javaders.day17multidimensionalarraypassbyvaluesüleymanhoca;

public class PassByValue01 {
    /*
Method olusturmak icin asagidaki 5 adimi takip ediniz.
1)Access Modifier
2) Return Type
3) Method ismi
4)Method Parantezi( )
6)Methodun body'si { }

Note: "main method" icindeki tüm methodlar "static" olmalidir.
bir methodu static yapmak icin access modifier ile return type in arasina
static yazmak yeterlidir.

Pass by Value:
pass by value
1-java "pass by value" kullanir
2- java methodlarin orijinal degeri degistirmesine musaade etmez
3-java methodlara deger yollarken orijinal degerin kopyasini olusturur
ve o kopyayi methoda yollar, method da kopya uzerinde degisiklik yapar
java bunu yaparak orijinal degeri korur.
4-java esnek bir dildir. istersek yazdigimiz kod ile orijinal degerin
degismesini de temin edebiliriz

Pass by Reference:
1)Pass by reference da method a reference yollanir.
2)Reference adres demektir.Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir.
Bu yuzden "C#" gibi pass by reference kullanan yazilim dillerinde method variable nin orijinal  degerini degistirir.
 */

    public static void main(String[] args) {
        int shirtPrice =200;

        System.out.println(discount("student",shirtPrice));
        System.out.println(shirtPrice);//200 burasi hala 200orjinal fiyati java koruyor.
        shirtPrice=discount("veteran",shirtPrice);
        System.out.println(shirtPrice);//160
    }//main
    //Discount Methodu olusturunuz.
    public static int discount(String type,int price){
        switch(type){
            case "student":
                price=price-20;
                break;
            case "veteran":
                price=price-40;
                break;
            case "senior":
                price=price-30;
                break;
            default:
                price=price;
        }
        return price;
    }





}//class
