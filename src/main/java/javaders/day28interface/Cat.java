package javaders.day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        //interface lerde variable cagirirken interface adini kullanarak cagirin.
        //Bu hep static variable olmanin geregidir hem deokunurlulugu arttirir.
        System.out.println(Animal.age);//4
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);//6

    }

}
