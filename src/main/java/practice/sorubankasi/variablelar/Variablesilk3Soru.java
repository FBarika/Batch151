package practice.sorubankasi.variablelar;

public class Variablesilk3Soru {
    public static void main(String[] args) {
        /*
        1)Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
       toplamını konsola yazdırınız.  */

        double a = 3.99;
        double b = 2.99;
        double c = 5.99;
        System.out.println(a + b + c);//12.97


/*2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
*/
        int num1 =34;
        long num2=334444444444L;
        float num3=4.6F;
        System.out.println(num1*num2*num3);//5.2307111E13
        /*
        3) Basit faizi bulmak için bir kod yazınız.
Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */

      int anapara=1000; int oran=6; int yil=5;
        System.out.println("result="+(anapara*oran*yil)/100);//result=300













    }
}
