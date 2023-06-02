package practice.sorubankasi.loopslar;

import java.util.Arrays;
import java.util.Scanner;

public class Soru26 {
    public static void main(String[] args) {
        /*
        26) Kullanıcıdan bir String ve bir karakter alınız.
String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
sayısını sayınız.
Boşluk karakterlerini saymayınız.
Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda 1,
Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
Örneğin; "Java is easy" - 'a' ==> 5
 "Java is easy" - 'w' ==> -1
 "Java is easy" - 'e' ==> 1

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir String giriniz");
        String s =input.nextLine();
        System.out.println("Lütfen bir karakter giriniz");
        String ch =input.next().substring(0,1);
        s=s.replace(" ","");
        int a=0;

            if(s.indexOf(ch)!=s.lastIndexOf(ch)){
               a=s.lastIndexOf(ch)-s.indexOf(ch)-1;
                System.out.println(a);
        } else if (s.indexOf(ch)==s.lastIndexOf(ch) && s.indexOf(ch)!=-1) {
                System.out.println(1);
            }else {
                System.out.println(-1);
            }










    }
}
