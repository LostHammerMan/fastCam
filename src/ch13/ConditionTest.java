package ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println("두 수를 입력 받아 더 큰 수 출력");

        Scanner scanner = new Scanner(System.in); // System.in : 표준 입력(콘솔창에서 입력) ,     System.out : 표준 출력

        System.out.println("입력 1: ");
        int num1 = scanner.nextInt();

        System.out.println("입력 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2)? num1 : num2;
        System.out.println(max);
    }
}
