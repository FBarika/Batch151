package practice.sorubankasi.loopslar;

import java.util.Scanner;

public class Loopsilk9Soru {
    public static void main(String[] args) {
        /*
        1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız.
        */
        for (int i = 120; i>4 ; i--) {
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");//120 108 96 84 72 60 48 36 24 12
            }
        }
        System.out.println();

        /*
        2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; "accessories" ´ ces
         */
        String s="accessories";
        String result ="";
        for (int i = 0; i <s.length() ; i++) {
            String s1 =s.substring(i,i+1);
            if(s.indexOf(s1)!=s.lastIndexOf(s1) && !result.contains(s1)){
                result=result+s1;
            }
        }
        System.out.println(result);//ces

        /*
        3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */

        String k="anna";
        String c="";
        for (int i = k.length()-1; i>=0 ; i--) {
            String k1 =k.substring(i,i+1);
            c=c+k1;
        }
        if(k.equals(c)){
            System.out.println("Bu bir palindromdur.");
        }
      /*
      4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
Örnek; 223878 ´ 37
       */
        String sayi="223878";
        int sonuc=0;
        for (int i = 0; i <sayi.length() ; i++) {
            String sayi1=sayi.substring(i,i+1);
            if(sayi.indexOf(sayi1)==sayi.lastIndexOf(sayi1)){
                System.out.print(Integer.valueOf(sayi1));//37
            }
        }
        System.out.println();

        /*
        5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A
A A A A A
A A A A A
         */
        int satir=3;
        int sütun=5;

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sütun ; j++) {
                System.out.print("A"+" ");
            }
            System.out.println();
        }
        /*
        6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
         */
         int satir1=5;
        for (int i = 1; i <=satir1 ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print("A"+" ");
            }
            System.out.println();
        }
        /*
        7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();
        for (int i =1; i <11 ; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }

        /*
        8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
bırakarak yazdırmak için gereken kodu yazınız.
         */

        for (int i =20; i>2 ; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        /*
        9) String içindeki tüm küçük harfler disindakileri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 'Ali Can?' ==> l*i*a*n*
         */
        String kelime="Ali Can?";
        String m = kelime.replaceAll("[^a-z]","");
        String l="";
        for (int i = 0; i <m.length() ; i++) {
           String j= m.substring(i,i+1);
           l=l+j+"*";
        }
        System.out.println(l);//l*i*a*n*








    }//main
}//class
