import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lv1 {
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

    //개인정보 수집 유효기간
    public int[] solution6(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        Map<String, Integer> termData = new HashMap<>();  //TERM DATA 저장
        Map<String, Integer> exData = new HashMap<>();  //TERM DATA 저장

        for (int i = 0; i < terms.length; i++) {
            String type = terms[i].split(" ")[0];
            int data = Integer.parseInt(terms[i].split(" ")[1]);
            termData.put(type, data);
        }

        System.out.println(termData.toString()); //TERM 데이터 출력
        
        return answer;
    }


}
