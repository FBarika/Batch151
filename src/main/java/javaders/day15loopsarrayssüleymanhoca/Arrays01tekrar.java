package javaders.day15loopsarrayssüleymanhoca;

import java.util.Arrays;

public class Arrays01tekrar {
    public static void main(String[] args) {
// Example1: stdNames array indeki her ismin sonuna yildiz koyarak console a yazdiriniz.
        String stdNames []=new String [5];
        stdNames[0]="Ajda"; // array ismi+ pranteze index numarasi yazip string i yerlestiriyoruz.
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

       //1. yol while do while da kullanilabilir.

        for (int i = 0; i < stdNames.length ; i++) {
            if(i<stdNames.length-1){
                System.out.print(stdNames[i]+"*, ");//Ajda*, Ayhan*, Kemal*, Cuneyt*, Filiz*,
            }else if(i==stdNames.length-1){
                System.out.println(stdNames[i]+"*");
            }
        }

        System.out.println();
        //2.yol
        int i =0;
        for (String w:stdNames) {
            if (!w.contains(stdNames[stdNames.length-1])) {
                System.out.print(w + "*, ");//Ajda*, Ayhan*, Kemal*, Cuneyt*, Filiz*,
            } else {
                System.out.print(w + "*");
            }
        }
        System.out.println();
            // Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console a yazdiriniz.
           int number []= {3,2,6,8,9};
            //1.yol
             int sum=0;
        for (int w:number) {
            sum=sum+w;
        }
        System.out.println(sum);//28
            //2.yol
        int sum1 =0;
        for (int j = 0; j <number.length ; j++) {
            sum1=sum1+number[j];//28

        }
        System.out.println(sum1);

            // Example 3 : Bir Char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console a yazdiriniz.
           char ch []={'a','b','c'};
           int multi=1;
        for (char w:ch) {
            multi=multi*w;
        }
        System.out.println(multi);//941094
            //initials ilk harfler demek ingilizcesi



    }//main
}//class
