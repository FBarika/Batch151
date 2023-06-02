package javaders.day02printmethodcreation;

public class MethodCreationtekrar {
    public static void main(String[] args) {
        //Karenin alanini veren kodu yazini


     int sonuc= 5;//25
        System.out.println(kareninAlani(sonuc));

      dikdörtgen(8,9);

    }//main

    private static void dikdörtgen(int b,int c){
        System.out.println("Alan = "+(b*c));//Alan = 72
    }

    public static int kareninAlani(int a){
        return a*a;

    }
}//class
