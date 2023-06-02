package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");

        //Varolan String nasil ters cevrilir?
        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);// burada orijinal deger degistikten sonra 6 yi öyle sayacagiz.
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//baslangic index indan bitis index ine kadar olan karakterleri siler.
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//replace(2,5,"X") ==> 2 dahil, 5 haric ==> index 2,3 ve 4 deki characterler yerine X koyar.
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"2023");// ilk 3 karakterden sonra sunu ekle
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        int r1 = sb2.compareTo(sb3);//karsilastirma methodu alfabetik olarak karsilastirir.burda -1 veriyor sb2 sb3 ten bir önce anlaminda.
        System.out.println(r1);//Sonuc 0 ==> Alfabetik olarak ayni siradalar demektir.ascii degerlerine göre karsilastirma yapiyor sonuc int döndürüyor.
                               //Sonuc mesela -3 yazarsa sb2 , sb3 den alfabetik olarak 3 önde demektir.
                               //Sonuc mesela 3 yazarsa sb2 , sb3 den alfabetik olarak 3 sonra demektir.

        //StringBuilder nasil String e cevrilir?
        //sb2.toString();//String buildere Stringe ceviriyor sebebi ise String methodlari cok zengindir bazaen
        // String de bulunan bir methodu kullanmak isteriz bu yuzden ceviririz.
        String str = sb1.toString().toUpperCase();
        System.out.println(str);// String YSX2023VAJ

        //String nasil StringBuilder e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);//bununla tekrar StringBuilder a cevirdik.
        System.out.println(newSb1);// StringBuilder YSX2023VAJ

     StringBuilder strBld = new StringBuilder("Learn");
        strBld.trimToSize();
        System.out.println(strBld);















    }//main
}//class
