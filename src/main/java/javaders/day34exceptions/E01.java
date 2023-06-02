package javaders.day34exceptions;

public class E01 {
    /*
    Kod dünyasinda umulmadik problemlere exceptions denir.Umulmadik problemlere cözüm üretmeye "exceptions handling" denir.
    1)Exception demek beklenmedik problem demektir.
    2)Exception lari halldedebilmek icin 2 temel yol vardir.
       i)Exception a uygun cözümler üretebiliriz.Biz buna "Exception Handling" denir.
       ii)Exception olustugunda bunu ilan eder ve geri cekiliriz.Buna da "Throw Exception" denir.
    3)Exception a uygun cözümler üretmede try-catch kullanilir.
    "try block" da yapilmasi gereken islemi Java dan yapmasi istenir.
    Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
    "try block" da islem yapilirken " Exception" olursa "catch block" devreye girer ve catch block icindeki kodlar calisir.
    4)try block da islem yapilirken exeception olusursa try block icindeki exception dan sonraki code calistirilmaz.

     */
    public static void main(String[] args) {


        System.out.println(divide1(12,3));

        System.out.println(divide1(6,0));// 0 ile bölünmez bize "ArithmeticException" verir.

        System.out.println(divide2(12,3));

        System.out.println(divide2(6,0));

      //Matematik kurallarina aykiri bir is yaptigimizda java bize "ArithmeticException" verir.



    }
    //1.Way; Exception i handle etmede ilk ve kötü yol böyle yapmicaz ama handle etmeyi asagidaki gibi yapicaz.
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception i handle etmede harika yol
    public static int divide2(int a, int b){
        int result=0;
        try{
            result =a/b;//burda exception olursa altindaki kod(i am here) calismaz direk catch e gider.
                        // toplama-cikarma-carpma islemlerinde try-catch yapmaya gerek yoktur.Riskli matematiksel islemlerde kullanilir yani.

            System.out.println("I am here");//exception olusmadigi sürece try icindeki tüm kodlar calisir.exception dan sonra mesela i am here calismayacak.

                                      // mataematik ile her türlü problemi burada yakalar arithmetic Exception.
        }catch(ArithmeticException e){//"ArithmeticException matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
                                      // mutlu senaryolarda burasi calismayacak 6/0 da calisacak.

            System.out.println("There is an issue in division");
            //e.printStackTrace();
        }
        return result;
    }
}

//toplama cikarma yaparken arithmeticException kullanmaya gerek yok. Riskli matematiksel islemlerde kullaniriz.
