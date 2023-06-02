package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    java da Method nasil olusturulur?
    1)main method un disinda class in icinde olusturulur
    2)Access Modifier + return type + method ismi +()+{}

    Olusturulan method nasil kullanilir?
    1)main method un icinden kullanilir
    2)method un ismi yazilir sonra +() yazin
    3)Islem yapacagimiz parametreleri parantez icine koyun
    // önce method olusturuluyor sonra main method un icinden cagirma islemi yapiliyor. !!!!!!!
     */
    public static void main(String[] args) {
        int sonuc = toplamaYap(3,5);// toplama yap methodunu int sepetine koyduk sonra sout la yazdirdik.
        System.out.println(sonuc);

        long carpmaSonuc = multiply(3,6);// bburda üretilen datayi long sepetinde sakliyoruy sonra yazdiriyoruz.
        System.out.println(carpmaSonuc);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(ucluSonuc);

        double kupAl= ondalikSayininKupu (3.5);
        System.out.println(kupAl);
        /*
        YA DA System.out.println(kupAl(a:3.5)); yani sepete koymadan da yazdirabiliyoruz.

         */
        print("Hello World");

    }//main
    //Ornek 1: toplama islemi yapan bir method olusturunuz
    //main method static oldugu icin main method icerisinden kullanacaginiz her sey static olmalidir.
    public static int toplamaYap (int a, int b) {

        return a+b;
    }
    //Ornek 2: 2 sayiyi carpma islkemi yapan bir method olusturunuz
    protected static long multiply (int a,int b ){

        return a*b;
    }
    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz.
    private static int firstTwoMultiplyThirdAdd(int i, int j, int k){
        return i*j+k;

    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplama methodu olusturup kullaniniz.
    //NOTE:ACCESS MODIFIER I DEFAULT YAPMAK ISTIYORSAK ACCESS MODIFIER YAZMAYINIZ.
     static double ondalikSayininKupu (double a){

        return a*a*a;
    }
    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print (String str){

        System.out.println(str);
    }
    //methodun return type i void ise method body icinde "RETURN" keyword yazilmaz.baska non primitive lerde return kullanilabilir ama.
    // eger bir method yeni bir data üretmiyorsa return type i void olur.
    //shift+f10 run olur






}//class

