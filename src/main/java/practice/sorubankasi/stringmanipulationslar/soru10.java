package practice.sorubankasi.stringmanipulationslar;

public class soru10 {
    public static void main(String[] args) {
        /*
        10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
olmadığını kontrol etmek için kod yazınız.
Örnek:‘Ali Can’ için konsolda false yazmalıdır.
 ‘ Ali Can ’ için konsolda false yazmalıdır.
 ‘ Ali Can ’ için konsolda false yazmalıdır.
 ‘Ali Can’ için konsolda true yazmalıdır.
       */
        String str ="Alican ";
        String str1=str.trim();
        if(str.replaceAll("[^ ]","").length()==1 && (!str.substring(0,1).equals(" ")&& !str.substring(str.length()-1,str.length()).equals(" "))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
















    }
}
