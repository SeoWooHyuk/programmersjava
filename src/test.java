import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
    

    public test()
    {
        study1();
    }

    public void study1()
    {
        Scanner scanner = new Scanner(System.in);

        int st = 0;
        int test = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(;;)
        {
            System.out.print("정수를 입력하세요:");
            st =  scanner.nextInt();
            if (st == 0) {
                break;
            }
            list.add(st);
        }

    for (Integer integer : list) {
            st += integer;
    }

    System.out.println("합계는" +st+"입니다.평균은"+st/list.size());


    }



    //최빈값 구하기 빽업
    public int solution44(int[] array) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList();
        

        Set<Integer> uniqueArr = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniqueArr.add(array[i]);
            list.add(array[i]);
        }

        int[] result = new int[uniqueArr.size()];
        int index = 0;
        for (int value : uniqueArr) {
            result[index++] = value;
        }

        
        boolean hasDuplicates = list.stream().distinct().count() < list.size(); // 중복값 있는지 체크 

        ArrayList<Integer> list2 = new ArrayList(); //리스트에 있는 중복값이 몇개인지 체크해서 저장 중복되는 수 사이즈
        for (int i = 0; i < result.length; i++) {
    
            if(hasDuplicates)
            {
            
                list2.add(Collections.frequency(list, result[i]));  //객체가 몇번 등장했는지를 리턴해준다.
            }else
            {
                list2.add(result[i]);
            }
        
        
        }

    


        int max = Collections.max(list2);

        
        boolean check = true;
        
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == max && Collections.frequency(list2, max) > 1) {  // 중복값이 있는 경우 출력
                check = false;
                System.out.println("최대값 중복: " + max);
                break;
            }
        }

        if(check)
        {
            answer = max;
        }else{
            answer = -1;
        }
    

        return answer;
    }








}
