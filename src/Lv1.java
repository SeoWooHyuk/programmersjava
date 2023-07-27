
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
        int check = 1;
        while(true)
        {
            if(n == (int)Math.pow(check, 2) )
            {
                answer = (int)Math.pow(check+1, 2);
                break;
            }

            if(check >= n)
            {
                answer = -1;
                break;
            }
            check++;
        }



        return answer;
    }

}
