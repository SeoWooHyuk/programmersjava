import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lv0 {



    public Lv0()
    {
        System.out.println( solution1(40) + " |나이출력|");
        System.out.println( solution2(10,3) + " |양꼬치|");
        System.out.println( solution3(5500)[0] + "," +  solution3(5500)[1] + " |아이스아메리카노|");
        System.out.println( solution4(1234) + " |자리수더하기|");
        System.out.println( solution5(150000) + " |옷가게 할인 받기|");

        int[] dot = {2,-4};
        System.out.println( solution6(dot) + " |점의 위치 구하기|");

        System.out.println( solution7("BCBdbe","B") + " |특정 문자 제거하기|");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println( solution8(numbers) + " |최대값 만들기|");

        int[] array = {0, 2, 3, 4};
        System.out.println( solution9(array,1) + " |중복된 숫자 개수|");

        int[] array2 = {149, 180, 192, 170};
        System.out.println( solution10(array2,167) + " |머쓱이보다 키 큰사람|");

        System.out.println( solution11("hello",3) + " |문자 반복출력하기|");
        
        System.out.println( solution12(100) + " |순서 쌍의 개수|");

        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println( solution13(numbers2,1,3) + " |배열 자르기|");

        System.out.println( solution14("bus") + " |모음 제거|");

        int[] numbers3 = {1, 2, 100, -99, 1, 2, 3};
        System.out.println( solution15(numbers3) + " |배열 2배 만들기|");

        int[] array3 = {9, -1, 0};
        System.out.println( solution16(array3) + " |중앙값 만들기|");

        System.out.println( solution17("aAb1B2cC34oOp") + " |숨어있는 숫자의 덧셈|");

        System.out.println( solution18(10) + " |짝수는 싫어요|");

        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println( solution19(babbling) + " |옹알이|");

        System.out.println( solution20(4) + " |정수를 나선형으로 배치하기|");

        int[][]  dots = {{1,2},{2,1},{3,4},{4,5}};
        System.out.println( solution21(dots) + " |평행|"); //보류

        System.out.println( solution22("He11oWor1d","lloWorl",2) + " |문자열 겹쳐쓰기|");

        System.out.println( solution23("ab6CDE443fgh22iJKlmn1o","6CD") + " |문자열 안에 문자열|"); 

        System.out.println( solution24("aaaaa","bbbbb") + " |문자열 섞기|");

        System.out.println( solution25("8542") + " |문자열 정수로 변환하기|");

        System.out.println( solution26("banana","ana") + " |부분 문자열인지 확인하기|");


        System.out.println( solution27("He110W0r1d",5) + " |문자열 뒤 n글자|");

        System.out.println( solution28("ProgrammerS123",11) + " |문자열 앞 n글자|");


        System.out.println( solution29("ABBAA","AABB") + " |문자열 바꿔서 찾기|");


        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println( solution30(strArr) + " |배열에서 문자열 대소문자 바꾸기|");

        String[] str_list = {"abc", "def", "ghi"};
        System.out.println( solution31(str_list,"ef") + " |꼬리 문자열|");

        int[] index_list ={16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println( solution32("cvsgiorszzzmrpaqpe",index_list) + " |글자 이어붙여 문자열 만들기|");

        System.out.println( solution33("AbCdEfG","aBc") + " |원하는 문자열 찾기|");

        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4},{1,2},{3,5},{7,7}};
        System.out.println( solution34(my_strings,parts) + " |부분문자열 이어붙인 문자열 만들기|");

        System.out.println( solution35(3,10) + " |카운트 업|");

        System.out.println( solution36("hi12392") + " |카운트 업|");

        System.out.println( solution37(69.32) + " |정수 부분|");

        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println( solution38(arr,3) + " |조건에 맞게 수열 변환하기3|");

        int[] num_list = {5, 2, 1, 7, 5};
        System.out.println( solution39(arr,3) + " |n번째 원소까지|");


        System.out.println( solution40(3,12) + " |연속된 수의 합|");

        //분수의 합 보류
        System.out.println( solution41(3,12,6,5) + " |분수의 합|");

        int[] common = {2,4,8};
        System.out.println( solution42(common) + " |다음에 올 숫자|");

    }



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


        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "0");
            babbling[i] = babbling[i].replace("woo", "0");
            babbling[i] = babbling[i].replace("ye", "0");
            babbling[i] = babbling[i].replace("ma", "0");
            babbling[i] = babbling[i].replace("0", "");
            if(babbling[i].equals("")) answer++;
        }

        //공부하자 
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }

        
        return answer;
    }

    //정수를 나선형으로 배치하기 
    public int[][] solution20(int n) {
        int[][] answer = new int[n][n];
        int value = 1; // 채워야 할 정수 값
        int row = 0; // 현재 행 위치
        int col = 0; // 현재 열 위치
        int direction = 0; // 이동 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

        while (value <= n * n) { // 모든 정수 값을 배열에 채우면 종료
            answer[row][col] = value++; // 현재 위치에 값을 채우고 다음 값으로 이동
            System.out.println(row + " " + col);
            // 다음 이동할 위치 계산
            if (direction == 0) { // 오른쪽 방향으로 이동
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                    System.out.println("아래방향이동");
                } else {
                    col++;
                }
            
            } else if (direction == 1) { // 아래쪽 방향으로 이동
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                    System.out.println("왼쪽방향이동");
                } else {
                    row++;
                }
            } else if (direction == 2) { // 왼쪽 방향으로 이동
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                    System.out.println("위방향이동");
                } else {
                    col--;
                }
            } else if (direction == 3) { // 위쪽 방향으로 이동
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                    System.out.println("오른쪽방향이동");
                } else {
                    row--;
                }
            }
        }


        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                System.out.print(answer[i][j]+",");
            }
            System.out.println();
        }


        return answer;
    }

    //평행
    public int solution21(int[][] dots) { //보류
        int answer = 0;

        ArrayList<Double> list = new ArrayList<Double>();

        loop1:
        for (int i = 0; i < dots.length; i++) {

            
            for (int j = i; j < dots.length; j++) {

                double tmp =  (double)(dots[i][1]-dots[j][1])/dots[i][0]-dots[j][0];
          
                // if(list.contains(tmp))
                // {
                //     answer = 1;
                //     break loop1;
                // }

                list.add(tmp);
            
                
            }
        }

        for (Double double1 : list) {
            System.out.println(double1);
        }


        
    //     int a = 0;
    //     int a_1 = 0;
    //     int b = 0;
    //     int b_1 = 0;
    // for (int i = dots.length-1; i >= 0; i--) {
    //     if(i%2==0)
    //     {
    //         a =  dots[i][0] - a;
    //         a_1 = dots[i][1] -  a_1;
    //     }else
    //     {
    //         b =   dots[i][0] - b;
    //         b_1 =   dots[i][1] - b;
    //     }
    // }

    // if(Math.abs(a) == Math.abs(b) && Math.abs(a_1) == Math.abs(b_1))
    // {
    //     answer = 1;
    // }else{
    //     answer = 0;
    // }

    // System.out.println(Math.abs(a) + ":" + Math.abs(b) );
    // System.out.println(Math.abs(a_1) + ":" + Math.abs(b_1) );


        return answer;

    }

    //문자열 덮어쓰기
    public String solution22(String my_string, String overwrite_string, int s) {
        String answer = "";
        System.out.println(my_string);
        answer = my_string.substring(0,2);
        System.out.println(answer);
        answer = answer + overwrite_string;
        System.out.println(answer);
        answer = answer + my_string.substring(s+overwrite_string.length() ,my_string.length() );
        return answer;
    }

    //문자열 안에 문자열
    public int solution23(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2))
        {
            answer = 1;
        }else
        {
            answer =  2;
        }

        return answer;
    }

    //문자열 섞기
    public String solution24(String str1, String str2) {
        String answer = "";

        
        char[] a =  str1.toCharArray();
        char[] b =  str2.toCharArray();


        for (int i = 0; i < b.length; i++) {
            answer += String.valueOf(a[i]) + String.valueOf(b[i]); 
            
        }

        System.out.println(answer);


        // StringBuilder builder = new StringBuilder(answer);

        // for (int i = 0; i < b.length; i++) {
        //     builder.append(a[i]);
        //     builder.append(b[i]);
        // }
        // System.out.println(builder.toString());

        // for(int i = 0; i < str1.length() ; i++)
        // {
        //     answer =  answer + str1.substring(i,i+1);
        //     answer = answer + str2.substring(i,i+1);

        // }
        return answer;
    }



    //문자열을 정수로 변환하기
    public int solution25(String n_str) {
        int answer = Integer.valueOf(n_str);
        return answer;
    }

    //부분 문자열인지 확인하기
    public int solution26(String my_string, String target) {
        int answer = my_string.contains(target) ? 1 : 0 ;

        return answer;
    }

     //문자열의 뒤의 n글자
    public String solution27(String my_string, int n) {
        String answer = "";

        int a =  my_string.length() - n;

        answer = my_string.substring(a);

        return answer;
    }

    //문자열의 앞의 n글자
    public String solution28(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    //문자열 바꿔서 찾기
    public int solution29(String myString, String pat) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < myString.length(); i++) {

            if (myString.substring(i, i+1).equals("A")) {
                str += "B";
            }else
            {
                str += "A";
            }
        
        }

        answer = str.contains(pat) ? 1 : 0;
        return answer;
    }

    //배열에서 문자열 대소문자 변환하기
    public String[] solution30(String[] strArr) {
        String[] answer = new String[strArr.length];


        for (int i = 0; i < strArr.length; i++) {

            answer[i]  =  i%2==0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();

        }
        return answer;
    }

    //꼬리 문자열
    public String solution31(String[] str_list, String ex) {
        String answer = "";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].contains(ex))
            {
                builder.append("");
            }else
            {
                builder.append(str_list[i]);
            }
        }

        answer = builder.toString();

        return answer;
    }

    //글자 이어 붙여 문자열 만들기
    public String solution32(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            builder.append(my_string.substring(index_list[i], index_list[i]+1));
        }

        answer = builder.toString();
        return answer;
    }

    //원하는 문자열 찾기
    public int solution33(String myString, String pat) {
        int answer = 0;

        if(myString.toLowerCase().contains(pat.toLowerCase()))
        {
            answer = 1;
        }

        return answer;
    }

    //부분 문자열 이어 붙여 문자열 만들기
    public String solution34(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < parts.length; i++){
            // System.out.println(parts[i][0]);
            // System.out.println(parts[i][1]);

        answer +=  my_strings[i].substring(parts[i][0], parts[i][1]+1);


        }
        return answer;
    }

    //카운트 업
    public int[] solution35(int start, int end) {
        int[] answer = new int[end - start +1];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);

        }

        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        

        return answer;
    }

    //문자열 정렬하기 (1)
    public int[] solution36(String my_string) {


        String num = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[num.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(num.substring(i, i+1));
        }

        Arrays.sort(answer);
        

        return answer;
    }

    //정수 부분
    public int solution37(double flo) {
        int answer = (int)flo;
        return answer;
    }

    //조건에 맞게 수열 변환하기 3
    public int[] solution38(int[] arr, int k) {

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(k%2 ==0 )
            {
                answer[i] = arr[i] + k;
            }else{
                answer[i] = arr[i] * k;
            }
        }

    
        return answer;
    }


    //n 번째 원소까지
    public int[] solution39(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }

    //연속된 수의 합
    public int[] solution40(int num, int total) {
        int[] answer = new int[num];

        int start = (total/num) - ((num - 1)/2);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start++;
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }

    //분수의 덧셈
    public int[] solution41(int numer1, int denom1, int numer2, int denom2) { //보류
        int[] answer = {};
        int a = 0;
        int b = 0;
        if (denom1 != denom2) {
            
        }
        return answer;
    }


    //다음에 올숫자
    public int solution42(int[] common) {
        int answer = 0;

        int a = common[2] - common[1];

    
        int b = 0;

        for (int i = 0; i < common.length-1; i++) {
            if(common[i] == 0)
            {
                continue;
            }
            
            b = common[i+1] / common[i];
            
        }
    
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = a + common[common.length-1];
        }else{
            answer = b * common[common.length-1];
        }
    
        return answer ;
    }


}

