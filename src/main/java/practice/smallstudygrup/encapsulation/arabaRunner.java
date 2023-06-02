package practice.smallstudygrup.encapsulation;

public class arabaRunner {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        System.out.println(araba1.getMarka());
        araba1.model="civic";
        System.out.println(araba1.model);
        araba1.setYakitturu("dizel");
        System.out.println(araba1.getYakitturu());
    }
}
