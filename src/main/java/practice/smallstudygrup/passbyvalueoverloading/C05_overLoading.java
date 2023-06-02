package practice.smallstudygrup.passbyvalueoverloading;

public class C05_overLoading {
    public static void main(String[] args) {
        /*
3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
2. methodda 1 tane double 1 tane int deger carpalim
3. methodda 2 tane double deger carpalim
 */

        carpim(7,9);//63
        carpim(3.2,4);//12.8
        carpim(4.5,6.9);//31.05

//javanin otomatik olarak en uygun olani otomatik olarak secmesine autowiedining denir




    }

    public static void carpim(double a, double b) {
        System.out.println(a*b);
    }

    public static void carpim(double a, int b) {
        System.out.println(a*b);
    }

    public static void carpim(int a, int b) {
        System.out.println(a*b);
    }





}


