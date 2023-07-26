public class App {
    public static void main(String[] args) throws Exception {
        Lv0 lv0 = new Lv0();
        System.out.println( lv0.solution1(40) + " |나이출력|");
        System.out.println( lv0.solution2(10,3) + " |양꼬치|");
        System.out.println( lv0.solution3(5500)[0] + "," +  lv0.solution3(5500)[1] + " |아이스아메리카노|");
        System.out.println( lv0.solution4(1234) + " |자리수더하기|");
        System.out.println( lv0.solution5(150000) + " |옷가게 할인 받기|");

        int[] dot = {2,-4};
        System.out.println( lv0.solution6(dot) + " |점의 위치 구하기|");

        System.out.println( lv0.solution7("BCBdbe","B") + " |점의 위치 구하기|");
       
    }
}
