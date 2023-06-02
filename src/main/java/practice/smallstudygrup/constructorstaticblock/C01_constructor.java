package practice.smallstudygrup.constructorstaticblock;

public class C01_constructor {
    /*
    soru 1) birkac tane constructer cagirip bu constructerlari inceleyelim
     */
    int a;
    int b;

    C01_constructor(){
        this(12,9);
        System.out.println("constructor calisti");

    }

    public C01_constructor(int a, int b) {
        this.a=a;
        this.b=b;

    }

    public static void main(String[] args) {
        C01_constructor obj1=new C01_constructor();
        C01_constructor obj2=new C01_constructor(5,7);

        System.out.println(obj2.a);//5
        System.out.println(obj2.b);//7
        System.out.println(obj1.a);//12
        System.out.println(obj1.b);//9


    }
}
