package practice.b151practices.day05looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
      'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
        String s = input.next();
        int index= s.indexOf("c");
        int counter=0;
        for (int i = 0; i <index ; i++) {
           if(s.substring(i,i+1).equalsIgnoreCase("a"))
            counter++;
        }
        System.out.println(counter);

        //2.yol
        int sayac=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'){
                sayac++;
            }else if(s.charAt(i)=='c'){
                break;
            }
        }
        System.out.println(sayac);


    }//main
}//class
