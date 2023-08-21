import java.util.Arrays;

public class Lv2 {
    

    public Lv2() {

        System.out.println(solution("1 2 3 4") + "최대값 과 최소값");

        System.out.println(solution1("3people unFollowed me") + "JadenCase 문자열 만들기");
        
    }



    //최대값과 최소값
    public String solution(String s) {
        String answer = "";

        String[] sp = s.split(" ");

        int[] in = new int[sp.length];

        for (int i = 0; i < sp.length; i++) {
            in[i] = Integer.parseInt(sp[i]);
        }

        Arrays.sort(in);

        int max = in[in.length -1];
        int min = in[0];

        answer = min + " " +  max;
        
        return answer;
    }

    //JadenCase 문자열 만들기
    public String solution1(String s) {
        String answer = "";
        return answer;
    }

}
