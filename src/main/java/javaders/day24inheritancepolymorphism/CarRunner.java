package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {

      Toyota t1 =new Toyota();// String koyunca stringli constructor calistirilacak parent taki constrocktor dan önce.
      //t1.model="Prius";
      //System.out.println(t1.model);
      Honda h1=new Honda();
      Volvo v1= new Volvo();
      v1.move();// move() methodunu sectigimizde override yaptiysak override i kullanir.













    }//main
}//class
