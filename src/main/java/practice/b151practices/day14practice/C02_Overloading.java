package practice.b151practices.day14practice;

public class C02_Overloading {
    /*ayni classda ayni isimde birde fazla method olusturmak icin overloading yapariz
    Bunun icin;
    1)parametrelerin data type larini degistirebiliriz
    2)parametrelerin sayisini degistirebiliriz
    3)parametrelerin data türleri farkli ise;parametrelerin yerlerini degistirebiliriz.

     */
    public static void main(String[] args) {
        //Soru:Ayni class ta ayni isimde method olusturunuz.
        toplama(55,66);
        toplama(2.3,4.5);
        carpma(1,2,3);
        carpma(1,2,3,4);
        cikartma(3.7,1.3f);
        cikartma(1.3f,3.7);




    }
    //1)parametrelerin data type larini degistirebiliriz
    private static void toplama(int a,int b){
        System.out.println("Iki int deger toplandi: "+(a+b));
    }
    private static void toplama(double a,double b){
        System.out.println("Iki double deger toplandi: "+(a+b));
    }
    //2)parametrelerin sayisini degistirebiliriz
    private static void carpma(int a,int b,int c){
        System.out.println("Uc int deger carpildi: "+(a*b*c));
    }

    private static void carpma(int a,int b,int c,int d){
        System.out.println("Uc int deger carpildi: "+(a*b*c*d));
    }

    //3)parametrelerin data türleri farkli ise;parametrelerin yerlerini degistirebiliriz.
    private static void cikartma(double a, float b){
        System.out.println("Ilki double, ikincisi float cikartma islemi yapildi: "+(a-b));
    }

    private static void cikartma(float b,double a){
        System.out.println("Ilki double, ikincisi float cikartma islemi yapildi: "+(a-b));
    }



}
