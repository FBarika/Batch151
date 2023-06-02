package javaders.day35exceptions;

public class E03 {

    /*
    1)Try block tan sonra coklu catch block kullanilabilir.
    Catch blocklar arasinda parent child iliskisi yoksa catch blocklar istenildigi gibi siralanabilir.
    Catch blocklar rasinda parent child iliskisi varsa child üstte olmalidir.
    2)Exception class tüm exception larin parentidir.
    Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi sürece tek catch block olan "exception class" i kullanabilirsiniz.
    3)"try + 1 catch" olur - "try+ cok catch" olur - "try" tek basina kullanilamaz.
      "try" catch block olmadan kullanilabilir mi?
      "try + finally" olabilir.
     */
    public static void main(String[] args) {


        System.out.println(convertStringToIntDivideByLenght1("6"));


        System.out.println(convertStringToIntDivideByLenght2("6"));

        System.out.println(convertStringToIntDivideByLenght3("6"));


    }

    //Ex 1 : Bir String i int a ceviren ve bu int i String in lenght inin 1 eksigine bölen method olusturunuz.
    // Bir method un icinde 2 tane exception alma ihtimalimiz var
    public static int convertStringToIntDivideByLenght1(String str){
        int result=0;
        try{
            int a = Integer.valueOf(str);//valueOf methoduna rakam olmayan string(mesela "A") girince java exception atar bu NumberFormatException dir.
                                         //valueOf() bos String de de NumberFormatException verir.
            result= a / (str.length()-1);//bölme islemi mesela 2(lenght 1 olacak 1-1=0 olacak) yazdigimizda arithmetic exception verir.

        }catch(NumberFormatException e){// Exception atinca try in icindeki sonraki kod(result kismi) calismaz java kosa kosa catch in icine gider.
                                        //catch ler de sira önemli degildir ama siranin önemli oldugu durumlar var!!!!!

            System.out.println("Non-Digit character cannot be used in valueOf()");

        }catch(ArithmeticException e){// Bu durumda java ikinci arithmeticException i calistirmaz.
            // Cünkü valueOf exception in sonraki kodu calistirmadi Java. ArithmeticException orada olusur
            // mesela str yerine 6 girdik 6 nin lenght i 1 olacak yukarida lenght()-1 =0 olunca a/0 bize arithmetic exception verecek.

            System.out.println(e.getMessage());//bu bize teknik mesaj veriyor o da ==>by Zero olacak.
        }
      return result;

    }


    public static int convertStringToIntDivideByLenght2(String str){
        int result=0;
        try{
            int a = Integer.valueOf(str);//valueOf methoduna rakam olmayan string(mesela "A") girince java exception atar bu NumberFormatException dir.

            result= a / (str.length()-1);
                             // Exception 911 gibidir bütün exception lari halleder.coklu catch block kullanmaya gere kalmiyor buarada.
        }catch(Exception e){// bu yazim bütün exception lari halleder.Ama exceptionlara özel kodlar yazmamiz gerekebilir.
            // o zaman coklu catch block kullanmamiz gerekir bu sekilde yazamayiz.
            System.out.println(e.getMessage());
        }
        return result;

    }

    public static int convertStringToIntDivideByLenght3(String str){
        int result=0;
        try{
            int a = Integer.valueOf(str);//valueOf methoduna rakam olmayan string(mesela "A") girince java exception atar bu NumberFormatException dir.

            result= a / (str.length()-1);

        }catch(ArithmeticException e){//Eger catch blocklardaki exception lar arasinda parent child iliskisi varsa child yukarida olmali parent asagida olmalidir.
            //Sebebi Java yukaridan asagiya calistigi icin exceptionlar yukaridan yaginca child ta bir bazi exceptionlar birikir digerleri parent a gider.
            //Eger parent child iliskisi yoksa siranin bir önemi yok.iliskisi varsa ve yukariya child degil de parent i koyarsak hata verir.
            //Exception class larin ismi genellestikce parent olurlar.Exception class bütün exception class larin parent idir.
            // Object gibi demeyelim cünkü object in parenti yok ama exception nin parenti var.


            System.out.println("Jump");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

    }


}


