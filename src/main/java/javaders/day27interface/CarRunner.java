package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();//stop() methodu static oldugundan interface ismi ile ulastik.

        Honda h =new Honda();//Normalde engine objesi olusturup eco ya ulasmamiz gerekirken interface ten objeden olusturamuyorum.
        // Cünkü interface icinde yarim, tamamlanmamis methodlar var.
        // O yüzden interface in child i honda dan obje olusturup eco() methoduna ulastik.Child daki obje parenttaki methodu kullanabilir.!!!!!!
        h.eco();//eco() methodu static olmadigindan(default method) object ile ulastik.



    }
}
