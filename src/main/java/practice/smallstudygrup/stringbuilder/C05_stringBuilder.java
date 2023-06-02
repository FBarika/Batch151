package practice.smallstudygrup.stringbuilder;

public class C05_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java bugun cok kolay.");
        System.out.println(sb.indexOf("u",7));
        sb.replace(5,10,"Havaaaaaaa"); // bugun yerine havaaaaaa  yi ekledik.
        System.out.println(sb);
        sb.setCharAt(sb.indexOf("."),'!');//index i verip degistirmek istedigimiz seyle degistiriyoruz.
        System.out.println(sb);
    }
}
