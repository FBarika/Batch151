package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));//436
        System.out.println(getTheSumOfSquareOfOdds2(nums));//436
        System.out.println();
        System.out.println(getMultiplicationOfSquareOfEvens1(nums));//147456
        System.out.println(getMultiplicationOfSquareOfEvens2(nums));//147456
        System.out.println();
        System.out.println(getTheSumOfEvenMaxAndOddMin1(nums));//15
        System.out.println(getTheSumOfEvenMaxAndOddMin2(nums));//15
        System.out.println();
        System.out.println(getTheSumOfEvenGreaterThanSevenMaxAndOddMinGreaterThanEight(nums));
        System.out.println();
    }
    //Example 1 : Verilen bir Listteki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){
    return nums.
            stream().
            filter(t-> t%2!=0).//bu sekilde ne zaman yazariz? Mesela methodu bir kere kullanacagiz o zaman bu sekilde yazariz.
            map(t-> t*t).
            reduce(0,(t,u)->t+u);//islem yapmamiza yarayan method toplama icin ilk siraya etkisiz eleman olan "0" i yaziyoruz carpma icin "1"
            //Note: reduce() methodunda toplama isleminde t ilk olarak 0 olur u ise map de yaptigimiz ilk karesini alma sonucunu alir.
            // Sonrasinda t tve u toplaminin sonucunu alir u karesini alma sonucunu alamya devam eder.
            //reduce azaltmak indirgemek anlamina gelir. Ne zaman coklu datayi azaltmak istersek reduce kullanabiliriz.
            //mesela 40 tane yainin en büyügünü bulmak istersek veya 40 tane sayinin carpimini bulmak istersek gibi

    }
    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils ::isOdd).//burada utils class ta yine negatis sayilari alan method olusturduk.
                map(Utils ::getSquare).// burada Math class inda karesini alma olmadigi icin Utils diye bir class olusturduk
                // orada karesini alma methodunu yazdik o class tan bu methodu kullandik.
                // ihtiyaciniz olan method Java Class larinda yoksa Utils Class olusturup icinde ihtiyaciniz olan methodu olusturunuz ve method reference kullaniniz.
                reduce(0,Math ::addExact);//Class ismi :: Method ismi ==> Method Reference
    }
    public static int getTheSumOfSquareOfOdds3(List<Integer> nums) {
        return nums.//Bu sekilde yazima Method Reference denir.
                stream().
                filter(Utils ::isOdd).
                map(t -> t * t).
                reduce(Math ::addExact).get();//Class ismi :: Method ismi ==> Method Reference
                //burada etkisiz elemani sildik bu yüzden get() methodunu ekleyince hatayi handle ettik. optinal integer return ettigi icin etkisiz eleman koymayinca.
    }           //get() methodu Optinal<Integer> i Integer a cevirir.
    //Ex 2 : Verilen bir List teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens1(List<Integer> nums){
      return  nums.stream().
              filter(t-> t%2==0).
              map(t-> t*t).
              distinct().
              reduce(1,(t,u)->t*u);
      //distinct() methodunu tekrarsiz olmasi gereken sayilar mi kareleri mi mesela -4 ile 4 sikinti cikarir.

    }
    public static int getMultiplicationOfSquareOfEvens2(List<Integer> nums) {
        return nums.stream().
                filter(Utils ::isEven).
                map(Utils::getSquare).
                distinct().
                reduce(Math ::multiplyExact).
                get();
    }


    //Ex 3 :Verilen bir Listteki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin toplamini hesaplayan methodu olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin1(List<Integer> nums){
       int maxEven= nums.stream().distinct().filter(t->t%2==0).reduce((t,u)-> t>u ? t : u).get();//burada elemanlari filterdan sirasiyla alir. Yani t mesela ilk elemani u ikinci elemani alacak karsilastiracak.
       int minOdd= nums.stream().distinct().filter(t-> t%2!=0).reduce((t,u)-> t<u ? t : u).get();
       return maxEven+minOdd;
       //yukaridaki reduce() methodu direk kod yazma seklinde olan reduce methodudur. Yani etkisiz elemani yazdigimiz degil.
       // Bu cesidinde return bize optinal int döndürür ve hata verir. Bu hatayi sonuna get() methodu koyarak handle edebiliriz.
       //soruda tekrarsiz demedigi halde max ve minimum degerlere tekrarlilarda bakmaya ihtiyac olmadigi icin distinct kullandik.
    }
    public static int getTheSumOfEvenMaxAndOddMin2(List<Integer> nums) {
        int maxEven = nums.stream().distinct().filter(Utils::isEven).reduce(Math::max).get();//burada elemanlari filterdan sirasiyla alir. Yani t mesela ilk elemani u ikinci elemani alacak karsilastiracak.
        int minOdd = nums.stream().distinct().filter(Utils ::isOdd).reduce(Math ::min).get();
        return maxEven + minOdd;
    }
    //Ex 4: Verilen bir List teki cift sayi olan elemanlarin 7 den kücük max. degeri ile tek sayi olan elemanlarin
    // 8 den büyük minimum degerinin toplamini hesaplayan methodu olusturunuz.
    public static int getTheSumOfEvenGreaterThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){

        int max = nums.stream().distinct().filter(t-> t%2==0 && t<7).reduce((t,u)-> t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t-> t%2!=0 && t>8).reduce((t,u)-> t<u ? t : u).get();

        return max+min;
    }



}
