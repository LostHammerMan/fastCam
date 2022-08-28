package ch10;

public class OperatorTest {
    public static void main(String[] args) {

        int gameScore = 150;

        int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore + 1;
        System.out.println(lastScore);
        System.out.println(gameScore);
        System.out.println("------------------------");
        int gameScore2 = 150;

        int lastScore2 = gameScore++; // 해당 statement 가 끝난 뒤 증가
        System.out.println(lastScore2);
        System.out.println(gameScore2);
    }
}
