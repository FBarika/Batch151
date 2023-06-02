package javaders.day15loopsarrayssüleymanhoca;

import java.util.Arrays;

public class Arrays01 {
    /*
    1)Array, Java'nin "ayni data tipinde" coklu data depolamak icin olusturdugu bir yapidir.Array icinde farkli data tipi koyamayiz int sa hepsi int olmali.
    2)Array ler primitive data type lari veya "reference" lar ile calisir.mesela stringlerde koydugumuz ismin referansini barindiriyor.
    3)Array lerin "super fast" dir ve memory de cok az yer kaplarlar.Bunun icin de primitive kullanmasi gerekir non primtive hizli olmaz.
    */
    public static void main(String[] args) {
        //Array nasil olusturulur?
     String stdNames []=new String [5]; // ikinci string parantezinin icine data sayisi yazilir.

        // Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null,null,null,null,null]<== null lar String in default degerleridir.
       // boolean larini default degeri false dur.

        //Array e nasil eleman eklenir?
        stdNames[0]="Ajda"; // array ismi+ pranteze index numarasi yazip string i yerlestiriyoruz.
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda,Ayhan,Kemal,Cuneyt,Filiz] array in ismini direk yazdirirsak
        // reference(bu bilgisayardan bilgisayara farklilik gösterir memory ler farkli oldugu icin) yazdirir java


        //Array deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);// sadece bir eleman almak icin böyle yazdiriyoruz.

        // Example1: stdNames array indeki her ismin sonuna yildiz koyarak console a yazdiriniz.
        //1.Way:
        for(int i=0; i<stdNames.length; i++){ //lenght stringlerde parantezli(method); array lerde parantezsiz(method degil) kullanilir.Cünkü biy yukarida zaten eleman sayisini veriyoruz.[5] gibi
            System.out.println(stdNames[i]+ "*");

        }

        //2.Way: for-each loop==>Enhanced(Zenginlestirilmis) Loop - Mümkünse hep for-each loop kullanin.Degilse digerleri kullanilir. array lerde kullaniliyor.
        for(String w :stdNames){
            System.out.println(w+ "*");

        }

        // Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console a yazdiriniz.

        int numbers []=new int [5];
        System.out.println(Arrays.toString(numbers));//[0, 0, 0, 0, 0]
        numbers[0]= 12;
        numbers[1]=34;
        numbers [2]=67;
        numbers [3]=89;
        numbers [4]=34;
        System.out.println(Arrays.toString(numbers));//[12, 34, 67, 89, 34]
        int sum=0;
        for(int w :numbers){
           sum =sum+w;
        }
        System.out.println(sum);//236

        // Example 3 : Bir Char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console a yazdiriniz.
        char sembols []= new char[3];
        System.out.println(Arrays.toString(sembols));
        sembols [0] = 'A'; //65
        sembols [1] = 'B'; //66
        sembols [2] = 'C'; //67
        System.out.println(Arrays.toString(sembols));
        int multiply=1;
        for(char w: sembols){
            multiply=multiply*w;
        }
        System.out.println(multiply);//287430 ascii degerlerinin carpimi




























    }//main
}//class
