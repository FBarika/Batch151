package javaders.day14loopssüleymanhoca;

import java.util.Scanner;

public class Loops02tekrar {
    public static void main(String[] args) {

        // 21 de 180 e kadar hem 4 hem de 6 ile bölünebilen tam sayilari console a yazdiriniz.
        int i =21;
        while(i<181){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
            }
            i++;
        }
        System.out.println();
        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
         String s= "miami";
         int a =0;
         while(a<s.length()){
            String ch =s.substring(a,a+1);
             if(a%2==0){
                 System.out.print(ch.toUpperCase());
             }else{
                 System.out.print(ch);//MiAmI
             }
             a++;
         }


        System.out.println();
        //Size verilen tam sayinin rakamlarinin toplamini console yazdiran kodu yaziniz.
         Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        String number = input.next();
        int sum=0;

        int k=0;
        while(k<number.length()){
            String v = number.substring(k,k+1);
            sum=sum+Integer.valueOf(v);
            k++;
        }
        System.out.println(sum);

        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz.
        //3*1=3 3*2=6 3*3=9 ...3*10=30
        System.out.println("Lütfen bir sayi giriniz.");
        int num = input.nextInt();
        int carpim =1;
        while(carpim<11){
                    System.out.println(num+" x"+carpim+"="+(num*carpim));
           carpim++;
        }



        //Kullanicidan aldiginiz String deki sessiz harfleri console yazdiran kodu yaziniz.
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime =input.next();
        int d =0;
        while(d<kelime.length()){
            char ch= kelime.toLowerCase().charAt(d);
            if(!(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')){
                System.out.print(ch+" ");
            }
            d++;
        }



















            /*
            if (!ö) {

                System.out.print(ch);// sesli harf degilse yazdir.bu yol daha kolay
                  }
                z++;
                     }
            */
        //continue for loop da problemsiz calisir ama while da dikkat etmemiz gerekir.










    }//main
}//class
