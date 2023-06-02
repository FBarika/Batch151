package javaders.day13loopssüleymanhoca;

public class Loops02 {
    public static void main(String[] args) {
        // Verilen bir String de kücük harfleri yazmayiniz.
        //"Pwd12?Ab"==>P12?A
        String s = "Pwd12?Ab";
        for (int i = 0; i <s.length() ; i++) {
           char ch = s.charAt(i);
           if(ch>='a' && ch<='z'){
               continue;// devam et bosver demek loopu kirmadan loop un icinden devam eder okumaya
           }else{
               System.out.print(ch);//P12?A

           }

        }
// break ve continue nun farkli break bizi loop un disina atar continue bizi increment e götürür loop calismaya devam eder.
//break looplarda veya switch statement lerde kullanılabilir.
// continue ise loop yaparken bazı elemanları işleme sokmamada kullanılır.
//continue break bunlara keyword denilir.
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
        System.out.println();
    // Bir String i tersten yazdiran kodu yaziniz
    String k = "Barika";
    //************* bu yol string i sadece console da  tersten yazdiran kod.
        // Yeni olusan ters datayi yeni bir String  konteynerina dönüstürmek icin asagidaki yollar gecerli!!!!!!!
        for (int i =k.length()-1; i>=0 ; i--) {
            String k1 = k.substring(i,i+1);
            System.out.print(k1);
        }
        System.out.println();
    //1.yol bu yolda ayri bir string konteynerinda ters bir sekilde görmüs oluyoruz.
        String t ="Java";
        String ters ="";
        for (int i =t.length()-1; i>=0 ; i--) {
           ters= ters+t.substring(i,i+1);

        }
        System.out.println(ters);// bunu loop un disinda yazarken en son halini görmus oluruz icinde yazarsak tum adimlari yazdirir.
        System.out.println();
    //2.yol
        String t1 ="Java";
        String ters1 ="";
        for (int i =t.length()-1; i>=0 ; i--) {
            ters1= ters1+t1.charAt(i);

        }
        System.out.print(ters1);
        //string ile char' in arasina "+" koyarsak sonuc string olur concat tan dolayi.

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==> 5+7+8 =20
        int sayi =578;
        sayi=Math.abs(sayi);
        int sum =0;
        for (int i =578; i>0 ; i=i/10) {
            sum=sum+i%10;

        }
        System.out.println(sum);
















    }//main
}//class
