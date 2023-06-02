package practice.smallstudygrup.statickeyword;

public class C03_static {
    static int x;
    int y;
    C03_static(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x;
    }
    public static void main(String[] args) {
        C03_static sm1=new C03_static();
        C03_static sm2=new C03_static();
        int z=sm1.getSquare();
        System.out.println("-x"+z +"-y"+sm2.y+" "+sm1.x);
    }
}
