package javaders.day21datetimevarargssüleymanhoca;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5, 2, 4, 3));
        System.out.println(add(5, 2));
        System.out.println(add(5));
        System.out.println(add(5, 3));
        getInitials("Ali Can","Kemal Han","Tuncay Cinar","Ibrahim Catal");

    }//main
    //Ex 1:Toplama islemi yapan bir method olustur.

    //Asagidaki gibi farkli methodlar olustururak is yapamayiz.Cünkü kullanici farkli sayidaki sayilari toplamak isteyebilir.
    // Her ihtimal icin bir method olusturmak mümkün degildir.
    /*
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    */


    //Farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    // Bu yapiya "Varargs" denir.
    //Varargslar arkada "Array" yapisi kullanir.

    /*
     1)Bir method parantezinde bir'den fazla Varargs kullanilamaz.
     2)Bir method paratenzinde bir'den fazla parametre kullanilacaksa varargs en sonda olmalidir.
     3)
     */
                          // ıkıncı varargs Strıng olsa bıle olmaz. Cunku String bir deger yazmaya calisacaksak bile int sepetine koymaya calisacak.
    public static int add(int... a){//ekstra int.....b yazilmaz. Java int....a hep kullanacagi icin int...b unused code olur . Bu hata olur.
        int sum=0;
        for (int w:a) {
            sum=sum+w;
        }
        return sum;
    }
    //Ex 2 : Verilen isimlerin ilk harflerini console yazdiran methodu olusturunuz.
    //  Ali Can ==> AC      Kemal Han ==>KH

    public static void getInitials(String... s){

        String initials = "";

        for (String w: s){
            initials=initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";
        }

    }

    //varargslar bos birakilabilr ama diger data type larina main methodtan mutlaka deger atamamiz gerekir yokda CTE verir.


}//class
