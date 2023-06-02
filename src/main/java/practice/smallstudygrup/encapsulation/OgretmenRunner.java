package practice.smallstudygrup.encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        ogretmen1.setIsim("ahmet");
        ogretmen1.setBrans("bilgisayar ogretmenligi");
        ogretmen1.setSoyIsim("yilmaz");
        System.out.println(ogretmen1.getIsim());
        System.out.println(ogretmen1.getSoyIsim());
        System.out.println(ogretmen1.getBrans());
    }
}
