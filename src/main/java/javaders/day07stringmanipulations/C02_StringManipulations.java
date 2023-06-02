package javaders.day07stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {

        //*******************replaceAll()**************\\
        /*replaceAll() Bir grup datayi degistirmek icin kullanilir.
        Bir Grup Data = Regular Expression(Regex)



        En cok kullanilan Regexler:
        1) Tüm rakamlar ==>[0-9]
        2) Tüm kucuk harfler ==>[a-z]
        3) Tüm buyuk harfler ==> [A-Z]
        4) Tüm Harfler ==>[a-zA-Z]
        5) Tüm harfler ve rakamlar ==>[a-zA-Z0-9]
        6) Tüm sesli harfler ==>[aeiouAEIOU]
        7) Tüm noktalama isaretleri ==> \\p{Punct}

        ^ ==> den farkli, haricinde
        1) Tüm rakamlar ==>[^0-9]
        2) Tüm kucuk harfler ==>[^a-z]
        3) Tüm buyuk harfler ==> [^A-Z]
        4) Tüm Harfler ==>[^a-zA-Z]
        5) Tüm harfler ve rakamlar ==>[^a-zA-Z0-9]
        6)Tüm sesli harfler ==>[^aeiouAEIOU]
        7) Tüm noktalama isaretleri ==> \\p{Punct} ****ornek üzerinde göstericem

         */

        String s ="Mehmet 20 yasinda QA_Developer kursunda $ dolar kazanmistir...";


        //Ex : s String indeki tüm rakamlari "*" ceviriniz.

        String s1 = s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);//s1 = Mehmet Fatih bey ** yasinda QA_Developer kursunda $ dolarla maas kazanmistir...

        //Ex : s String indeki tüm rakamlari ve harfleri "@" ceviriniz.

        String s2 = s.replaceAll("[a-zA-Z0-9]","@");//s2 = M@@@@@ F@@@@ @@@ @@ @@@@@@@ QA@D@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...
        System.out.println("s2 = " + s2);
        //Ex : s String indeki tüm space ler disindaki karakterleri  "+" ya ceviriniz.
        String s3 = s.replaceAll("[^ ]","+");
        System.out.println("s3 = " + s3);//s3 = ++++++ ++ +++++++ ++++++++++++ ++++++++ + +++++ ++++++++++++++

        //Ex : s String indeki tüm kucuk harfler disindaki karakterleri  "*" ya ceviriniz.
        String s4=s.replaceAll("[^a-z]","*");
        System.out.println("s4 = " + s4);//s4 = *ehmet****yasinda*****eveloper*kursunda***dolar*kazanmistir***

        //Ex : s String indeki tüm sesli harfler disindaki karakterleri  "&" ya ceviriniz.
        String s5=s.replaceAll("[^aeiouAEIOU]","&");//s5 = &e&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&&a&a&&i&&i&&&&
        System.out.println("s5 = " + s5);




    }//main
}//class
