package practice.b151practices.day11practice;

public class C02_Static {

    static String okulIsmi ="Yildiz Koleji";

    static int okulNo;//instance ve static variable lara deger atamak zorunda degiliz.

    static boolean okulAcikMi;

        /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

        */
        public static void main(String[] args) {
            //static variable lara, class icerisindeki tüm methodlardan direk ulasabiliriz.

            System.out.println(okulIsmi);//Yildiz Koleji
            System.out.println(okulNo);// 0 
            System.out.println(okulAcikMi);//false
            
            /////////////////////////////////////////////////////////////
            
            //Static variable lar gökteki ay gibidir
            //Static variable lar class a baglidir.
            //Static variable larin degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar.
            
            okulNo=102;

            System.out.println(okulNo);//102
            
            staticMethod();
            System.out.println(okulNo);//200
            
            

            
        }

    private static void staticMethod() {
            okulNo=200;
        System.out.println(okulNo);//200
    }

}
