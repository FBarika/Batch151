package practice.smallstudygrup.passbyvalueoverloading;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
        /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[]={7,15,38,72};
        System.out.println("Methodtan once array"+Arrays.toString(arr));//[7, 15, 38, 72]
        arrayElemanDegistir(arr);////[7, 86, 38, 80] random dan 1 ve 3 index e rastgele eleman geldi.
        System.out.println("Methodtan sonra array"+Arrays.toString(arr));//[7, 86, 38, 80] burada array in elemanlari korunmamis oldu array in yapisi degismedigi icin
        // ama  mesela eleman sayisini 3  e indirirsek yapisi bozulmus olacak ve methodtan sonra array seklinde yazdirdigimizda
        // eski 3 elemanli halini degil 4 elemanli eski halini yazdiracak yapi degistigi icin.
        // Yani biz Array in yapisini dehistirmeden elemanlarini degistirirsek korunma söz konusu olmuyor.
       /*
     verilen 4 elemanli bir array'i method'a gonderelim method'da yeni 3 elemanli
     bir array atayip bu yeni array'e rastgele
     100'den kucuk 3 sayi atayalim method da arrray'i yazdiralim
     main method'da da method call'dan sonra yeniden method'u yazdiralim
      */
        arrayDegistir(arr);
        System.out.println("Methodtan sonra array"+Arrays.toString(arr)); // buarda 4 elemanli yukarida eleman degismis halini yazdiracak yani.
        arrayIsimDegistir(arr);
        System.out.println("isim degistikten sonra"+Arrays.toString(arr));

    }

    private static void arrayIsimDegistir(int[] arr) {
        int array[]=arr;
        array[0]=56;
        System.out.println("isim degistir method ici"+Arrays.toString(array));
    }

    private static void arrayDegistir(int[] arr) {

        arr=new int[3]; // artik 3 elemanli olsun diye böyle yaptik.
        Random rnd=new Random(); //sonra random class indan elemanlar atadik.
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("Method icinde array"+Arrays.toString(arr));

    }

    private static void arrayElemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("method icinde array "+ Arrays.toString(arr));


    }
}
