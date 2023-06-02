package javaders.day36exceptions;

public class E03 {
    /*Soru:Interwiew sorusu !!!!!!!!!
    "throws ile throw arasindaki farklar nelerdir?
    1)"throws" method signature satirinda kullanilir."throw" method body icinde kullanilir.
    2)"throws" method signature satirinda bir veya birden fazla exception ile bir kere kullanilir. mesela throws IOException,ArithmeticException
      "throw" ise method body icinde throw dan sonra bir tane exception ile tekrar tekrar kullanilir.
    3)"throws" dan sonra sadece Exception class isimleri yazilir.
       "throw" dan sonra Exception Class dan object olusturulur.
     */
    public static void main(String[] args) {

        printAge(23);
        try {
            printAge(-12);
        } catch (IllegalArgumentException e) {
            System.out.println("Negative ages are not valid");//burada kendi olusturdugumuz exception i handle etmis olduk.
            // Ama bu da(IllegalArgumentException) Javanin exception i bu exception biz istedigimiz yerlerde atabiliyoruz.
        }

            printAge(-9);


    }
        // Ex 1: Ögrenci yasini kullanicidan alinan yasi console a yazdiran methodu olusturunuz.
        public static void printAge ( int age)
        {//Java günlük hayatta yasin nagatif olabilecegini bilmez bu yüzden biz kendimiz exception atariz asagidaki örnek gibi.
            if (age < 0) {// eger yas 0 dan kucukse bir exception at dedik.
                throw new IllegalArgumentException("Used negative integers for ages");//parantezin icine koydugumuz mesaji biz yazdik.
            }
            System.out.println(age);

        }
    }

