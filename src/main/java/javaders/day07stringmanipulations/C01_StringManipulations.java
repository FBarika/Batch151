package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //***************endsWith***************//
        /*
        endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir
                  True yada false seklinde boolean bir deger dondurur.
                  Icerisine tek karakterde coklu karakterde koyabilirsiniz

         */

        //Ex : s String inin "money" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//isEnd = true // "money" sonunda var mi yok mu diye kontrol eder.

        String s2 = "Learn Java earn money";

        boolean iceriyorMu= s2.contains("money");
        System.out.println("iceriyorMu = " + iceriyorMu);// icerisinde "money" var mi yok mu kontrol eder.

        /*
        contains() methodu cümlenin herhangi bir yerinde istenilen dtayi bulursa true döndurur.
        Ancak task in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin
        endswith() kullanmaliyiz.

         */

        //***************************replace()***************//

        //Ex.s String indeki "money" kelimesini "dollar" kelimesi ile yer degistirelim.

        String s1= s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar

        //Ex: s Stringindeki earn kelimesini win kelimesine ceviriniz.

        String s3= s.replace("earn","win");
        System.out.println("s3 = " + s3);//s3 = Lwin Java win money

        //Ex: s Stringindeki a harfini * isareti ile ceviriniz.
        String s4 = s.replace('a','*');
        System.out.println("s4 = " + s4);//s4 = Le*rn J*v* e*rn money
        String s7 = s.replace('a','*'); //tek karakter ise char container ina koymak daha iyi daha hizli calismasi icin.
        String s5 = s.replace("a","*");
        // String s6 = s.replace("a",'*'); ya ikisi de char olacak ya da String olacak.

        //Ex: s Stringindeki "L" harfini "***" isareti ile ceviriniz.

        String s8 = s.replace("L","***");//ikisi de String olmak zorunda oldugu icin cift tirnak icine alacagiz.
        System.out.println("s8 = " + s8);//s8 = ***earn Java earn money

        //Ex: s Stringindeki tüm "e" harflerini siliniz.
        String s9 = s.replace("e",""); // burada char olmaz char da hiclik olmaz.String olacak.
        System.out.println("s9 = " + s9);//s9 = Larn Java arn mony
        String s10 = s.replace('e',' ');// burada sorunun cevabi olmuyor 'e' yerine bosluk koymus oluyoruz.
        System.out.println("s10 = " + s10);//s10 = L arn Java  arn mon y
        // space ile silme yapilmaz.Space in java icin bir anlami vardir ve bir karakterdir.
        //Taskte istenilen saglanmamis olur.// char da hiclik olmuyor boslukla kirmizi yanmiyor onda da boslukla silme yapiliyor.

        //Ex: s Stringindeki tüm "earn" kelimelerini siliniz.

        String s11= s.replace("earn","");
        System.out.println("s11 = " + s11);//s11 = L Java  money

        String t = "Dolma Kalem";
        // Ex : t String indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz.

        String t1 =t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);//t1 = Dolma Biber




        



    }//main
}//class
