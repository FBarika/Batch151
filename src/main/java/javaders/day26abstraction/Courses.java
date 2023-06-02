package javaders.day26abstraction;

/*
1)Bazen parent class taki methodun body si hicbir child tarafindan kullanilmaz.
Bu durumda parent taki methoda body yazmak hic kullanilmadigi icin mantikli degildir.
Biz de o methoda body yazmayiz.
2)Body si yazilmayan(olmayan) methoda "Abstract Method" denir.
Abstract ingilizcede vücutsuz veya soyut anlamindadir.
3)Methodun body sini yazmayinca java hata verir.
Biz de abstract keywordunu kullanarak javaya bu methodun body si olmayacak deriz.
4)Abstarct keywordunu kullaninca elde ettigimiz abstract method normal class lara konulamaz.
O yüzden class i da abstract yapariz.
5)Parent taki method abstract ise bütün child class lar o methodu override etmek zorundadir.
Bu yüzden tüm childlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
6)Body si olan methodlar(Concrete method) abstract class larin icine yazilabilir.
abstract methodlar concrete class larin icine yazilamazlar.
7)"abstarct" keyword ile method body bir method da ayni anda kullanilamaz. Yani bir method abstract ise body si olmaz.
Method un body si varsa abstract olmaz.
8)Abstract class larin icinde abstarct methodlar olur. Abstract methodlar body si olmadigindan eksik methodlar gibi dusunulebilr.
Yani abstract class icinde eksik bir yapi barindirir, siz abstract class dan obje üretirseniz abstract class icindeki eksiklik objeye yansir
ve obje eksigi olan bir obje olur. Java bunu istemez. Cunku eksik obje eksik is yapar.
Bu da applicatioon nin yanlis calismasina sebep olur.Java Application i korumak icin abstarct class lardan object üretilmesini engellemisitir.
9)Abstract class larin constructor lari vardir ama obje olusturamazlar.
10)"final methodlar" abstract olamazlar.final method varsa o mutlaka concrete olmalidir.(body si olan)
11)private method lar abstract olamazlar.
12)abstract class in abstract child i veya concrete child i olabilir.
13)static method lar abstract olamazlar.
 */

/*
"final" keyword u aciklar misiniz?
"final" keyword i) variable larda ii) methodlarda iii) class larda kullanilabilir.

i)variable larda kullanildiginda
a)variable a kesinlikle deger atamasi yapilmalidir.
b)ilk atanan deger degistirilemez.
ii)methodlarda kullanildiginda
a)o methodun body si degistirilemez.
b)o method override edilemez.
iii)class larda kullanildiginda
a)o class in child class i olamaz ama final class in kendisi child olabilir.

 */

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }




}
