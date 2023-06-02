package javaders.day24inheritancepolymorphism;

public class Toyota extends Car{


    public void hybrid(){
        System.out.println("Toyoto uses hybrid engine...");

    }
    public Toyota (){
        this("Prius");//this() ayni class icinde constructor arasinda seyehat icindir.
        System.out.println("Toyota constructor 1");
    }

    public Toyota (String s){// burada önce parentaki parametreli constroctor sonra toyotadaki parametreli constroctor kullanilacak.
                  super(7);
        System.out.println("Toyota constructor 2");
    }
}
