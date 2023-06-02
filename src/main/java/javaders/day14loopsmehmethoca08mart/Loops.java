package javaders.day14loopsmehmethoca08mart;

public class Loops {
    public static void main(String[] args) {
        //Ex 1:Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String s ="Pwd12?Ab"; //fori yaz enter kisa yol
        for (int i = 0; i <s.length() ; i++) {
            char k= s.charAt(i);
            if(k>='a' && k<='z'){
            continue;
            }else{
                System.out.print(k);
            }
        }// bu soru replaceAll() methodu ile de cözülür.
        //break ile continue arasindaki fark nedir?
        // break switch in disina icin loop u kirmak icin kullanilir.
        // continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir.
        System.out.println();


        //Ex 2:Bir sting i ters ceviren kodu giriniz.
        //"Java" ==> "avaJ"
        //1.Yol***********************
        String t ="Java";
        String ters= "";

        for (int i =t.length()-1; i>=0; i--) {
          ters=ters + t.substring(i,i+1);
        }

        System.out.println(ters);

        System.out.println();


        //2.Yol*****************************
        String t1 ="Java";
        String ters1= "";

        for (int i =t.length()-1; i>=0; i--) {
            ters1=ters1 + t.charAt(i);// burda char ile string i concat yapmis olduk
        }

        System.out.print(ters1);

        System.out.println();
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5+7+8 = 20
        int sayi=578;
        int sum =0;
        for (int i = sayi; i>0 ; i=i/10) {
           sum=sum+i%10;
        }
        System.out.println(sum);//20
        System.out.println(Short.MAX_VALUE);


    }//main
}//class
