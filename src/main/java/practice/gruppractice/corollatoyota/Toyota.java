package practice.gruppractice.corollatoyota;

public class Toyota extends Araba{
    String hiz = "Toyota araclar max 220 km hiz yapar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";
    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanir");
    }
    public void garanti(){
        System.out.println("Toyata araclar 10 yil garantilidir");
    }
    public void yakitTuketimi(){
        System.out.println("Toyota 8.20 lt yakit tuketir");
    }
}