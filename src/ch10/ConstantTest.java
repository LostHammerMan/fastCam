package ch10;

public class ConstantTest {
    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;
        MIN_NUM = 0;
//        MAX_NUM = 20;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM); // 상수는 반드시 값 지정 필요
    }
}
