package javaders.day12switchincrementdecrementloopssüleymanhoca;

public class IncrementDecrement {
    /*

    1)"Increment" artirmak demektir."Decrement" azaltmak demektir.
    2)"Increment" toplama ve carpma ile, "Decrement" cikarma ve bölme ile yapilabilir.
    3) "Increment" ve "Decrement" 3 yolla yapilabilir.
            i) int i = 12; ==>  i = i + 5;
            ii) int i = 12; ==>  i += 5;
            iii) int i = 12; ==>  i++;
                 Note: 3. yol sadece 1 artirmak icin kullanilabilir.

            i) int i = 12; ==>  i = i - 5;
            ii) int i = 12; ==>  i -= 5;
            iii) int i = 12; ==>  i--;
                 Note: 3. yol sadece 1 azaltmak icin kullanilabilir.

     */
    public static void main(String[] args) {
        // *******************INCREMENT***************\\
        //TOPLAMA
        int age =12;
        age=age+1;
        age+=1;// + ile = arasinda bosluk olmamali.
        age++; //3. yöntem sadece 1 artirmak icin kullanilir.
        // bunlarin hepsi ayni anlamdadir.

        //CARPMA
        double x =120000;
        x = x* 1.1;
        x *= 1.1;
        //bunlar ayni anlamdalar.x**; diye bir sey yoktur.!!!!!!!!

        // *******************DECREMENT***************\\

        //CIKARMA
        int price = 12;
        price=price-3;
        price -= 3;//- ile = arasinda bosluk olmaz bitisik yazilmalidir.
        price--;// 3 yöntem sadece bir azaltmalarda kullanilir.
        //Bunlarin hepsi ayni anlama gelir.

        //BÖLME
        int y =120000;
        y=y/3;
        y/=3; //bunlar ayni anlamdalar.y//; diye bir sey yoktur.!!!!!!!!

      int age1 =12;
        System.out.println(age1);//12
        age1=age1++;// Post increment
        System.out.println(age1);//burda da 12 yazdiriyor.
        age1++;
        System.out.println(age1);// burda 13
        age1=++age1;//Pre increment
        System.out.println(age1);//14 yazdiriyor.


        int salary =40;

        salary=salary--;
        System.out.println(salary);//40

        salary=--salary;
        System.out.println(salary);//39



    }//main
}//class
