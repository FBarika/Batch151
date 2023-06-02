package practice.gruppractice;

public class Sorular01 {
    public static void main(String[] args) {
        //public class IfSwitchTernaryPracticeSoruları {
    /*
     Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
     Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
          System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
          //kullanıcıya seçim içn işlem menusu yazdırdık
          int islem = scan.nextInt();//kullanıcının islem tercihi için veriable create edildi
          System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.
          double num1 = scan.nextDouble();//1 sayı assign edildi
          double num2 = scan.nextDouble();//2 sayı assign edildi
          if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
          }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
          } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
          } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
          } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");
     Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
             Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
            INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
                  a+b>c>a-b
                  a+c>b>a-c
                  b+c>a>b-c
                  a=b=c ise es kenar ucgen
     Cevap:
            Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (a == b && a == c) {
                System.out.println("ucgen ve eskenar ucgendir");
            } else {
                System.out.println("ucgen fakat eskenar degil");
            }
        } else {
            System.out.println("ucgen degildir.");
        }
     Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
            INFO : BMI = kilo(kg) /(boy*boy)(m)
                   BMI <=20 oldukca zayifsiniz
                   20<BMI<=25 Normal sinirlardasiniz
                   25<BMI<=30 Sisman kategorisindesiniz
                   30<BMI ==> Obez grubundasiniz.
    Cevap:
           Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();
        System.out.println("kilonuzu  kg giriniz : ");
        double kilo=scan.nextDouble()/100;
        double bmi=kilo/((boy)*(boy));
        if (bmi<=20){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
        } else if (bmi>20 & bmi<=25){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");
        } else if (bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");
        } else if (bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }
    Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
            qa ==> Quality Analyst
            dev ==> Developer
            ba ==> Busines Analyst
            pm ==> Project Manager
            seklinde bilgilerini yazdiriniz
    Cevap:
          Scanner input = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String jobTitle = input.next();
        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";
        if (jobTitle.equalsIgnoreCase("qa")) {
            System.out.println("Mesleginiz: " + qa);
        } else if (jobTitle.toLowerCase().equals("dev")) {
            System.out.println("Mesleginiz: " + dev);
        } else if (jobTitle.toLowerCase().equals("ba")) {
            System.out.println("Mesleginiz: " + ba);
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Mesleginiz: " + pm);
        } else {
            System.out.println("Hatali secim yaptiniz");
        }
    Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
    Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.print("yasınızı giriniz : ");
        int yas = scan.nextInt();
        System.out.print("kilonuzu  giriniz : ");
        int kilo = scan.nextInt();
        if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {//kilo sartı ve kontrolu yapıldı
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kilo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı
    Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.println("X ve Y degerleriniz giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");
    Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
    Cevap:
          Scanner sc = new Scanner(System.in);
         System.out.println("Lutfen bir karakter giriniz");
         char ch = sc.next().charAt(0);
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Hatali giris yaptiniz.");
        }
    Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int quantity = scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        double price = scan.nextDouble();
        double totalPrice;
        System.out
                .println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char card = scan.next().toLowerCase().charAt(0);
        if (card == 'y') {
            if (quantity > 10) {
                price *= 0.8; // price = price*0.8
                totalPrice = price * quantity;
                System.out
                        .println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            } else {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out
                        .println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            }
        } else if (card == 'n') {
            if (quantity > 10) {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
            } else {
                price = price - price * 10 / 100;
                totalPrice = price * quantity;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
            }
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
        }
    Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
    Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.print("ehliyetiniz var ise -> 1 yok ise -> 0 yazınız : ");
        int ehliyetiniz = scan.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {//ehlivetin varlık yokluk sartına göre diger kosullar çalışacak
            if (ehliyetiniz == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200$ kitledim size");
            }
            System.out.print("hızınızı giriniz : ");
            int hızınız = scan.nextInt();
            if (ehliyetiniz == 1) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 100 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 150 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 320 $'dır.");
                } else if (hızınız > 94) {
                    System.out.println(" Ceza 500 $'dır.");
                } else System.out.println("hız sınırnda...

     */
    }
}
