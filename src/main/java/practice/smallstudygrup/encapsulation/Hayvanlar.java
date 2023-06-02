package practice.smallstudygrup.encapsulation;

public class Hayvanlar {
    private String kedi="kedi";
    private String kopek="kopek";
    private String tavsan="tavsan";
    private String at="at";
    private String timsah="timsah";
    private String zurafa="zurafa";

    //setter methodlari olusturmadigimiz zaman sadece getter methodlari olusturdugumuz zaman bunu immutable class olarak adlandiriyoruz.
    public String getKedi() {
        return kedi;
    }

    public String getKopek() {
        return kopek;
    }

    public String getTavsan() {
        return tavsan;
    }

    public String getAt() {
        return at;
    }

    public String getTimsah() {
        return timsah;
    }

    public String getZurafa() {
        return zurafa;
    }


}
