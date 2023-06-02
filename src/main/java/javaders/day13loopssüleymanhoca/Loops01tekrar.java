package javaders.day13loopssüleymanhoca;

public class Loops01tekrar {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for (int i = 180; i > 21; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");//180 168 156 144 132 120 108 96 84 72 60 48 36 24
            }
        }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami==>MiAmI

        String s = "miami";

        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(s1.toUpperCase());
            } else {
                System.out.print(s1);//MiAmI
            }
        }
        System.out.println();
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
        String k = "Hello Java";
        for (int j = 0; j < k.length(); j++) {
            char ch = k.charAt(j);
            if (ch == 'a') {
                break;
            } else {
                System.out.print(ch);//Hello J
            }

        }

        System.out.println();
        //verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci==>ict
        String x ="Tokatci";
        for (int i =x.length()-1; i>=0 ; i--) {
            char b =x.charAt(i);
            if(b=='a'){
                break;
            }else{
                System.out.print(b);//ict
            }
        }








    }//main
}//class
