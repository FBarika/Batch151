package practice.sorubankasi.loopslar;

public class Soru15 {
    public static void main(String[] args) {
        //15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

        char ch='C';
        String result ="";
        do{
            ch--;
            if(ch=='A'){
                break;
            }
            result=result+ch;


        }while(ch>='A');
        System.out.println(result);
    }
}
