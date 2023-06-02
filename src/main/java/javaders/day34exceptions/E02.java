package javaders.day34exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));

        System.out.println(getElement(a, 6));//6 yazinca hata veriyor array in index i sinirlari disinda hatasi verecek.


    }
    //Bir String arary den istenilen bir elemani eleman sirasi ile alan method olusturunuz.

    public static String getElement(String[] a, int numOfElement) {

        String result = "";
        try {
            result = a[numOfElement - 1];
        } catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullandigimizda atilir
            if (numOfElement - 1 < 0) {
                result = a[0];
            } else {
                result = a[a.length - 1];//var olmayan index i kullandigimizda eger o index sag taraftaysa büyükse son elemani aliyoruz.mesela 6 yazdigimizda numOf Elemant e
                                         //var olmayan index i kullandigimizda eger o index sol taraftaysa kücükse ilk elemani aliyoruz.msela -3 yazdigimizda
            }
        }
        return result;
    }
}
 /*
 a array'imizde 4 eleman var, 6. elemani istersek hata verir. Cunku 6. eleman yok. 6. eleman index 5'tedir ve index 5 olmadigi icin,
 yazdirma islemi yaptigimizda ekranda problem exception olarak yazilir ve hangi satirda problem oldugu belirtilir.
 */
/*
0 bölmek ölümcül bir hata demek app i kitler demektir. Java ben exception atarim app inizi kitlerim diyor.
java matematik bildigi icin bize try catch block imkani ile bize hatayi önleme imkani veriyor.
güvenlik önlemi diye düsünebiliriz.

 */
