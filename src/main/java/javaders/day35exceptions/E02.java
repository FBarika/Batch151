package javaders.day35exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java", 2));//v

        System.out.println(getCharFromString("Java", 8));


    }

    //Ex 1: Bir String teki karakteri index kullanarak alan bir method olusturunuz.

    public static char getCharFromString(String str, int idx) {

        try {
            return str.charAt(idx);

        } catch (StringIndexOutOfBoundsException e) {//String lerde olmayan index i kullandigimizda karsimiza cikan exception.
            idx=Math.abs(idx);// eksi sayilari almamak icin önce mutlak deger icine aldik.
            idx=idx % str.length();// index olarak verilen 8 java nin lenght ine böldük kalani index olarak kullandik.
            //bu mantik requirement ta gelir zaten kafamiza göre catch icine bu kodu yazamiyoruz.
           return str.charAt(idx);
        }//try catch methodlarin icinde kullanilir.
    }

}