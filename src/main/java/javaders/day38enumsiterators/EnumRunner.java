package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {
      String capitalOfIllinois =  UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        /*
        Normalde Alaska String gibi duruyor ancak onu String yapinca kizardi. Variable tipini degistirme uyarisini sectik
        ve duzeldi. String yerine enum'in ismi yazildi. Ornek: UsStatesEnum state=UsStatesEnum.Alaska
         */
        UsStatesEnum state = UsStatesEnum.ALASKA;//Enumlar variable larin data tipi olarak da kullanlabilir.
        System.out.println(state);//Enum daki datayi get() methodan olusturursak datayi enum yapmaliyiz.

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);//Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);//AK









    }
}
