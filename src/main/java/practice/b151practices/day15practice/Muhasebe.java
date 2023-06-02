package practice.b151practices.day15practice;

public class Muhasebe extends Personal{

  protected int saatÜcreti;
  protected String statu;
  protected int maas;


  protected int maasHesapla(){
      int maas=saatÜcreti*8*30;
      return maas;
  }


}
