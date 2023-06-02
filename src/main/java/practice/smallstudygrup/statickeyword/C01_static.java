package practice.smallstudygrup.statickeyword;

public class C01_static {
    //soru 1)bir static birde non-static(instance) variable olusturun ve arasindaki farklari inceleyin
    static int sayi=15;
    int rakam=6;

    public static void main(String[] args) {
        System.out.println(sayi);//15
        //System.out.println(rakam);
        C01_static obj1=new C01_static();
        System.out.println(obj1.rakam);//6
        obj1.rakam=8;
        obj1.sayi=57;
        System.out.println(obj1.sayi);//57
        System.out.println(obj1.rakam);//8
        C01_static obj2=new C01_static();
        System.out.println(obj2.sayi);//57
        System.out.println(obj2.rakam);//6


    }


}
