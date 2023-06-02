package practice.smallstudygrup.scope;

public class C02_scope {
    static int i;
    static int x=20;
    public static void main(String[] args) {

        for (i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
        {
            System.out.println(i);
            int z = 17;
        }
        C02_scope obje=new C02_scope();
        System.out.println(obje.x);//20
        System.out.println(x);//20



    }

}