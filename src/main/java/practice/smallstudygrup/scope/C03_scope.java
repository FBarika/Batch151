package practice.smallstudygrup.scope;

public class C03_scope {
    public int xx=30;
    protected static String aa="ali";
    public static void main(String[] args) {
        int x=20;
        C03_scope obje=new C03_scope();
        System.out.println(obje.xx);
    }
}
