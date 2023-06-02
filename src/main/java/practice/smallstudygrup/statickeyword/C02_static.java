package practice.smallstudygrup.statickeyword;

public class C02_static {
    //soru2) assagidaki classlar calistirildiginda ne olur inceleyelim
    int x;
    static int y;
    C02_static (int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new C02_static(2);
        C02_static dnm=new C02_static(3);
        System.out.println(dnm.x+","+dnm.y);
        C02_static dnm2=new C02_static(7);
        System.out.println(dnm2.x+","+dnm2.y);
    }
}
