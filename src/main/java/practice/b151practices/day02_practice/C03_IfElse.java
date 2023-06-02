package practice.b151practices.day02_practice;


import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime1 = input.next();
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime2= input.next();
        if (kelime1.length()%2==0){
            String s1 = kelime1.substring(0,kelime1.length()/2);
            String s2 = kelime1.substring(kelime1.length()/2);
            System.out.println(s1+kelime2+s2);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }


    }//main
}//class
