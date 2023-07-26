import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lv0 {

    //나이 츨력
    // 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
    // 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
    public int solution1(int age) {        
        int answer = 2022- age +1;
        return answer;
    }

    //양꼬치
    // 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
    // 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
    public int solution2(int n, int k) {
    int answer =( n*12000) + ((k-(n/10))*2000);
        return answer;
    }

    //아이스아메리카노
    // 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
    // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution3(int money) {
        int[] answer = {money / 5500 , money % 5500};
        return answer;
    }

    //자리수 더하기
    //정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    public int solution4(int n) {
        int answer = 0;
        String test1 = String.valueOf(n);
        String[] test2 = new String[test1.length()];

        for (int i = 0; i < test2.length; i++) {
            test2[i] = test1.substring(i, i+1);
            answer +=  Integer.parseInt(test2[i]);   
        }
        
        return answer;
    }

    //옷가게 할인 받기
    //머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    public int solution5(int price) {
        int answer = 0;
      
        if(price < 100000){
            answer = price;
        }
        else if(price >= 100000 && price < 300000)
        {
            answer = (price * (100-5)/100);
        }else if(price >= 300000 && price < 500000 )
        {
           answer = (price * (100-10))/100;
        }
        else if(price >= 500000 )
        {
            answer = (price * (100-20))/100;
        }
        return answer;
    }

    //점의 위치 구하기
    //사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
    public int solution6(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0)
        {
            answer = 1;
            System.out.println("1사분면입니다.");
        }else if(dot[0] < 0 && dot[1] > 0 )
        {
            answer = 2;
            System.out.println("2사분면입니다.");
        }else if(dot[0] < 0 && dot[1] < 0)
        {
            answer = 3;
            System.out.println("3사분면입니다.");
        }else 
        {
            answer = 3;
            System.out.println("4사분면입니다.");
        }
        return answer;
    }

    //특정 문자 제거하기
    public String solution7(String my_string, String letter) {

        //방법1
        StringBuilder sb = new StringBuilder();

        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != letter.charAt(0)){
                sb.append(arr[i]);
            }
        }

        //방법2
        String answer = my_string.replace(letter,"");
        return answer;
    }

    //최대값 만들기
    public int solution8(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new  ArrayList<Integer>(); 
        
        for (int i = 0; i < numbers.length; i++) {
        list.add(numbers[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        answer = list.get(0) * list.get(1);

        return answer;
    }

    //중복된 숫자 개수
    public int solution9(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            
            if(array[i] == n)
            {
                answer++;
            }
        }
        return answer;
    }


    //머쓱이보다 키 큰 사람
    public int solution10(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i] > height)
            {
                answer++;
            }
            
        }
        return answer;
    }

    //문자 반복 출력하기
    public String solution11(String my_string, int n) {
        String answer = "";

        // char[] result = my_string.toCharArray();
        String[] result =  new String[my_string.length()];

        for (int i = 0; i < result.length; i++) {
            result[i] = my_string.substring(i, i+1);
            
        }



        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < n; j++) {
                answer += result[i];
            }
        }


        return answer;
    }

    //순서쌍의 개수
    public int solution12(int n) {
        int answer = 0;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if((i*j) == n )
        //         {
        //             answer++;
        //         }
        //     }  
        // }

        for (int i = 1; i <= n; i++) {
            if(n%i == 0)
            {
                answer++;
            }
        }
        return answer;
    }


    //배열자르기
    public int[] solution13(int[] numbers, int num1, int num2) {
        int[] answer =  new int[numbers.length];


        //방법1
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1 );


        //방법2
        int[] answer2 =  new int[numbers.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            result.append(String.valueOf(numbers[i]));
        }
        int posistion =   result.indexOf(String.valueOf(num1));
        
        char[] test = result.substring(posistion +1 , num2 +1).toCharArray();
        
        for (int i = 0; i < test.length; i++) {
            answer2[i] = Character.getNumericValue(test[i]);  
        }
        return answer;
    }



    //모음제거
    public String solution14(String my_string) {
        String answer = my_string.replaceAll("[a,e,i,o,u]","");
        return answer;
    }


    //배열2배만들기
    public int[] solution15(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] =  numbers[i] * 2;
        }
        return answer;
    }

    //중앙값 구하기
    public int solution16(int[] array) {
        Arrays.sort(array);

        int answer = array[array.length / 2];
        return answer;
    }

    //숨어있는 숫자의 덧셈
    public int solution17(String my_string) {

        String test =  my_string.replaceAll("[^0-9]", "");
        int answer = 0;

        char[] test1 = test.toCharArray();

        for (int i = 0; i < test.length(); i++) {
            answer = answer + Character.getNumericValue(test1[i]);
        }
        

        return answer;
    }

    //짝수는 싫어요
    public int[] solution18(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        

        for (int i = 0; i <= n; i++) {
            if(i%2 == 1)
            {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    
    }

    //올알이
    public int solution19(String[] babbling) {
        int answer = 0;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < babbling.length; i++) {
          builder.append(babbling[i].replace("aya",""))  ;
            System.out.println(builder.toString());
        }
        return answer;
    }
}
