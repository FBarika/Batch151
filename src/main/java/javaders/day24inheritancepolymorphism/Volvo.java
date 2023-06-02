package javaders.day24inheritancepolymorphism;

public class Volvo extends Car {

    public void secure(){
        System.out.println("Volvo ist the most secure car in the world");
    }

    @Override// Bu bir "annotation" dir.@Override annotation i Override kurallarini kontrol eder.
    public void move() {
        //super.move();burasi yine parent taki methoda götürür ama biz özellestirilmis istdegimiz icin siliyoruz.
        System.out.println("Volvo moves...");
    }
}
