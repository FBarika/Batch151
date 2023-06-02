package javaders.day17multidimensionalarraypassbyvaluesüleymanhoca;

import java.util.Arrays;

public class MultiDimensionalArray01 {//cok boyutlu array demek.
         /*
        1)Bir array in elemanlari da array olursa bu tarz array lere "Multidimensional Array denir

         */
    public static void main(String[] args) {
        //"Multidimensional Array" nasil olusturulur == cok boyutlu array ama iki boyutlu ögrenmek yeterli

        String names [][] = new String[3][2];//Bu yöntemde arrayler ic array ler esit sayida eleman icermek zorundadir.
        // Ama kisa yoldan eleman eklemede ic arraylere istedigimiz kadar eleman ekleyebiliyoruz.
        // Su an elemanlar null cünkü string lerin default degeri null dir.
        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";
        //"Multidimensional Array" leri console a yazdirmak icin "toString()" methodu degil
        // "deeptoString()(dibine kadar gir string i bul) methodunu kullaniniz.to String le referanslarini görürüz.
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]
                                                       //   0        1      2         arraylerin index leri icindekilrin indexi 0,1 seklinde
        //"Multidimensional Array" icinden specific bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);//M

        //"Multidimensional Array" icindeki bir arrayi yazdirmak nasil olur?
        System.out.println(Arrays.toString(names[0]));//[A, K]

        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kisa yoldan Multidimensional Array nasil olusturullur?

        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ex 1: Yukaridaki students array inde toplam kac isim oldugunu bulunuz.
        int sum= 0;
        for(String[] w : students){
            sum=sum+w.length;
        }
        System.out.println(sum);
        //Ex 2: Yukaridaki students array inde icinde "m" olan isimleri console a yazdiriniz.
        for(String[] w: students){

            for(String k : w){
                if(k.contains("m")){
                    System.out.println(k);//Kemal,Cemal
                }
            }
        }

        //Bir integer multidimensional array olusturunuz tüm elemalarinin carpimini hesaplayiniz.

        int nums [][]= {{2,5},{6,7}};;
        int carpim =1;
        for(int [] w:nums){

            for(int k : w){
                carpim=carpim*k;
            }
        }
        System.out.println(carpim);//420
        // Ex 4: iki boyutlu bir array i tek boyutlu bir array e ceviriniz.

        int numbers [][] ={{5,4},{2,3,2},{7}};// ==>{5,4,2,3,2,7}

        //1. adim : iki boyutlu array de kac eleman  oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int [] w : numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }
        //2. adim : tek boyutlu arrayi iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz.
        int newArr []= new int[toplamElemanSayisi];
        //3.adim  : iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyim.
        int idx =0;
        for(int [] w : numbers){
            for(int k : w){

                newArr[idx]=k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));// [5, 4, 2, 3, 2, 7]

        //Ex 5 : Bir integer multidimensional array deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int multi [][] ={{15,4},{12,43,21},{7}}; //==> 4+43=47
        int small = multi [0][0];
        int big = multi [0][0];
        // { {15, 4}, {12, 43, 21} }
        for(int[] w : multi){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);





    }//main
}//class
