package javaders.day13incrementdecrementloopsmehmethoca;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment
        int a=5;
        System.out.println(a);//5

        a= a + 2;
        System.out.println(a);//7
        a+=2; //bu da ayni sonucu verir.

        //Ex1:Bir tane integer variable olusturun ve onu iki sekilde 5 artirin

        int x = 6;
        System.out.println(x);
        x=x+5;
        System.out.println(x);// 1. yol
        x+=5;// += arasinda bosluk olmamali!!!!!!!!!!
        System.out.println(x);//2.yol

        //Decrement
        int c= 8;
        System.out.println(c);
        c= c-3;//1.yol
        System.out.println(c);
        c-=3;// 2.yol reptition olmadigi icin bu yol best practice
        System.out.println(c);

        //Increment 2;
        int d= 6;
        System.out.println(d);
        d=d*2;//1.yol
        System.out.println(d);
        d*=2;//2.yol
        System.out.println(d);

        //Decrement 2;
        int e = 24;
        System.out.println(e);
        e=e/2;//1.yol
        System.out.println(e);
        e/=2;//2.yol
        System.out.println(e);

        //"1" ile increment
        int f =12;
        //f=f+1
        //f+=1;
        f++; // bu da ayni seyi yapiyor.
        System.out.println(f);

        //"1" ile decrement
        int h =10;

        //h=h-1;
        //h-=1;

         h--; // bu da ayni seyi yapar.

        //post-increment ve pre increment
        int i =10;
        int k = i++;//post-increment post sonra demek cunku variable iminden sonra increment islemi yapildi
        System.out.println(k);//k=10 ==> artirilmadan k sepetine konuldugu icin k nin degeri 10 olur.
        System.out.println(i);//i=11 ==> i satir sonunda artirildigi icin i nin degeri 11 olur.
        //++==>increment

        int m =15;
        int n =++m; //pre increment cunku variable isimden once increment islemi yapildi
        System.out.println(n);//n=16 "m" artirildiktan sonra n sepetine konuldugu icin "n" nin degeri 16 olur.
        System.out.println(m);// m=16 "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.

        int p =17;
        int r =p--;
        System.out.println(p);//p==16
        System.out.println(r);//r==17

        int s =20;
        int t =--s;
        System.out.println(s);//s==19
        System.out.println(t);//t==19
        /*
        *1) Increment artirmak demektir.Decrement azaltmak demektir.
        * 2)Increment toplama ve carpma ile Decrement cikarma ya da bölme ile yapilabilir.
        * 39Increment ve Decrement 3 yolla yapilabilir.
        *
        *     a)int i =12; ==>i= i+5;
        *     b)int i =12; ==>i +=5;
        *     c)int i =12; ==> i++;
        *      Note:3. yol sadece 1 artirmak icin kullanilabilir.
        *
        *
        *     a)int i =12; ==>i= i-5;
         *    b)int i =12; ==>i -=5;
         *    c)int i =12; ==> i--;
         *      Note:3. yol sadece 1 azaltmak icin kullanilabilir.
         *
         */











    }//main
}//class
