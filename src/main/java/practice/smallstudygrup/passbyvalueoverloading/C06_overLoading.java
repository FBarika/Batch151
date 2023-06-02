package practice.smallstudygrup.passbyvalueoverloading;

public class C06_overLoading {public static void main(String[] args) {
  /*
      3 tane toplam isimli method olusturalim 1. methdodda 2 tane int deger toplayalim
      2. methodda 1 tane double 1 tane int deger toplayalim
      3. methodda 2 tane double deger toplayalim
*/
    toplam(7.6,5.5);
    toplam(8.9,1);
    toplam(7,5);


}
    private static void toplam(int a,int b){
        System.out.println(a+b);

    }
    private static void toplam(double a,int b){
        System.out.println(a+b);

    }
    private static void toplam(double a, double b) {
        System.out.println(a+b);
    }
}
/*
overLoading ayni classta birkac tane ayni isimli method varsa o methodlarin data typelarina
bakarak en uygun olani secer biz buna autoWiding deriz yani bilgisayari rahatlatmak adina
en uygun olani secmesi deriz
*/

