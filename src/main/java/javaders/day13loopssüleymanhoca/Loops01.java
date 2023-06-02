package javaders.day13loopssüleymanhoca;

public class Loops01 {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz


        for (int i = 21; i <181 ; i++) {
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami==>MiAmI

        String s = "miami";

        for (int i = 0; i <s.length() ; i++) {
            String s1 =s.substring(i,i+1);
            if(i%2==0){
                System.out.print(s1.toUpperCase());//MiAmI
            }else{
                System.out.print(s1);
            }
        }

        System.out.println();
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
        String t ="Hello Java";

        for (int i = 0; i<t.length() ; i++) {
           char ch = t.charAt(i);
            if(ch=='a'){
                break;// Looplarda break; if sartina bagli olarak loop u kirmak icin kullanilir.
            }else{
                System.out.print(ch);//Hello J
            }
        }

        System.out.println();
        //verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci==>ict
        String u ="Tokatci";
        for (int i =u.length()-1; i >=0 ; i--) {
           char x = u.charAt(i);
           if(x=='a'){
               break;
           }else{
               System.out.print(x);//ict
           }

        }

















    }//main
}//class
