package practice.gruppractice;

public class Sorular04 {
     /*

    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
​
    Test Data
    34
    Beklenen Çıktı
    7
    *********************************************************************
    2---1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
    ************************************************************************
    3----elirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
​
    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    ************************************************************************
    4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
​
     Beklenen çıltı:
​
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
​
    ************************************************************************
    5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
      ************************************************************************
​
     6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​
    Sesli harfler: a,e,i,o,u
​
    Test Data:
    a
​
    Beklenen Çıktı:
    a harfi sesli harfdir.
​
    Test Data:
    d
​
    Beklenen Çıktı:
    d harfi sesiz harftir.
​
    Test Data:
    we  yada %
​
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
      ************************************************************************
    7-----
       Ugly Number:
​
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
​
​
    Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
​
    Test Data:
    13
​
    Beklenen çıktı:
    ugly number  degildir
​
    Test Data:
    25
    Beklenen Çıktı:
​
    ugly number
     ************************************************************************
    8----
     Girilen String değerde tersten yazan Java kodunu yazınız.
​
    Test Data:
    java
    avaj
    ************************************************************************
    9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
​
    Test Data:
    str1: Java is
    str2: fun
​
    Beklenen Çıktı:
    java is fun
    ************************************************************************
    10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
​
    Test Data:
    Java is easy
​
    Aranan String: is
​
    Bektenen Çıktı:
    True
​
    Aranan String: and
​
    Beklenen Çıktı:False
    ************************************************************************
    11----
    Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
​
    Test Data:
    good
​
    Beklenen Çıktı:
    goo
    ************************************************************************
    12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.
​
    Test Data:
    Java is fun
​
    Beklenen Sonuç:
    JAVA IS FUN
​
    ************************************************************************
    13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
​
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
​
    Test Data:
    madam
​
    Beklenen Çıktı:
    True
    ************************************************************************
    14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.
​
​
    Test data:
    1. String : techproed.com
    2. String : Techproed.com
​
    Beklenen Çıktı:
    False
​
    Test data:
    1. String : techproed.com
    2. String : techproed.com
​
    Beklenen Çıktı:
    true
    ************************************************************************
    15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
​
    Test Data:
    Java is fun
​
​
    Beklenen Çıktı
    0. pozisyondaki karakter : J
​
    5. pozisyondaki karakter : i
​
    ************************************************************************
    16----
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
    JAVA IS FUN
    ************************************************************************
​
    17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
​
    Test data:
    12,24,34
​
    Beklenen Çıktı:
    12
    ************************************************************************
    18----
    Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
​
    Stringdeki sesli harf sayısı: 4
​
    ************************************************************************
    19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
​
    Test Data:
    2017
​
    Beklenen Çıktı:
    false
    ************************************************************************
    20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.
​
​
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
​
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    ************************************************************************

    23----
    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
​
    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
    ************************************************************************

    29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
​
    ************************************************************************
    30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
​
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
​
    Beklenen Çıktı:
    1010100
    ************************************************************************
    31----
    Saati saniyeye çeviren java methodunu yazınız.
​
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    ************************************************************************
    32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
​
    num1 = num2 => true
    ************************************************************************

    36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
​
    Test Data:
​
    isPrime(31)
    true
​
    isPrime(18)
    false
    ************************************************************************
    37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
​
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
​
    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
​
    İpucu harfleri değiştirin ve ekrana yazdırın.

      */
}
