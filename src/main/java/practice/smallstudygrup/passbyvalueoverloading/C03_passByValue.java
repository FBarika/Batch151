package practice.smallstudygrup.passbyvalueoverloading;

public class C03_passByValue {
    public static void main(String[] args) {
        int [] b={1,5};
        sayiyiDegistir(b);
        System.out.println(b[0]); //buarada yapi degismeyip eleman degistigi icin ilk elemani 8 yazdircak.
    }

    public static void sayiyiDegistir(int[] a) {
        a[0]=8;
        System.out.println(a[0]);
    }
}
