package javaders.day08stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //***************replaceFirst()**************\\
        /*
        replaceFirst() : replace() ile ayni isi yapmakla birlikte ilk gördügü datayi degistirir.
        */
        String str = "Bizimle Java Ogrenmek Cok Kolay";
        //Ex:str String indeki ilk gördügü "a" harfinin yerine "e" harfi yerlestiriniz.

        String str1 = str.replaceFirst("a", "e");
        System.out.println("str1 = " + str1);//str1 = Bizimle Jeva Ogrenmek Cok Kolay ilk "a" harfi degisti.

        String str2 = str.replace("a","e");
        System.out.println("str2 = " + str2);//str2 = Bizimle Jeve Ogrenmek Cok Koley //bütün "a" harfleri degisti.

        //********************************trim()************************\\

        /*
        trim() Bir String de bastaki ve sondaki space karakterlerini siler. Ortadaki space karakterlerine dokunmaz.

         */
        //Ex: isim Stringindeki varsa bas sondaki space leri siliniz.
        String isim="   Mehmet Fatih Yildirim  ";
        System.out.print("********************");
        System.out.print(isim);
        System.out.print("********************");
        String isim1= isim.trim();
        System.out.print(isim1);
        System.out.print("********************");
        System.out.println();


        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = "599.99$"   String laptop = "299.99$"
        String tv = "599.99$";
        String laptop = "299.99$";
        String tv2= tv.replace("$","");//"599.99"
        System.out.println("tv2 = " + tv2);
        String laptop2 = laptop.replace("$","");//$ gordugun yere hicbirsey koyma ; yani $ sembolunu sil
        System.out.println("laptop2 = " + laptop2);//"299.99"

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice +"$");//totalPrice = 899.98$

        /*
        valueOf()  bize String olan bir datayi sayisal bir
        degere yani islem yapabilecegimiz
        bir degere ceviriyor
        */

        String tamIsim = "  mehmet fatih  ";

        //Ex: Verilen tam isim String inin icindeki ilk ismin ilk harfi ile son ismin ilk harfini büyük harf olarak yan yana yazdiriniz. ==>MF

        char first = tamIsim.trim().toUpperCase().charAt(0);//M

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);//F
        System.out.println("first+second = " + first + second);//first+second = MF
        System.out.println(first + second);//147 ascii yazdiriyot string olmadigi icin
        //split methodu kelimeyi/ cümleyi bölmeye yariyor.kullandigimiz karakter kaybolarak o karakterden ikiye böler.
        // parcaladiktan sonra ikiye bölünce birinci mi ikinci mi [] parantezin icine yaziyoruz.

    }//main
}//class
