package javaders.day18constructorsstatickeywordsüleymanhoca;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        //System.out.println("I am constructor");
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlocks02(int price){

        //System.out.println("I am constructor");
        System.out.println("Constructor 2");
    }

    public StaticNonStaticBlocks02(String name){

        //System.out.println("I am constructor");
        System.out.println("Constructor 3");
    }
    public StaticNonStaticBlocks02(boolean isOld){

        //System.out.println("I am constructor");
        System.out.println("Constructor 4");
    }
    /*
    //non- static block constructor larda calistirilmasi gereken ortak kodlari icerir.
    //Constructor larda ortak sürekli tekrar eden kod varsa onlari non-static blok icinde asagida yazabiliriz.
    //non-static block icine yazilan kodlar her constructor icin yazilir.
    // birden fazla non-static block varsa üsteki önce calistirilir.
     */
    {
        System.out.println("I am constructor-ilk");
    }

    {
        System.out.println("I am constructor - ikinci");
    }



    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1=new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2=new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3=new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4=new StaticNonStaticBlocks02(false);
    }

}//class
