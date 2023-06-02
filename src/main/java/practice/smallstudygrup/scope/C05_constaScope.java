package practice.smallstudygrup.scope;

public class C05_constaScope {
    int a;
    int b=10;
    int c=15;

    C05_constaScope(int a){
        System.out.println(a);
        System.out.println(b);
    }
    C05_constaScope(int a,int b,int c){
        this.a=a;
        this.b+=b;
        this.c=c;
        System.out.println(a+b);// kullanicin girdigi degerler.
        System.out.println(this.a+this.b);// basta olusturdugumuz variablalarin degeri

    }
    C05_constaScope(){
        a=20;
        b=16;
    }

    public static void main(String[] args) {
        C05_constaScope obje1=new C05_constaScope(5,9,2);
        C05_constaScope obje2=new C05_constaScope(1);
        C05_constaScope obje3=new C05_constaScope();


    }
}
