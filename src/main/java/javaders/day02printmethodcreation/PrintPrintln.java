package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintPrintln {
    public static void main(String[] args) {

        /*
        \n ==> bir alt satira gecirir.
        \t ==> bir tab bosluk brakir. harf sayisi önemlidir yoksa esit bosluk birakmaz. mesela kelimeler 5 harf icermeli


         */

        //"TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz.

        //1.YOL
        System.out.println("*********1.Yol**********");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//Hiclik de olur
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //"TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdiriniz.
        System.out.println("************2.Yol************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        // bosluk birakmak icin iki tane \n koyuyoruz.

        // JAVA ILE GUZEL DUNYA cümlesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini 1 tab bosluk birakan
        //  kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("Techpro ile java cok kolay");//Techpro ile java cok kolay
        System.out.println("\"Techpro \" ile java cok ' kolay '");//"Techpro " ile java cok ' kolay '
        // tek tirnakta slash a gerek yok tirnak koymak icin \" koyuyoruz.
        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz

        System.out.println("\" MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Print ile Println arasindaki fark

        System.out.println("Hayat Techpro ile cok guzel");
        System.out.println("Ama nasil baktiginiza bagli");
        System.out.print("Yeterki siz isteyin");
        System.out.println(" Barika");

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
          A
         A A
        A A A
        */
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir karakter veriniz");

       /* int sayi = input.nextInt();
        long a = input.nextLong();
        short b = input.nextShort();

       */
        char ch = input.next().charAt(0);// Ali HAKKI

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
        // Kullanici birden fazla karakter girse de char ilk karakteri alir




    }//main
}//class
