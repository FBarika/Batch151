package introduction.day03scanner;

public class Car {
    //Variable'lar olusturalim
    public String model = "Corolla";// bir sey (public) fln yazmazsak java default kabul eder direk.
    public int fiyat = 20000;

    // Method lar olusturalim
    //Note: return type void oldugunda method icinde "return" keyword u kullanilmaz
    // eger bir method yeni bir data üretmiyorsa sadace belli bir islem yapiyorsa return type void olur.
    public void hareket (){
        System.out.println("Corolla hizli hareket eder...");
    }

    public void dur (){
        System.out.println("Coralla güvenli bir sekilde durur...");
// buraya kadar bizim kalibimiz yani class imiz variable lar var method lar var.

        // runner sayfasindan bunlari cagiriyoruz.
    }



}
