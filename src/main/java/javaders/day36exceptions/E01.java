package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /* Exception lar ikiye ayrilir.1)Runtime Exception 2)Compile Time Exception

    1) Run Button una bastiktan sonra console da alinan exception lara "Runtime Exception" denir.
       Arithmetic exception, NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException
      "Runtime Exception" a örnektir.
      "Runtime Exception" lara "Unchecked Exception" da denir.


    2) Code yazarken kirmizi alt cizgi seklinde alinan exceptionlar da vardir, bunlara "Compile Time Exception" denir.
       FileNotFoundException, IOException  "Compile Time Exception" a örnektir.
      "Compile Time Exception" lara "Checked Exception" da denir.

    i)FileNotFoundException(dosya bulunamadi hatasi): Java ya bir dosyayi bul dedigimizde java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                                      hata olusursa ne yapmasini gerektigini söylememizi ister.
    ii)IOException: "IO" Input Output demektir.IOException FileNotFoundException nin parentidir.Cünkü dosyanin bulunma islemi IO nun icindedir.
                                              Coklu catch block kullanmak istemiyorsak sadece IO kullaniriz, cünkü IO File in yaptigini zaten yapar.
    3)Java da hata lar temelde 2 ye ayrilir. *Exception lar handle edilebilir ama error lar handle edilemezler.
       i)Exception'lar
       ii)Error'lar :
       a)StackOverflow Error(Stack memory nin dolmasi ve is yapamaz hale gelmesi ve application calisamaz hale geliyor.)
       b)Out Of Memory Error(Heap memory dolarsa bu hatayi aliyoruz.)
       c)Virtual Machine Error(java nin icinde sanal bir makine var o makinede hata olursa java calisamaz.)

    */
    public static void main(String[] args) throws IOException {// read () methodu hala kirmizi oldugunda FileNotFoundException yerine IOException yaptik parenti koyduk yani.
       //1.yol; Exception i method signature satirina ekledik.
        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");// bu parantezin icine dosyanin adresini yaziyoruz.file sag tiklayip seciyoruz.
                                //fileInput kizardiginda üzerine gelip more action dan seciyotuz.

        int i =0;//FileInputStream icinde bircok faydali method var onlardan biri read() methodu. onu kullanmak icin int i=0; yazdik.
        //read() methodu karakterlerin ascii degerini verir.Java read() in icine alt satira gecme özelligini koymus anliyor.
                 //L nin(ilk olarak) asci degerini verir bu kisim
        while((i=fis.read())!=-1){// bütün karakterler bittiginde bize -1 verecek.

            System.out.print((char)i);

        }
        //satirlar bittikten sonra read methodu bunu anlar ve -1 döndürür.-1!=-1 false döndürür ve loop kirilir.



    }
}
