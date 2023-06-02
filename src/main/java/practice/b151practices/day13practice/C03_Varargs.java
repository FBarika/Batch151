package practice.b151practices.day13practice;

import java.util.Scanner;

public class C03_Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun(Varrargs)

        // bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız
        // bu methodun access modifiers'ını protected yapıp farklı bir packagedeki farklı bir classdan calıstırınız

        // bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";
        String str5 = "Abdulrezzak";
        String sonuc=enUzunKelime(str1,str2,str3,str4,str5);
        System.out.println(sonuc);


    }

     public static String enUzunKelime(String ... str) {
        String enUzunKelime="";
        for (String w:str) {
            if(w.length()>enUzunKelime.length()){
                enUzunKelime=w;
            }
        }

        return enUzunKelime;
    }

}
