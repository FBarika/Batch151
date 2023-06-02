package practice.smallstudygrup.constructorstaticblock;

public class StaticBlock {
    static int a=6;
    StaticBlock(){
        System.out.println("cons calisti");
        System.out.println(a);
    }
    static {
        System.out.println(" üstteki static block calisti");
        a=3;
    }
    public static void main(String[] args) {
        System.out.println(a);
        a=10;
        System.out.println("main calisti");
        StaticBlock obj1 = new StaticBlock();

    }
    static {
        System.out.println(" alttaki static block calisti");
        a=9;
    }

}
