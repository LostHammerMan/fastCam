package ch21;

public class ContinueTest {
    public static void main(String[] args) {
        int num;

        // 1 ~ 100 , 3의 배수 출력
        for(num=1; num <= 100 ; num++){

            // 나머지가 0이 아닌 경우 continue --> 다시 제어를 반복문으로
            if ((num % 3) != 0) continue;
            System.out.println(num);
        }
    }
}
