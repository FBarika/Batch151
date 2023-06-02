package javaders.day42lambda;

import javaders.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(getSumInTheGivenRange(10, 7));//34
        System.out.println();
        System.out.println(getMultiplicationInTheGivenRange(10, 7));//5040
        System.out.println();
        System.out.println(getSumOfDigitsInTheGivenRange(47, 45));//25


    }
    //Swap icin bir tane private method olustur
    static List<Integer> list =new ArrayList<>();
    private static List<Integer> swap(int starting,int ending){
        if (starting > ending) { //bu kod ile baslangic sayisi büyük olursa diger sayiyla yer degistirme kodunu yazdik.
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan methodu olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
        List<Integer> list =swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)).sum();
        //IntStream bize integer i stream in icinde verir.
        //rangeClosed() ilk sayi büyük oldugunda calismiyor 0 veriyor.
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan methodu olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending) {
        List<Integer> list =swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3:45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan methodu olusturunuz.
    //45,46,47==> 4+5+4+6+4+7 =30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {

        List<Integer> list =swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)).map(Utils::getSumOfDigits).sum();

    }
    /*
swap methodu başlangıç değeri ikinci değerden büyükse değerlerin yerini değiştirir. sadece if kısmı yapılırsa değişimi bize vermez.
 başlangıç ve bitiş değerlerini yani çoklu değeri depolamak için list kullanırız. array de kullanılabilir
 list in içine starting yani başlangıç değerini, ending yani ikinci değeri aldık. example1 de
 get 0 ve get 1 yazdık çünkü indexlerini yazdık
  */
}
