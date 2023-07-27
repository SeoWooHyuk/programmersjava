import java.util.ArrayList;
import java.util.Scanner;

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







}
