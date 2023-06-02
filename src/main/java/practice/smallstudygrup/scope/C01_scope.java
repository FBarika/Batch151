package practice.smallstudygrup.scope;

public class C01_scope {
    int yas=15;
    static String isim="Ahmet Furkan";





    public static void main(String[] args) {
        C01_scope obje=new C01_scope();
        int sira=5;
        System.out.println(obje.yas);
        System.out.println(sira);
        System.out.println(isim);
        obje.yazdir();
        {
            int x=20;
            System.out.println(x);
            System.out.println(sira);
        }




    }
    public void yazdir(){
        System.out.println(yas);
        System.out.println(isim);
    }
}
