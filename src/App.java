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

        System.out.println( lv0.solution7("BCBdbe","B") + " |특정 문자 제거하기|");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println( lv0.solution8(numbers) + " |최대값 만들기|");

        int[] array = {0, 2, 3, 4};
        System.out.println( lv0.solution9(array,1) + " |중복된 숫자 개수|");

        int[] array2 = {149, 180, 192, 170};
        System.out.println( lv0.solution10(array2,167) + " |머쓱이보다 키 큰사람|");

        System.out.println( lv0.solution11("hello",3) + " |문자 반복출력하기|");
        
        System.out.println( lv0.solution12(100) + " |순서 쌍의 개수|");

        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println( lv0.solution13(numbers2,1,3) + " |배열 자르기|");

        System.out.println( lv0.solution14("bus") + " |모음 제거|");

        int[] numbers3 = {1, 2, 100, -99, 1, 2, 3};
        System.out.println( lv0.solution15(numbers3) + " |배열 2배 만들기|");

        int[] array3 = {9, -1, 0};
        System.out.println( lv0.solution16(array3) + " |중앙값 만들기|");

        System.out.println( lv0.solution17("aAb1B2cC34oOp") + " |숨어있는 숫자의 덧셈|");

        System.out.println( lv0.solution18(10) + " |짝수는 싫어요|");

        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println( lv0.solution19(babbling) + " |옹알이|");
    }
}
