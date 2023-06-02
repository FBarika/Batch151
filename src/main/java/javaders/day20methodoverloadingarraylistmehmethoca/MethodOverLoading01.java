package javaders.day20methodoverloadingarraylistmehmethoca;

public class MethodOverLoading01 {
    /*1)Method Overloading ne demek?
          Ayni isimde farkli isler apabilen methodlar olusturmak demektir.
          2)Ne icin var?
          Daha derli toplu bir yapi olsun diye, her parametreye göre yeni method olusturmamak adina var.
          Örnek substring methodu a)tek paramertre b)iki parametre
         */
    public static void main(String[] args) {


        add(3,5);
        /*
        1)Method Overloading yaparken method ismi degistirilmez
        2)Method Overloading yapilirken parametreler degistirilir.
        i)Parametre degistirirken,parametrelerin data typelari degistirilebilir
        ii)Parametre degistirirken,parametrelerin data typeleri farkli ise yrleri degistirilebilir.
        iii)Parametre degistirirken,parametrelerin sayisi degistirilebilir.
        3)Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir.
        Bu yüzden ismi ve parametre==> "method signature" olarak adlandirilir.
        4)Method overloading olustururken return type degistirmenin hic bir etksi yoktur.
        Method overloading olustururken access modifier degistirmenin hic bir etksi yoktur.
        Method overloading olustururken return type degistirmenin hic bir etksi yoktur.
        Method overloading olustururken method body i degistirmenin hic bir etksi yoktur.
        5) Private method lar overload edilebilir. Cünkü method overloading sadece bir class in icinde olur.
        "private" olmak ise baska class lara gidildiginde sorun olur.
        6)"static"methodlar overload edilebilirler.
         */

    }//main
    public static void add(int a,int b){// mesela double bir deger int konteyner ina konulmuyor.(uygun baska parametre yoksa) Explit narrowing oldugu icin
        System.out.println(a+b);
    }

    public static void add(double a,double b){
        System.out.println(a+b);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}//class
