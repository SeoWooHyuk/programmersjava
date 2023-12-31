import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lv1 {


    public Lv1()
    {
        System.out.println( solution(3) + " |짝수와 홀수|");

        System.out.println( solution1(10) + " |나머지가 1의 되는 수 찾기|");

        System.out.println( solution2("1234") + " |문자열을 정수로 바꾸기|");

        System.out.println( solution3(121) + " |정수 제곱근 판멸|");

        System.out.println( solution4(118372) + " |정수 내림차순 정렬하기|");

        System.out.println( solution5(11) + " |하샤드 수|");

        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println( solution6("2022.05.19",terms,privacies) + " |개인정보 수집기간 유효기간1|");

        System.out.println( solution6_1("2022.05.19",terms,privacies) + " |개인정보 수집기간 유효기간2|");

        System.out.println( solution7(5,3) + " |두 정수의 합|");

        System.out.println( solution8(626331) + " |콜라츠 츠축|");

        String[] seoul = {"Jane", "Kim"};
        System.out.println( solution9(seoul) + " |서울에서 김서방 찾기|");

        int[] arr = {3,2,6};
        System.out.println( solution10(arr,10) + " |나누어 떨어지는 숫자배열|");

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println( solution11(absolutes,signs) + " |음양 더하기|");

        System.out.println( solution12("01033334444") + " |핸드폰 번호가리기|");
    }

    //짝수와 홀수
    public String solution(int num) {
        String answer = "";

        answer = (num%2 == 0) ? "Even":"Odd";

        return answer;
    }

    //나머지가 1이 되는 수찾기
    public int solution1(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
        answer++;
        if(n % i == 1)
        {
            break;
        }
        }
        return answer;
    }

    //문자열을 정수로 바꾸기
    public int solution2(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);
        return answer;
    }

    //정수 제곱근 판별
    public long solution3(long n) {
        long answer = 0;

        //방법1 시간초과 정답 실패
        // int check = 1;
        // while(true)
        // {
        //     if(n == (int)Math.pow(check, 2) )
        //     {
        //         answer = (int)Math.pow(check+1, 2);
        //         break;
        //     }

        //     if(check >= n)
        //     {
        //         answer = -1;
        //         break;
        //     }
        //     check++;
        // }

        //방법2 이것은 그냥 실페
        // Double check = Math.sqrt(n);
        // String numStr = Double.toString(check).trim();
        // int decimalIdx = numStr.indexOf(".");

        // // String decimalPart = numStr.substring(decimalIdx + 1,3);

        // // Double decimalPart =  Double.parseDouble(numStr.substring(decimalIdx));

        // int decimalPart = Integer.parseInt(numStr.substring(decimalIdx + 1,decimalIdx+2));
        // if(decimalPart == 0)
        // {
        //     answer = (int)Math.pow(check+1, 2);
        // }else{
        //     answer = -1;
        // }


        //방법3

        long sq = (long)Math.sqrt(n);
        long po = (long)Math.pow(sq, 2);
        answer = (po == n) ?  (long)Math.pow(sq +1 , 2) : -1;

        return answer;
    }


    //정수 내림차순으로 배치하기
    public long solution4(long n) {
        long answer = 0;

        String st = String.valueOf(n);
        char[] ch = st.toCharArray();
        Arrays.sort(ch);

        StringBuilder builder = new StringBuilder(String.valueOf(ch));

        answer = Long.parseLong(builder.reverse().toString());

        return answer;
    }

    //하샤드 수
    public boolean solution5(int x) {
        boolean answer = true;
        String st = String.valueOf(x);
        int[] num = new int[st.length()];
        int ressultnum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.substring(i, i+1));
            ressultnum +=  num[i];
        }

        if (x%ressultnum != 0) {
            answer = false;
        }
        return answer;
    }

    //개인정보 수집 유효기간1
    public int[] solution6(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> termData = new HashMap<>();  //terms DATA 저장
        int tday =  Integer.parseInt(today.replace(".", "")); //오늘날짜

        for (int i = 0; i < terms.length; i++) {
            String type = terms[i].split(" ")[0];
            int data = Integer.parseInt(terms[i].split(" ")[1]);
            termData.put(type, data);
        }

        System.out.println(termData);

        for (int i = 0; i < privacies.length; i++) {
            int date =  Integer.parseInt(privacies[i].replace(".","").split(" ")[0])  ;
            String type = privacies[i].split(" ")[1];

            int year =  date/10000;
            int month = (date%1000)/100;
            int day = date%100;

             // 기본 연산
             month += termData.get(type); // 월수 더하기
             day -= 1; // 일수 -1 (28일 > 27일)

            if(day == 0) {
                // 만약 일수를 뺀 탓에 0이 되었으면 말일(28)로 변경
                month -= 1;
                day += 28;
            }
            if(month > 12) {
                // 12월을 넘어갔으면 햇수 증가
                year += (month/12);
                month = month - 12*(month/12);
            }
            if(month == 0) {
                // 위 과정에서 month가 0이 되었으면 직전해 12월로 변경
                month = 12;
                year -= 1;
            }
            System.out.println(date + ":" + termData.get(type));
            date = year*10000 + month*100 + day;
            System.out.println(date + ":" + tday);
            if(date < tday) {
                answer.add(i);
            }

        }

        // 정답 추출
        int[] answerArr = new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {

        answerArr[i] = answer.get(i)+1;
        System.out.print(answerArr[i]);
        }

        
        return answerArr;
    }



    //개인정보 수집 유효기간2
    public int[] solution6_1(String today, String[] terms, String[] privacies)  {
        int[] answer = {};

        Map<String, Integer> termData = new HashMap<>();  //terms DATA 저장

        for (int i = 0; i < terms.length; i++) {
            String type = terms[i].split(" ")[0];
            int data = Integer.parseInt(terms[i].split(" ")[1]);
            termData.put(type, data);
        }

        int tday =  Integer.parseInt(today.replace(".", "")); //오늘날짜
        Date dt ;
        for (int i = 0; i < privacies.length; i++) {
            String date =  privacies[i].replace(".","").split(" ")[0]  ;
            String type = privacies[i].split(" ")[1];

        
            SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
            Calendar cal = Calendar.getInstance();

            try {
                dt = dtFormat.parse(date);
                cal.setTime(dt);
            } catch (Exception e) {
                // TODO: handle exception
            }

            
            // cal.add(Calendar.YEAR,  year); //년
            cal.add(Calendar.MONTH, termData.get(type)); //월
            // cal.add(Calendar.DATE,  28 * termData.get(type)); //일

            int date2 = Integer.parseInt(dtFormat.format(cal.getTime()));
            System.out.println(tday + ":" + date2 );

            if(tday > date2)
            {
                System.out.println("유효기간 지남");
            }else{
                System.out.println("유효기간 안지남");
            }

        }
        
        return answer;
    }


    //두 정수 사이의 합
    public long solution7(int a, int b) {
        long answer = 0;

        int[] test = new int[2];
        test[0] = a;
        test[1] = b;

        // Arrays.sort(test);

        for (int i = 0; i < test.length; i++) { //선택정렬
            for (int j = i+1; j < test.length; j++) {
                if(test[i] > test[j]) //오름차순
                {
                int temp = test[i];
                test[i] = test[j];
                test[j] = temp;
                }
            }
        }



        for (int i = test[0]; i <= test[1]; i++) {
            answer += i;
        }

        return answer;
    }



    //콜라츠 추측
    public int solution8(int num) {
        int answer = 0;
        int count = 0;

        long  num1 = num;
        if(num == 1)
        {
            
        }else{
            while (true) {
            if(num1 % 2 == 0)
            {
                num1 /= 2;
            }else
            {
                num1 = (num1*3)+1;
            }

            if(num1 == 1 )
            {
                count = count +1;
                break;
            }

            if(count == 500)
            {
                count = -1;
                break;
            }

            count++;

        }
        }
        

        answer = count;
        return answer;
    }


    //서울 에서 김서방 찾기
    public String solution9(String[] seoul) {
        String answer = "";
        int i;
        for (i = 0; i < seoul.length; i++) {
            if(seoul[i].contains("Kim"))
            {
                break;
            }
        }

        answer = "김서방은 "+i+"에 있다";
        return answer;
    }

    //나누어 떨어지는 숫자 배열
    public int[] solution10(int[] arr, int divisor) {
        
        
        ArrayList<Integer> list = new ArrayList();
        int count =0;
        for (int i = 0; i < arr.length;  i++) {
            
            if(arr[i] % divisor == 0)
            {
                list.add(arr[i]);
                count++;
            }
        }

        if(count == 0)
        {
            list.add(-1);
        }


        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    //음양더하기
    public int solution11(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if(signs[i])
            {
                answer += absolutes[i];
            }else
            {
                answer += (absolutes[i])*-1;
            }
        }

        return answer;
    }

    //핸드폰 번호 가리기
    public String solution12(String phone_number) {
        String answer = "";


        String a = phone_number.substring(phone_number.length()-4,phone_number.length() );
        String b = phone_number.substring(0,phone_number.length()-4 ).replaceAll("[0-9]", "*");
        answer = b+a;

        phone_number.replaceAll(".(?=.{4})", "*"); //정규식만 사용
        

        return answer;
    }

    //없는 숫자 더하기
    public int solution(int[] numbers) {
        int answer = -1;
        return answer;
    }
}
